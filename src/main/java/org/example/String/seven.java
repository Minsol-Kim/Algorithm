package org.example.String;

import java.util.Scanner;
//01-07
public class seven {
    public String solution(String str){
        String answer="YES";
        str=str.toLowerCase(); //대소문자 구분 X -> 소문자 변환
        int len=str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) return "NO";
        }
        return "YES";
    }
    public static void main(String[] args) {
        seven s=new seven();
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(s.solution(str));
    }
}
