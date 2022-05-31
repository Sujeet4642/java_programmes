package collection;
//find largest element
public class Sample_4 {
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50,60};
		/*int[] arr = new int[6];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 60;*/
		
		int largest = 10;//assume largest
		for(int i=0;i<arr.length;i++) {
		 if(largest<arr[i]){//if condition is right then go inside loop
			 largest = arr[i];
			 }
		}
		
		/*for(int c:arr) {
			if(largest<c) {
				largest = c;
			}
		}*/
		 System.out.println("largest no. is : " +largest);
		

	}
}
