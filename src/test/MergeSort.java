package test;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

		int[] a = new int[] { 3, 5, 3, 1, 9, 3, 0, 5, 3, 2 };

		mergeSort(a, 0, a.length-1);

		System.out.println(Arrays.toString(a));

	}

	private static void mergeSort(int[] array, int start, int end) {

		if (start < end) {
			int mid = (end + start) / 2;
			mergeSort(array, start, mid);
			mergeSort(array, mid + 1, end);
			merge(array, start, mid, end);
		}
	}

	private static void merge(int[] array, int start, int mid, int end) {
		int i = start, j = mid + 1, k = 0;
		int[] temp = new int[end - start + 1];

		while (i <= mid && j <= end) {
			if (array[i] > array[j])
				temp[k++] = array[j++];
			else
				temp[k++] = array[i++];
		}

		while (i <= mid)
			temp[k++] = array[i++];
		while (j <= end)
			temp[k++] = array[j++];

		for (i = start; i <= end; i++)
			array[i] = temp[i - start];

		System.out.println("--" + Arrays.toString(temp));

	}
}
