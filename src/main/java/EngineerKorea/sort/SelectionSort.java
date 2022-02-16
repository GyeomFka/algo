package EngineerKorea.sort;

public class SelectionSort {

	/**
	 * 작은것을 앞으로 보낸다
	 */
	public static void main(String[] args) {
		int[] array = {2, 5, 1, 8, 7, 6, 4, 3, 10, 9};

		for(int i = 0; i < array.length; i++) {
			for(int j = i+1; j < array.length; j++) {
				if(array[i] > array[j]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}

		for (int solution : array) {
			System.out.print(solution + " ");
		}

	}
}
