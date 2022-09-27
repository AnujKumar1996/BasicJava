
public class Master {
//	1. perform all operation  add, subtraction, multiplication division
	void allMathematic(int num1, int num2) {
		int add, sub, mul;
		add = num1 + num2;
		sub = num1 - num2;
		mul = num1 * num2;
		float div = (float) num1 / num2;
		float r = num1 % num2;
		System.out.println("Add = " + add);
		System.out.println("Subtraction =  " + sub);
		System.out.println("Mul = " + mul);
		System.out.println("Division = " + div + "\n And reminder = " + r);
	}

// 1.1.   A simple calculator
	void calculator(int num1, int num2, int num3) {
		int result;
		switch (num3) {
		case '+':
			result = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + result);
			break;
		case '/':
			float div = (float) num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + div);
			break;
		default:
			System.err.println("Invalid operator! \n PLEASE SELECT ONLY OPERATOR \n eg :+ , - , * , / ");
			break;
		}

	}

//2. find biggest between three number
	void biggestElementBetweenThree(int num1, int num2, int num3) {
		if (num1 >= num2 && num1 >= num3) {
			System.out.println(num1 + " is greatest number");
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println(num2 + " is greatest number");
		} else {
			System.out.println(num3 + " is greatest number");
		}
	}

//	Biggest element Between two using ternary operator
	void bigBetweenTwo(int num1, int num2) {
		int large;
		System.out.println(large = (num1 > num2) ? num1 : num2);
	}

//3. find even and off from two number
	void evenOdd(int num1) {
		if (num1 % 2 == 0) {
			System.out.println(num1 + " is a Even Number");
		} else
			System.err.println(num1 + " is a odd number");
	}

//4 print the table for a given number
	void printTable(int num1) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(num1 + " * " + i + " = " + num1 * i);
		}
	}

//5. average
	void average(int num1, int num2, int num3) {
		float result;
		result = (float) (num1 + num2 + num3) / 3;
		System.out.println("Average = " + result);
		System.out.println();
	}

//	6. sum of all number up to a range
	void SumOfNumber(int num1) {
		long sum = 0;
		for (int i = 1; i <= num1; i++) {
			sum = (long) sum + i;
		}
		System.out.println("Sum of all the number between is = " + sum);
	}

//	7. prime number
	void primeNumber(int num1) {
		int count = 0;
		for (int i = 2; i <= num1; i++) {
			if (num1 % i == 0) {
				count++;
			}
		}
		if (count > 1) {
			System.err.println(num1 + " is NOT a Prime number");
		} else {
			System.out.println(num1 + " is a prime number");
		}
	}

// 8.	Factorial 
	void factorial(int num1) {
		long fact = 1;
		for (int i = 1; i <= num1; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + num1 + " = " + fact);
	}

//9. Reverse Number
	void reverseNumber(int num1) {
		long rev = 0;
		while (num1 != 0) {
			int r = num1 % 10;
			rev = rev * 10 + r;
			num1 = num1 / 10;
		}
		System.out.println("Reverse of number = " + rev);
	}

//10. Palindrome Number
	void palindromeNumber(int num1) {
		long rev = 0;
		int temp = num1;
		while (num1 != 0) {
			int r = num1 % 10;
			rev = rev * 10 + r;
			num1 = num1 / 10;
		}
		if (rev == temp)
			System.out.println(temp + " is a Palindrome number");
		else
			System.err.println(temp + " is not a plindrome Number");
	}

//	11. Armstrong Number
	void armstrongNumber(int num1) {
		int r;
		double arm = 0;
		int temp = num1;
		int count = 0;
		int n = num1;
		while (num1 != 0) {
			int rm = num1 / 10;
			count++;
			num1 = num1 / 10;
		}

		while (n != 0) {
			r = n % 10;
			arm = arm + (Math.pow(r, count));
			n = n / 10;
		}
		if (temp == arm) {
			System.out.println(temp + " is a armstrong number");
		} else {
			System.err.println(temp + " is not a armstrong number");
		}
	}
// 12. SWAPPING in multiple ways.
//		1 way without using third variable
	void swap1(int num1, int num2) {
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("\nFirst Way => \n After Swapping \n 1st No. is " + num1 + "\n 2nd No. is " + num2);
	}

//		2 way without using third variable
	void swap2(int num1, int num2) {
		num1 = num1 * num2;
		num2 = num1 / num2;
		num1 = num1 / num2;
		System.out.println("\nSecond Way => \n After Swapping \n 1st No. is " + num1 + "\n 2nd No. is " + num2);

	}

//	3rd way to swap using third variables
	void swap3(int num1, int num2) {
		int temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("\nThird Way => \n After Swapping \n 1st No. is " + num1 + "\n 2nd No. is " + num2);

	}
}