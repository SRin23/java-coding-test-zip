package baekjoon.bronze.bronze3;
//별찍기 - 4
import java.util.Scanner;

public class DrawStar4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            for(int j = i; j>0; j--){
                System.out.print(" ");
            }
            for(int j = 0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}