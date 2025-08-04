package org.example.String;

import java.util.Scanner;

//01-05 -> 다시 풀기
public class alpreverse {
    public String solution(String str){
       String answer = "";
       char[] s = str.toCharArray();
       int lt=0,rt=str.length()-1; //lt: 왼쪽, rt: 오른쪽 포인터
       while(lt<rt){
           if(!Character.isAlphabetic(s[lt])) lt++;
           else if(!Character.isAlphabetic(s[rt])) rt--; //알파벳이 아니면 그냥 포인터만 이동
           else {
               char tmp=s[lt];
               s[lt++]=s[rt];
               s[rt--]=tmp;
           } //둘 다 알파벳인 경우 바꿈
       }
       answer=String.valueOf(s); //배열을 문자열로 다시 반환
       return answer;
    }
    public static void main(String[] args){
        alpreverse ar=new alpreverse();
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(ar.solution(str));
    }
}
