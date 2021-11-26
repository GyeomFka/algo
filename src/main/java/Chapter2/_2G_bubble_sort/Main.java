package Chapter2._2G_bubble_sort;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static Random ran = new Random();

    public static void main(String[] args) {

        int num = Main.ran.nextInt(40);

        System.out.println(num);


        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(new int[]{-1, -2, -3, -4, -5, -6});
    }
}
