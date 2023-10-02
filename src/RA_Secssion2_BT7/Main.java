package RA_Secssion2_BT7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------MENU --------");
        System.out.println("Chọn 1: Tính chu vi và diện tích hình tròn");
        System.out.println("Chọn 2: Tính chu vi và diện tích tam giác");
        System.out.println("Chọn 3: Tính chu vi và diện tích hình chữ nhật");
        System.out.println("Chọn 4: Thoát");
        System.out.println("Nhập lựa chọn của bạn: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Nhập bán kính hình tròn:");
                float radius = scanner.nextFloat();
                if (radius <= 0) {
                    System.out.println("Bán kính không hợp lệ");
                    break;
                }
                double areaCenter = 3.14 * radius * radius;
                double perimeterCenter = 2 * 3.14 * radius;
                System.out.println("Diện tích hình tròn là: " + areaCenter);
                System.out.println("Chu vi hình tròn là: " + perimeterCenter);
                break;

            case 2:
                System.out.println("Nhập cạnh thứ nhất của tam giác:");
                float a = scanner.nextFloat();
                System.out.println("Nhập cạnh thứ hai của tam giác:");
                float b = scanner.nextFloat();
                System.out.println("Nhập cạnh thứ ba của tam giác:");
                float c = scanner.nextFloat();
                if (a + b > c && a + c > b && b + c > a) {
                    float perimeterTriangle = a + b + c;
                    double p = perimeterTriangle / 2.0;
                    double areaTriangle = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                    System.out.println("Chu vi tam giác: " + perimeterTriangle);
                    System.out.println("Diện tích tam giác: " + areaTriangle);
                } else {
                    System.out.println("Ba cạnh vừa nhập không tạo thành tam giác");
                }
                break;

            case 3:
                System.out.println("Nhập chiều dài hình chữ nhật:");
                float height = scanner.nextFloat();
                System.out.println("Nhập chiều rộng hình chữ nhật:");
                float width = scanner.nextFloat();
                if (height <= 0 || width <= 0) {
                    System.out.println("Kích thước không hợp lệ");
                    break;
                }
                double areaRectangle = width * height;
                double perimeterRectangle = 2 * (width + height);
                System.out.println("Chu vi hình chữ nhật là: " + perimeterRectangle);
                System.out.println("Diện tích hình chữ nhật là: " + areaRectangle);
                break;

            case 4:
                System.out.println("Thoát");
                break;

            default:
                System.out.println("Lựa chọn của bạn không hợp lệ");
                break;
        }
    }
}
