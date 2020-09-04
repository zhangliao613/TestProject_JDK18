package sort;

import java.util.Arrays;

public class QuickSortDemo {

	public static void main(String[] args) {
		int[] numbers = { 3, 5, 2, 56, 23, 84, 1, 4 };
		QuickSortDemo.quickSort(numbers, 0, numbers.length-1);
	}

	public static void quickSort(int[] numbers, int start, int end) {
		if (start < end) {
			int base = numbers[start]; // 选定的基准值（第一个数值作为基准值）
			int temp; // 记录临时中间值
			int i = start, j = end;
			do {
				while ((numbers[i] < base) && (i < end))
					i++;
				while ((numbers[j] > base) && (j > start))
					j--;
				if (i <= j) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
					i++;
					j--;
				}
			} while (i <= j);
			if (start < j)
				quickSort(numbers, start, j);
			if (end > i)
				quickSort(numbers, i, end);
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(i+"="+numbers[i]);
		}
	}
}
