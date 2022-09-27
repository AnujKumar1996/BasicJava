import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Master obj = new Master();

		Scanner sc = new Scanner(System.in);
		System.out.println("1.Perform all Operation like ,+ ,- , * , / ");
		System.out.println("2. Biggest Element Between Three Element");
		System.out.println("3. Find Even & Odd Between two Numbers");
		System.out.println("4. Print table ");
		System.out.println("5. Find average ");
		System.out.println("6. Find Sum of all Number upto a range ");
		System.out.println("7. Find Prime Number ");
		System.out.println("8. Find Factorial");
		System.out.println("9. Find Reverse Number");
		System.out.println("10. Find Palindrome Number");
		System.out.println("11. A simple calculator ");
		System.out.println("12. Find Armstrong Number ");

		System.out.println("_____________________________________________________");
		System.out.println("Select The operation number you want to Perform");
		int op = sc.nextInt();
		System.err.println("-----------------------------------------------");

//		All Mathematics OPerations
		if (op == 1) {
			System.out.println("Enter two integer numbers");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			obj.allMathematic(num1, num2);
		}

//		Biggest Element
		else if (op == 2) {
			System.out.println("Enter the three integer numbers");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			obj.biggestElementBetweenThree(num1, num2, num3);
//			Even Odd number
		} else if (op == 3) {
			System.out.println("Enter a integer numbers");
			int num1 = sc.nextInt();
			obj.evenOdd(num1);
		}
//		Print table
		else if (op == 4) {
			System.out.println("Enter a Integer Number");
			int num1 = sc.nextInt();
			obj.printTable(num1);
		}
//		Find Average
		else if (op == 5) {
			System.out.println("Enter the three integer numbers");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			obj.average(num1, num2, num3);
		}
//		 Sum of all number up to a range
		else if (op == 6) {
			System.out.println("Enter a Integer Number");
			int num1 = sc.nextInt();
			obj.SumOfNumber(num1);
		}
//		 Find prime number
		else if (op == 7) {
			System.out.println("Enter a Integer Number");
			int num1 = sc.nextInt();
			obj.primeNumber(num1);
		}
//		 Find Factorial of a number
		else if (op == 8) {
			System.out.println("Enter a Integer Number");
			int num1 = sc.nextInt();
			obj.factorial(num1);
		} else if (op == 9) {
			System.out.println("Enter a Integer Number");
			int num1 = sc.nextInt();
			obj.reverseNumber(num1);
		}
//		Palindrome Number
		else if (op == 10) {
			System.out.println("Enter a Integer Number");
			int num1 = sc.nextInt();
			obj.palindromeNumber(num1);
		}
//		calculator 
		else if (op == 11) {
			System.out.println("Choose an operator: +, -, *, or /");
			int num3 = sc.next().charAt(0);

			System.out.println("Enter first number");
			int num1 = sc.nextInt();

			System.out.println("Enter second number");
			int num2 = sc.nextInt();
			obj.calculator(num1, num2, num3);
		} else if (op == 12) {
			System.out.println("Enter a Integer Number");
			int num1 = sc.nextInt();
			obj.armstrongNumber(num1);
		}

		else
			System.err.println("Ïnvalid Please enter a Valid Opetions !!");
	}

}
