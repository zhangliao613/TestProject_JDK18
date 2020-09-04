package sort;

import java.util.Arrays;

public class ArraySortDemo {

	public static void main(String[] args) {
		//���������������������
		int[] array1 = {15, 18, 22, 38, 40};
		int[] array2 = {3, 4, 5, 12, 16, 21, 31};
		int[] array3 = new int[array1.length + array2.length];
		//���������㷨
		mergeSort(array1, array2, array3);
		//�������������
		System.out.println(Arrays.toString(array3));
	}
	
	static void mergeSort(int[] array1, int[] array2, int[] array3){
		//�ȳ�ʼ������������
		for (int i = 0; i < array2.length; i++) {
			array3[i] = array2[i];
		}
		int length = array2.length-1;
		for(int i = 0; i< array1.length; i++){
			for(int j = length ; j >= 0; j--){
				//����ָ��λ��
				if(array1[i] < array3[j]){
					int temp = array3[j];
					array3[j] = array1[i];
					array3[j+1] = temp;
				} else {
					array3[j+1] =  array1[i];
					break;
				}
			}
			length++;
		}
	}
}

