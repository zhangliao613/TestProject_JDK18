package sort;

import java.util.Arrays;

public class SortDemo {

	public static void main(String[] args) {
		
		int[] array1 = {32, 33, 35, 38, 40};
		int[] array2 = {3, 4, 5, 12, 16, 21, 31};
		int[] array3 = new int[array1.length + array2.length];
		
		
		outer:
		for(int i = 0; i< array1.length; i++){
			for(int j = array2.length-1 ; j > 0; j--){
				if(array1[i] > array2[j] ){//��õ����������һ������ĵ�һ��Ԫ�ش��ڵڶ�����������һ��Ԫ��
					int temp1 = 0;
					int temp2 = 0;
					for(int k = 0; k < array3.length; k++){
						if( k< array2.length){
							array3[k] = array2[temp1];
							temp1 ++;
						} else {
							array3[k] = array1[temp2];
							temp2 ++;
						}
						
					}
					break outer;
				}
			}
		}
		System.out.println(Arrays.toString(array3));
	}
}
