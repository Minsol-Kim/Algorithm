package org.example.String;

import java.util.Scanner;
//01-06
public class delete {
    public String solution(String str){
        String answer="";
        for(int i=0;i<str.length();i++){
            if(str.lastIndexOf(str.charAt(i))==i)
                answer+=str.charAt(i);
        }
        return answer;
    }
    public static void main(String[] args){
        delete d = new delete();
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        System.out.println(d.solution(str));
    }
}
