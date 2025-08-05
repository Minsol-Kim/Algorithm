package org.example.Array;

import java.util.ArrayList;
import java.util.Scanner;

//02-01 큰 수 출력하기
public class One {
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(arr[0]);
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                ans.add(arr[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args){
        One one=new One();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int x :one.solution(n,arr)){
            System.out.println(x+"");
        }
    }
}
