package 코딩몬스터.Chapter2._2I_straight_run;

public class Main {

    public static boolean isConsecutive(int[] data, int n) {
        int maximum = data[0];
        int minimum = data[0];

        for(int i = 0; i < n; i++) {
            if(maximum < data[i]) {
                maximum = data[i];
            }

            if(minimum > data[i]) {
                minimum = data[i];
            }
        }
        return false;
    }


    public boolean isStraighted(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
			boolean isNy = data[i + 1] != data[i] + 1;
			if(isNy) {
                return false;
            }
        }
        return true;
    }



}
