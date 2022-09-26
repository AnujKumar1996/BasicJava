import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter three number");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	int num3=sc.nextInt();
	Master m=new Master();
	m.biggestElementBetweenThree(num1, num2, num3);
}
}
