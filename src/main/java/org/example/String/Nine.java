package org.example.String;

import java.util.Scanner;

//01-09 숫자만 추출
public class Nine {
    public int solution(String str){
        String ans="";
        for(char ch:str.toCharArray()){
            if(Character.isDigit(ch)) ans+=ch;
        }
        return Integer.parseInt(ans);

    }

    public static void main(String[] args) {
        Nine n=new Nine();
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(n.solution(str));
    }
}
