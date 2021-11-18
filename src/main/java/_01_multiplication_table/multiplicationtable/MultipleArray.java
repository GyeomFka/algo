package _01_multiplication_table.multiplicationtable;

public class MultipleArray {

    public static void printResult(int[] result) {
        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] calculate(int times) {
        int[] result = new int[9];
        for(int i = 0; i < result.length; i++) {
            result[i] = times * (i + 1);
        }
        return result;
    }
}