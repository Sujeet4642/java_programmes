package loops;

public class SumOfEven {
	public static void main(String[] args) {
		System.out.println("Even numbers are : ");
		int sum = 0;
		for(int i=0; i<15; i++) {
		if(i % 2 == 0) {
			System.out.println( i );
			sum = sum + i;
		}
		
		}
		System.out.println("sum of even numbers are : " + sum);
	}

}
