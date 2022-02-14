package ㄴㄷㅂ;

public class BubbleSort {

	/**
	 * 옆에있는 값과 비교해서 더 작은 값을 앞으로 보낸다.
	 */
	public static void main(String[] args) {
		int[] array = {2, 10, 5, 8, 7, 6, 4, 3, 1, 9};

		for (int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length - (i+1); j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j+1] = temp;
				}
			}
		}

		for (int solution : array)
			System.out.print(solution + " ");
	}
}
