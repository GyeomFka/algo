package EngineerKorea.sort;

public class InsertionSort {
	/**
	 * 각 숫자를 적절한 위치에 삽입한다. -> 필요할 때만
	 */
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 8, 7, 6, 4, 3, 10, 9};

		for (int a : array) {
			System.out.print(a + " ");
		}

		for (int i = 0; i < array.length - 1; i++) {
			while (array[i] > array[i+1]) {
				int temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;
				i--;
			}
		}

		System.out.println(" ");

		for (int a : array) {
			System.out.print(a + " ");
		}

	}
}
