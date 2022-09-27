import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Master obj = new Master();

		Scanner sc = new Scanner(System.in);
		System.out.println("1.Perform all Operation like ,+ ,- , * , / ");
		System.out.println(" - 1.1 . A simple calculator ");
		System.out.println("2. Biggest Element Between Three Element");
		System.out.println(" - 2.1 Biggest Element two using ternary Operator");

		System.out.println("3. Find Even & Odd Between two Numbers");
		System.out.println("4. Print table ");
		System.out.println("5. Find average ");
		System.out.println("6. Find Sum of all Number upto a range ");
		System.out.println("7. Find Prime Number ");
		System.out.println("8. Find Factorial");
		System.out.println("9. Find Reverse Number");
		System.out.println("10. Find Palindrome Number");
		
		System.out.println("11. Find Armstrong Number ");
		System.out.println("12. Swapping of Number ");
		
		System.out.println("_____________________________________________________");
		System.out.println("Select The operation number you want to Perform");
		float op = sc.nextFloat();
		System.err.println("-----------------------------------------------");

//	1.	All Mathematics OPerations
		if (op == 1) {
			System.out.println("Enter two integer numbers");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			obj.allMathematic(num1, num2);
		}
//	1.1	calculator 
		else if (op == 1.1f) {
			System.out.println("Choose an operator: +, -, *, or /");
			int num3 = sc.next().charAt(0);

			System.out.println("Enter first number");
			int num1 = sc.nextInt();

			System.out.println("Enter second number");
			int num2 = sc.nextInt();
			obj.calculator(num1, num2, num3);
		}

// 2.		Biggest Element between three
		else if (op == 2) {
			System.out.println("Enter the three integer numbers");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			obj.biggestElementBetweenThree(num1, num2, num3);
		}
//	2.1 	Biggest element between two using ternary operator
		else if(op==2.1f) {
			System.out.println("Enter two integer Number");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			obj.bigBetweenTwo(num1, num2);
		}
//	3.	Even Odd number
		else if (op == 3) {
			System.out.println("Enter a integer numbers");
			int num1 = sc.nextInt();
			obj.evenOdd(num1);
		}
//	4.	Print table
		else if (op == 4) {
			System.out.println("Enter a Integer Number");
			int num1 = sc.nextInt();
			obj.printTable(num1);
		}
// 5.		Find Average
		else if (op == 5) {
			System.out.println("Enter the three integer numbers");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			obj.average(num1, num2, num3);
		}
//	6.	 Sum of all number up to a range
		else if (op == 6) {
			System.out.println("Enter a Integer Number");
			int num1 = sc.nextInt();
			obj.SumOfNumber(num1);
		}
//	7.	 Find prime number
		else if (op == 7) {
			System.out.println("Enter a Integer Number");
			int num1 = sc.nextInt();
			obj.primeNumber(num1);
		}
//	8.	 Find Factorial of a number
		else if (op == 8) {
			System.out.println("Enter a Integer Number");
			int num1 = sc.nextInt();
			obj.factorial(num1);
		}
//	9.	Reverse of Number 
		else if (op == 9) {
			System.out.println("Enter a Integer Number");
			int num1 = sc.nextInt();
			obj.reverseNumber(num1);
		}
//	10.	Palindrome Number
		else if (op == 10) {
			System.out.println("Enter a Integer Number");
			int num1 = sc.nextInt();
			obj.palindromeNumber(num1);
		}
//	11.	Swapping in Multiple ways
		else if (op == 11) {
			System.out.println("Enter a Integer Number");
			int num1 = sc.nextInt();
			obj.armstrongNumber(num1);
		} else if (op == 12) {
			System.out.println("Enter two integer Number");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println("Before Swapping \n 1st No. is - " + num1 + "\n 2nd No. is - " + num2);

			obj.swap1(num1, num2);
			obj.swap2(num1, num2);
			obj.swap3(num1, num2);

		} else
			System.err.println("Ïnvalid Please enter a Valid Opetions !!  :-) ");
	}

}
