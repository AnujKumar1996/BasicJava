import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Master m = new Master();

		Scanner sc = new Scanner(System.in);
		System.out.println("1. Biggest Element Between Three Element");
		System.out.println("2. Find Even & Odd Between two Numbers");
		System.out.println("3. Print table ");
		System.out.println("4. Find average ");
		System.out.println("Select The operation number you want to Perform");
		System.err.println("----------------------------------");
		int op = sc.nextInt();
//		All Mathematics OPerations
		 if (op == 1) {
			System.out.println("Enter the three integer numbers");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			m.average(num1, num2, num3);
		}
		
//		Biggest Elemet
		 else if (op == 2) {
			System.out.println("Enter the three integer numbers");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			m.biggestElementBetweenThree(num1, num2, num3);
//			Even Odd number
		}  
		else if (op == 3) {
			System.out.println("Enter a integer numbers");
			int num1 = sc.nextInt();
			m.evenOdd(num1);
		} 
//		Print table
		else if (op == 4) {
			System.out.println("Enter a Number");
			int num1 = sc.nextInt();
			m.printTable(num1);
		}
//		Find Average
		else if (op == 5) {
			System.out.println("Enter the three integer numbers");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			m.average(num1, num2, num3);
		}

		else {
			System.err.println("Ïnvalid Please enter a Valid Opetions !!");
		}

	}
}
