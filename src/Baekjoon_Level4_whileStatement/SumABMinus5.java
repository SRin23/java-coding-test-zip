package Baekjoon_Level4_whileStatement;
//A+B-5
import java.util.Scanner;

public class SumABMinus5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a+b==0) {
				break;
			}
			System.out.println(a+b);
		}
		sc.close();
	}

}
