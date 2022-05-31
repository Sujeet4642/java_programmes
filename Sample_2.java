package collection;
//program for total marks in all subjects and average 
public class Sample_2 {
	public static void main(String[] args) {
		
		
		//int[] arr = {99,99,99,99,99,99};
		int[] arr = new int[6];
		arr[0]=99;
		arr[1]=99;
		arr[2]=99;
		arr[3]=99;
		arr[4]=99;
		arr[5]=99;
        int Total = 0;
		for(int i=0;i<arr.length;i++) {
			System.out.println("marks of subject no." +(i+1)+ ":" + arr[i]);
			Total = Total + arr[i];
		}
		System.out.println("----------------------");
		System.out.println("Grand Total : " + Total);
		int avg = Total/arr.length;
		System.out.println("avg is : " + avg);
	}
	
}
