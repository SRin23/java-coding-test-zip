package baekjoon.bronze.bronze5;
//Bottle Return
import java.util.Scanner;

public class BottleReturn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i<6; i++){
            sum+=sc.nextInt();
        }
        System.out.println(sum*5);
    }
}
