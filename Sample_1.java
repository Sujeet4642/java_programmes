package collection;

public class Sample_1 {
	public static void main(String[] args) {
		//int[] rv = {10,20,30,40,50};
		int[] rv = new int[5];
		rv[0] = 10;
		rv[1] = 20;
	    rv[2] = 30;
		rv[3] = 40;
		rv[4] = 50;
		/*System.out.println("length is : " + rv.length);
		for(int i=0; i<rv.length; i++) {
			System.out.println(i);
			//System.out.println(rv[i]); for printing values
		}
		System.out.println("-------------------");
		System.out.println("values : ");*/
		for(int c:rv)
		{
			System.out.println(c);
		}
	}
		
	

}
