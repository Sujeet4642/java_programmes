package collection;

public class Prime {
	
	public static void main(String[] args) {
		int count = 0;
		int[] arr = {2,5,6,8,11,14,17,18,20,47};
		/*System.out.println("array of prime numbers : ");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}*/
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]%2!=0 || arr[i]==2) {
				 count++;
			 }
		 }
		 System.out.println("count of prime no : " +count);
	}

}
