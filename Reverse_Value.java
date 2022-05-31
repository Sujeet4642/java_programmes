package collection;

public class Reverse_Value {
	
public static void main(String[] args) {
	//int[] arr = {11,22,33,44,55};
	int[] arr = new int[5];
	arr[0] = 11;
	arr[1] = 22;
	arr[2] = 33;
	arr[3] = 44;
	arr[4] = 55;
	
	/*System.out.println("array before reverse order : ");
	for(int i=0; i<arr.length;i++) {
		System.out.println(arr[i]);
	}*/
	System.out.println("array after reverse order : ");
	
	for(int i=arr.length-1;i>=0;i--) {
		System.out.println(arr[i]);
	}
}
}
