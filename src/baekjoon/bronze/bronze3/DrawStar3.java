package baekjoon.bronze.bronze3;
//별찍기 - 3
import java.util.Scanner;

public class DrawStar3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n; i>0; i--){
            for(int j = i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
