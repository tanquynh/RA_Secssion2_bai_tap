package RA_Secssion2_BT1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hạng đầu");
        int a = scanner.nextInt();
        System.out.println("Nhập số hạng cuối");
        int b = scanner.nextInt();
        int sumNum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0){
                sumNum += i;
            }
        }
        System.out.println("Tổng các số trẵn trong khoảng từ " + a + " đến " + b + " là " + sumNum);
    }
}
