package org.example.String;

import java.util.Scanner;

//01-11 문자열 압축
public class Eleven {
    public String solution(String str){
        String answer="";
        str=str+"";
        int cnt=1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i+1)) cnt++;
            else{
                answer+=str.charAt(i);
                if(cnt>1) answer+=String.valueOf(cnt);
                cnt=1;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Eleven E = new Eleven();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(E.solution(str));
    }
}
