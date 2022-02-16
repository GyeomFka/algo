package EngineerKorea.sort;

public class SelectionSort_En {
	private static void selectionSort(int[] arr) {
		selectionSort(arr, 0);
	}

	private static void selectionSort(int[] arr, int start) {
		if (start < arr.length - 1) {
			int minIndex = start;
			for (int i = start; i < arr.length; i++) {
				if (arr[i] < arr[minIndex]) minIndex = i;
			}
			swap(arr, start, minIndex);
			selectionSort(arr, start + 1);
		}
	}

	private static void swap(int[] arr, int start, int minIndex) {
		int tmp = arr[start];
		arr[start] = arr[minIndex];
		arr[minIndex] = tmp;
	}
}
