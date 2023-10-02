package RA_Secssion2_BT5;

public class Main {
    public static void main(String[] args) {
        int N = 1;
        while (true) {
            if (N % 3 == 0 && N % 5 == 0 && N % 11 == 0) {
                System.out.println("Số nhỏ nhất chia hết cho 3, 5, 11 là : " + N);
                break;
            }
            N++;
        }
    }
}
