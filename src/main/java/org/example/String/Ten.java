package org.example.String;

import java.util.Scanner;

//01 -10 가장 짧은 문자거리

public class Ten {
    public int[] solution (String s,char ch){
        int[] ans=new int[s.length()];
        int p = 1000;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                p=0;
                ans[i]=p;
            }
            else{
                p++;
                ans[i]=p;
            }
        }

        p=1000;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)==ch)
                p=0;
            else{
                p++;
                ans[i]=Math.min(ans[i], p);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Ten t =  new Ten();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        for(int i : t.solution(str,c)){
            System.out.print(i+" ");
        }

    }
}

//전체 시간 복잡도 : O(n) -> 2번 순회