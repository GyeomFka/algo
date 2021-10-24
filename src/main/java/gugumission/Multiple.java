package gugumission;

public class Multiple {

    public static void main(String[] args) {
        printByTimes(19);
    }

    public static void print(int times, int untilTimes) {
        System.out.println(times + "단 출력 ");
        for(int i = 1; i <= untilTimes; i++) {
            System.out.println(times * i);
        }
    }

    public static void printByTimes(int untilTimes) {
        for(int i = 1; i <= untilTimes; i++) {
            print(i, untilTimes);
            System.out.println(" ");
        }
    }

}
