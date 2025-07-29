package org.example;

import java.util.ArrayList;
import java.util.Scanner;

//01-04 -> 다시 풀어보기
public class reverse {
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
//        클래스 사용하지않고 직접 뒤집기
//        for(String x : str){
//            char[] s=x.toCharArray();
//            int lt=0, rt=x.length()-1;
//            while(lt<rt){
//                char tmp=s[lt];
//                s[lt]=s[rt];
//                s[rt]=tmp;
//                lt++;
//                rt--;
//            }
//            String tmp=String.valueOf(s);
//            answer.add(tmp);
//        }
        return answer;


    }
    public static void main(String[]args){
        reverse r = new reverse();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String[] str = new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        for(String x:r.solution(n,str)){
            System.out.println(x);
        }
    }

}

//StringBuilder : 문자열을 효율적으로 조작(추가, 삭제, 뒤집기 등) 할 수 있는 클래스