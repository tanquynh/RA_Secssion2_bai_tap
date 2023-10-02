package RA_Secssion2_BT6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------MENU --------");
        System.out.println("Chọn 1: Kiểm tra tính chẵn lẽ của một số");
        System.out.println("Chọn 2: Kiểm tra số nguyên tố");
        System.out.println("Chọn 3: Kiểm tra 1 số có chia hết cho 3 không");
        System.out.println("Chọn 4: Thoát");
        System.out.println("Nhập lựa chọn của bạn: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Nhập số cần kiểm tra: ");
                int checkNumber = scanner.nextInt();
                if (checkNumber % 2 == 0) {
                    System.out.println(checkNumber + " là số chẵn");
                } else {
                    System.out.println(checkNumber + " là số lẻ");
                }
                break; // Thêm break để kết thúc case 1.

            case 2:
                System.out.println("Nhập số cần kiểm tra: ");
                int isPrime = scanner.nextInt();
                boolean isPrimeFlag = true; // Biến kiểm tra số nguyên tố.

                if (isPrime < 2) {
                    isPrimeFlag = false;
                } else {
                    for (int i = 2; i <= Math.sqrt(isPrime); i++) {
                        if (isPrime % i == 0) {
                            isPrimeFlag = false;
                            break; // Nếu tìm thấy ước số thì thoát khỏi vòng lặp.
                        }
                    }
                }

                if (isPrimeFlag) {
                    System.out.println(isPrime + " là số nguyên tố");
                } else {
                    System.out.println(isPrime + " không phải là số nguyên tố");
                }
                break; // Thêm break để kết thúc case 2.

            case 3:
                System.out.println("Nhập số cần kiểm tra: ");
                int num = scanner.nextInt();
                if (num % 3 == 0) {
                    System.out.println(num + " chia hết cho 3");
                } else {
                    System.out.println(num + " không chia hết cho 3");
                }
                break; // Thêm break để kết thúc case 3.

            default:
                System.out.println("Lựa chọn không hợp lệ");
        }
    }
}
