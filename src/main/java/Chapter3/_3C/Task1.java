package Chapter3._3C;

public class Task1 {

    public static void main(String[] args) {

        final char START_VALUE = Character.MIN_VALUE;
        final char END_VALUE = Character.MAX_VALUE;

        final char FIRST_NAME = '김';
        final char SECOND_NAME = '용';
        final char THIRD_NAME = '환';

        for (int i = START_VALUE; i <= END_VALUE; i++) {
            if (i == FIRST_NAME || i == SECOND_NAME) {
                System.out.print((char)i + " : ");
                System.out.format("0x%04X%n", i);
            } else if (i == THIRD_NAME) {
                System.out.print((char)i + " : ");
                System.out.format("0x%04X%n", i);
                break;
            }
        }

    }
}
