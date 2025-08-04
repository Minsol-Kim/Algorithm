package org.example.String;

//01-08 유효한 펠린드롬

import java.util.Scanner;

public class Eight {
    public String solution(String str){

        str=str.toLowerCase();
        StringBuilder sb=new StringBuilder();

        for(char c:str.toCharArray()){
            if(Character.isLetter(c)) sb.append(c);
        }
        String filter =sb.toString();
        int len = filter.length();

        for(int i =0;i<len/2 ;i++){
            if(filter.charAt(i)!=filter.charAt(len-1-i))
                return "NO";
        }

        return "YES";

    }
    public static void main(String[] args) {
        Eight e = new Eight();
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        System.out.println(e.solution(str));

    }
}
