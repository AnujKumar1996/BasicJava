
public class Master {
	void allMathematic(int num1, int num2, int num3) {
		int result;
		System.out.println( result=num1+num2+num3);
	}
	void biggestElementBetweenThree(int num1, int num2, int num3) {
		if (num1 >= num2 && num1 >= num3) {
			System.out.println(num1 + " is greatest number");
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println(num2 + " is greatest number");
		} else {
			System.out.println(num3 + " is greatest number");
		}
	}

	void evenOdd(int num1) {
		if (num1 % 2 == 0) {
			System.out.println(num1 + " is a Even Number");
		} else
			System.out.println(num1 + " is a odd number");
	}

	void printTable(int num1) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(num1 + " * " + i + " = " + num1 * i);
		}
	}

	void average(int num1, int num2, int num3) {
		int result;
		result = (num1 + num2 + num3) / 3;
		System.out.println("Average = " + result);
		System.out.println();
	}

}
