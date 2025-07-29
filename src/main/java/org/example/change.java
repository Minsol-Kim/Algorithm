package org.example;

import java.util.Scanner;
//01-02
public class change {
    public String solution(String str){
        String answer="";
        for(char x:str.toCharArray()){
            if(Character.isLowerCase(x))
                answer+=Character.toUpperCase(x);
            else answer+=Character.toLowerCase(x);
        }
        return answer;

    }
    public static void main(String[] args){
        change c = new change();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(c.solution(str));
    }
}
