package boj_bronze4to5;

import java.util.Scanner;

public class No_27959 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();

        if(N*100>=M) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        input.close();
       
    }
}