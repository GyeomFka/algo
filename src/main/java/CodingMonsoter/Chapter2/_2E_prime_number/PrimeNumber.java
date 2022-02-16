package CodingMonsoter.Chapter2._2E_prime_number;

import java.util.Scanner;

public class PrimeNumber {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("수 입력 → ");
        int primeNumber = scan.nextInt();

        System.out.println(validate(primeNumber));
    }

    static public boolean validate(int number) {
        for(int i = 2; i <= number; i++) {
            if(i != number && number%i == 0) {
                return false;
            }
        }
        return true;
    }

}
