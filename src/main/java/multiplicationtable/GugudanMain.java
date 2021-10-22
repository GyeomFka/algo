package multiplicationtable;

public class GugudanMain {
    public static void main(String[] args) {
        for(int i = 2; i < 10; i++) {
            int[] result = MultipleArray.calculate(i);
            MultipleArray.printResult(result);
        }
    }
}
