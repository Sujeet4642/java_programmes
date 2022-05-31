package collection;

public class Assending_order {
	
	public static void main(String[] args) {
		int[] arr = {20,14,48,9,5,3,25,7};
		/*int[] arr = new int[8];
		arr[0] = 20;
		arr[1] = 14;
		arr[2] = 48;
		arr[3] = 9;
		arr[4] = 5;
		arr[5] = 3;
		arr[6] = 25;
		arr[7] = 7;*/
		
		/*System.out.println("Actual array : ");
		for(int i=0; i<arr.length;i++) {
		System.out.println(arr[i]);
		}*/
		
		for(int i=0; i<arr.length;i++) 
		{
		 for(int j = i + 1; j<arr.length; j++) {
			 
			 if (arr[i] > arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];//swapping
				arr[j] =  temp;//swapping
			 }
			 
		 }	
		 System.out.println(arr[i]);
		}
		/*System.out.println("Assending order : ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}*/
	}

}
