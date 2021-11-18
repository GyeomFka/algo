package _01_multiplication_table.multiplicationtable;

import java.util.Scanner;

public class MultiplicationTable {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("입력 : ");
        int inputNumber = SCANNER.nextInt();

        if(inputNumber < 2) {
            System.out.println("1보다 커야 합니다.");
        } else if (inputNumber > 9) {
            System.out.println("10보다 작아야 합니다.");
        } else {
            for(int i = 1; i <= 9; i++) {
                System.out.println(inputNumber * i);
            }
        }
    }
}