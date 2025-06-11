import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String isbn = br.readLine();
        char[] isbnCharArr = isbn.toCharArray();
        // ISBN 중 마지막 숫자 = 체크기호
        int m = Integer.parseInt(String.valueOf(isbnCharArr[12]));

        //placeNum은 훼손된 숫자가 몇번째 인덱스에 위치하는지에 대한 변수(짝수 인덱스면 가중치1, 홀수 인덱스면 가중치3)
        int placeNum = 0;
        for (int i = 0; i < 13; i++) {
            if (isbnCharArr[i] == '*') {
                placeNum = i; // 훼손된 숫자가 몇번째 자리인지 먼저 파악
            }
        }

        //sum은 ISBN에서 m을 제외한 가중치들의 합(a+3b+c+...)
        int sum = 0;
        //짝수 인덱스에 위치한 수들은 가중치 1을 해서 sum에 더하고  홀수 인덱스에 위치한 *3을 해서 sum에 더한다.
        for (int i = 0; i < 12; i++) {
            if (i != placeNum) { //훼손된 숫자는 일단 제외
                if (i%2 == 0) {
                    sum += Integer.parseInt(String.valueOf(isbnCharArr[i]));
                } else {
                    sum += 3 * (Integer.parseInt(String.valueOf(isbnCharArr[i])));
                }
            }
        }
        //지금까지 sum은 훼손된숫자를 제외하고 더해진 값들. 어차피 훼손된 숫자는 0~9까지의 수 일 것임.
        int answer = 0;
        for (int s = 0; s < 10; s++) { //체크기호가 맞아 떨어질 때 s가 훼손된 숫자가 되는 것
            if (placeNum%2 == 0) { //훼손된 숫자가 짝수인덱스에 위치한다면 sum에다 그대로 더하고
                if(m == 0){ //체크기호가 0일때의 예외조건 고려
                   if((sum+s) %10 ==0){
                       answer =s;
                   }
                }
                if (m !=0 && m == 10 - ((sum + s) % 10)) {
                    answer = s;
                }
            } else { //훼손된 숫자가 홀수 인덱스에 위치한다면 *3해서 더하고

                if(m ==0){ //체크기호가 0일때의 예외조건 고려
                    if((sum +3*s) % 10 ==0){
                        answer =s;
                    }
                }
                if (m != 0 && m == 10 - ((sum + 3 * s) % 10)) {
                    answer = s;
                }
            }
        }
        System.out.println(answer);
    }
}
