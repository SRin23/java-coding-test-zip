package Baekjoon_Level1_input_output;
// ��Ģ����
import java.util.Scanner;

public class CalculationCollection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		sc.close();
	}
}