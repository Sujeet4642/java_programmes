package types;

public class Tax_IfElse {
	public static void main (String args[]) {
		int amount = 400;
		int Total;
		int a=50;
		int b=20;
		int c=10;
		
		if(amount <= 300) {
		Total = amount + a;
		System.out.println("Total amount of bill is : " + Total );
		}
		else if(amount > 300 && amount <= 500) {
			Total = amount + b;
			System.out.println("Total amount of bill is : " + Total);
		}
		else if(amount > 500 && amount <= 1000) {
			Total = amount + c;
			System.out.println("Total amount of bill is : " + Total);
		}
		else if(amount > 1000) {
			System.out.println("No Tax");
		}
		else {
			System.out.println("invalid bill");
		}
			
		
		}
			
		}

	






