package RA_Secssion2_BT8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;

        while (true) {
            System.out.println("Nhập ba cạnh của tam giác:");
            System.out.print("Nhập cạnh a: ");
            a = scanner.nextDouble();
            System.out.print("Nhập cạnh b: ");
            b = scanner.nextDouble();
            System.out.print("Nhập cạnh c: ");
            c = scanner.nextDouble();

            if (isValidTriangle(a, b, c)) {
                double chuVi = a + b + c;
                double p = chuVi / 2;
                double dienTich = Math.sqrt(p * (p - a) * (p - b) * (p - c));

                System.out.println("Chu vi của tam giác là: " + chuVi);
                System.out.println("Diện tích của tam giác là: " + dienTich);
                break;
            } else {
                System.out.println("Ba cạnh không tạo thành tam giác. Vui lòng nhập lại.");
            }
        }

        scanner.close();
    }

    public static boolean isValidTriangle(double a, double b, double c) {
        return a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a);
    }
}
