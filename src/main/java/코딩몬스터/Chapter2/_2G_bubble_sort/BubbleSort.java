package 코딩몬스터.Chapter2._2G_bubble_sort;

public class BubbleSort {

    public void bubbleSort(int[] data) {
        while (!isSorted(data)) {
            switchElement(data);
        }
        print(data);
    }

    public void switchElement(int[] data) {
        for(int i = 0; i < data.length-1; i++) {
            if (data[i] > data[i+1]) {
                int temp = data[i];
                data[i] = data[i+1];
                data[i+1] = temp;
            }
        }
    }

    public boolean isSorted(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] > data[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private void print(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ", ");
        }
    }
}