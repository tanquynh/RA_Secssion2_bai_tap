
package RA_Secssion2_BT4;

public class Main{
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        System.out.print("20 số nguyên tố đầu tiên là ");
        while(count <20) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count += 1;
            }
            num++;
        }
    }
    public static boolean isPrime(int num) {
        if(num <=1) {
            return false;
        }
        if(num <=3) {
            return true;
        }
        int sqrtNum = (int) Math.sqrt(num);
        for(int i = 2; i <= sqrtNum; i++ ) {
            if(num % i == 0) {
                return false;
            }
        } return true;

    }

}
