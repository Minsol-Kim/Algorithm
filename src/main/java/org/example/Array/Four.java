package org.example.Array;

import java.util.Scanner;

//02-04 피보나치 수열
public class Four {
    public void solution(int n){
        int a=1, b=1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        Four F = new  Four();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        F.solution(n);
    }
}
