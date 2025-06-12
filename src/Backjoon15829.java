import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Backjoon15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //문자열의 길이 l
        int length = Integer.parseInt(br.readLine());
        //영문 소문자로만 이루어진 문자열
        String array = br.readLine();
        //문자열을 character타입의 배열로 바꾸고
        char[] charArr = array.toCharArray();
        //문제에서 제시한 m의 값
        int m = 1234567891;
        //문제에서 제시한 r의 i승 값. 일단 제일 처음엔 무조건 0승부터 시작이니까 1로 세팅
        long pow =1;

        long answer = 0;
        for(int i=0; i<length; i++){
          long temp = charArr[i]-96; //문자열은 영문 소문자만들어오고 원래 a는 97의 값을 가지고 있으므로 96을 빼면 a=1,b=2...z=26 번호가 맞아 떨어짐
          // 모듈러 연산 활용
          answer = (answer + (temp*pow)%m)%m;
          pow = (pow*31)%m;

        }
        System.out.println(answer);

    }
}
