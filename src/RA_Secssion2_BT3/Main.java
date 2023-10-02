package RA_Secssion2_BT3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là : ");
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + ", ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num < 4) {
            return true;
        }

        if (num % 2 == 0) {
            return false; // Số chẵn không phải là số nguyên tố, ngoại trừ 2.
        }

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
