package week3.day1;

public class calculator {
	
	
public void multiply(int num1,int num2) { 
	System.out.println(num1*num2);
}
	public void multiply(int num1,double num2) {
		System.out.println(num1*num2);
}
	public void subtract(int num1,int num2) {
		System.out.println(num1-num2);
	}
	public void div(int num1,int num2) {
		System.out.println(num1/num2);
		
	}
	public void div(double num1,int num2) {
		System.out.println(num1/num2);
	}
	public void add(int num1, int num2){
		System.out.println(num1+num2);
	}
	
		public static void main(String[] args)
	{
		calculator calc = new calculator();
		calc.multiply(9, 12.34);
		calc.multiply(6,  8);
		calc.subtract(5, 3);
		calc.div(13.54,  5);
		calc.div(45.3,  5);
		calc.add(5, 4);
	}


		
		
			
			
	}


