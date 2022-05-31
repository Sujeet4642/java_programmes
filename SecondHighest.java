package collection;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondHighest {
	public static void main(String[] args) {
		
	int arr[] = {80,10,5,1,90,100};
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
	}
	
	System.out.println("second largest value is " +arr[1]);
	
	/*int n = arr.length;
	
	Arrays.sort(arr);
	System.out.println(arr[n-2]);*/
	
	}	

}
