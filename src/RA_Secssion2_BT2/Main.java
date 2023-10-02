package RA_Secssion2_BT2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------MENU ---------");
        System.out.println("Chọn 1 : In hình chữ nhật; ");
        System.out.println("Chọn 2 : In hình tam giá vuông có cạnh góc vuông bên phải phía dưới");
        System.out.println("Chọn 3 : In hình tam giá vuông có cạnh góc vuông bên trên phía trên");
        System.out.println("Chọn 4 : Thoát");
        System.out.println("Nhập  lựa chọn của bạn");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Nhập cạnh dài");
                int canhDai = scanner.nextInt();
                System.out.println("Nhập cạnh ngắn");
                int canhNgan = scanner.nextInt();
                for(int i = 1; i <= canhNgan; i++) {
                    for(int j = 1; j <= canhDai; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            case 2:
                System.out.println("Nhập cạnh góc vuông tam giác");
                int cgv = scanner.nextInt();
                for(int m =1; m <= cgv; m++) {
                    for(int n = 1; n <= m; n++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            case 3:
                System.out.println("Nhập cạnh góc vuông tam giác");
                int cgv1 = scanner.nextInt();
                for(int m =cgv1; m >= 1; m--) {
                    for(int n = 1; n <= m; n++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            default:
                System.out.println("Lựa chọn không hợp lệ");
        }
    }
}
