       package collection;

public class Char_Count {
	
	public static void main(String[] args) {
		int count=0;
		char arr[] = {'I','a','m','A','j','a','v','a','Q','A'};
		//System.out.println("Atual array : ");
		/*for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}*/
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='A' || arr[i]=='a') {
				count++;
			}
		}
		System.out.println("count of char A/a : " +count);
	}

}
