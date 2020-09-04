package sort;

import java.util.Arrays;

public class BubbleSortDemo {

	public static void main(String[] args) {
		int[] numbers={3,5,2,56,23,84,1,4};
		BubbleSortDemo.bubbleSort(numbers);
	}

	public static void bubbleSort(int[] numbers) {
		int temp; // 记录临时中间值
		int size = numbers.length; // 数组大小
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				if (numbers[i] < numbers[j]) { // 交换两数的位置
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(i+"="+numbers[i]);
		}
	}
}
