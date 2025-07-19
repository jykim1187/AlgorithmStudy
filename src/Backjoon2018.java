import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjoon2018 {
    public static void main(String[] args) throws IOException {
        /*
        1.자연수 n을 받는다.
        2.1부터 n까지 늘어놓는다 생각하고 포인터 2개를 1에 세팅한다
        3.두 포인터가 가르키는 수들의 합을 담는 변수 x를 둔다. 이 변수는 포인터 2개가 가르치는 범위의 합을 담으면 된다. 초기값으로는 1로 둔다.(포인터 2개가 1을 가르키고 있으니까)
        4.합을 담는 변수가 n과 같으면 가지수 +1 이되고. 엔트포인터를 +1이동. 엔드포인트를 +1이동했다는 것은 새로운 엔드포인트갑을 더해줘야한다.
          합을 담는 변수가 n보다 크면 시작포인트를 +1이동. 시작포인트 +1이동했다는 것은 기존에 시작포인트가 가르키는 값이 빠졌다는 것 그 값을 sum에서 먼저 빼줘야한다.
          합을 담는 변수가 n보다 작으면 엔드포인터+1이동. 엔드포인트를 +1이동했다는 것은 새로운 엔드포인트갑을 더해줘야한다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int startPointer = 1;
        int endPointer = 1;
        int sum =1;
        int answer =0;

        while(endPointer<=n){
            if(sum == n){
                answer++;
                endPointer++;
                sum+=endPointer;
            } else if(sum>n){
                sum -=startPointer;
                startPointer++;
            } else{ //sum<n일 경우
                endPointer++;
                sum+=endPointer;
            }
        }
        System.out.println(answer);
    }
}
