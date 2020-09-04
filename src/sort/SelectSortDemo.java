package sort;

import java.util.Arrays;

public class SelectSortDemo {

	public static void main(String[] args) {
		int[] numbers={3,5,2,56,23,84,1,4};
		SelectSortDemo.selectSort(numbers);
	}

	public static void selectSort(int[] numbers) {   
	    int size = numbers.length, temp;   
	    for (int i = 0; i < size; i++) {   
	        int k = i;   
	        for (int j = size - 1; j >i; j--)  {   
	            if (numbers[j] < numbers[k])  k = j;   
	        }   
	        temp = numbers[i];   
	        numbers[i] = numbers[k];   
	        numbers[k] = temp;   
	    }   
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(i+"="+numbers[i]);
		}
	} 
}
