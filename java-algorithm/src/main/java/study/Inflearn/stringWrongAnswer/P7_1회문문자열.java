package study.Inflearn.stringWrongAnswer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P7_1회문문자열 { //5분 27초
    public static void main(String[] args)  throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        char[] str = br.readLine().toLowerCase().toCharArray();
        int lt = 0, rt = str.length - 1;
        String answer = "YES";

        while(lt < rt) {
            if(str[lt]!=str[rt]){
                answer = "NO";
                break;
            }
            lt++;
            rt--;
            answer = "YES";
        }

        System.out.println(answer);
    }
}
