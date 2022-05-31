package collection;
//enhance for loop
public class Sample_3 {
	public static void main(String[] args) {
		//double[] darr = {10.1,10.2,10.3,10.4,10.5};
		double[] darr = new double[5];
		darr[0]=10.1;
		darr[1]=10.2;
		darr[2]=10.3;
		darr[3]=10.4;
		darr[4]=10.5;
		
		for(double d:darr) {
			System.out.println(d);
		}
		
		System.out.println("---------------");
		char[] carr = {'A','B','C','D','E'};
		/*char[] carr = new char[5];
		carr[0] = 'A';
		carr[1] = 'B';
		carr[2] = 'C';
		carr[3] = 'D';
		carr[4] = 'E';*/
		for(char a:carr)
		{
			System.out.println(a);
		}
	}

}
