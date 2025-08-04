package org.example.String;

import java.util.Scanner;
//01-01
public class find {
    public int solution(String str, char t){
        int answer=0;
        str=str.toUpperCase(); //대소문자 구분 X -> 대문자로 모두 바꿔서 찾아냄
        t=Character.toUpperCase(t); //찾아낼 문자를 대문자로 변환
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)==t) answer++;
//        }

        for(char x : str.toCharArray()){
            if(x==t) answer++;
        }

        return answer;
    }

    public static void main(String[] arg){
        find f=new find();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c =sc.next().charAt(0); //다시 호출하여 두 번째 문자열 입력 받음 -> c에 저장
        System.out.println(f.solution(str, c));


    }
}

// 대소문자 무시 -> 문자열 검색 -> 카운팅