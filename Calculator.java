package swarnika;

public class Calculator {

	public static void main(String[] args) {
	 int a = 20;
	 int b = 5;
	 char operator = '*';
	 
	 if (operator == '+') {
		 System.out.println(a + b);
	 } else if (operator == '-') {
		 System.out.println(a - b);
	 } else if (operator == '*') {
		 System.out.println(a * b);
	 } else if (operator == '/') {
		 System.out.println(a / b);
	 } else {
		 System.out.println("Invalid operator");
	 }

	}

}
