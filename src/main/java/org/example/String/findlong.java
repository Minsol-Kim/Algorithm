package org.example.String;

import java.util.Scanner;
//01-03
public class findlong {
    public String solution(String str){
        String answer="";
        int m = 0; //길이 초기화
        String[] s = str.split(" "); //공백 기준으로 단어 나누기
        for(String x:s){
            int len = x.length();
            if(len>m){
                m=len;
                answer=x;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        findlong a=new findlong();
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(a.solution(str));
    }
}
