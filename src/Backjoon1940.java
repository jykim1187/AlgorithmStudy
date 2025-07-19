import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Backjoon1940 {
    public static void main(String[] args) throws IOException {
        /*
        1.첫째줄에 재료 개수n, 둘째줄에 필요한 수m를 받는다
        2.셋째줄에 StringTokenizer를 이용 배열arr에 담는다.
        3.투포인터를 사용하기 위해 배열을 오름차순 정렬한다.
        4.스타트포인터는 배열의 맨 앞에 , 엔드포인터는 배열의 맨뒤에 두고, 스타트포인터는 오른쪽으로, 엔드포인터는 왼쪽으로 진행방향을 잡는다.
        5.while반복하는데 스타트포인터가 엔드포인터보다 작을 동안 계속반복
           if(sum==m) 스타트포인터+1
           if(sum>m) 엔드포인터-1;
           if(sum<m) 스타트포인터+1;
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int startPointer =0;
        int endPointer = arr.length-1;
        int answer =0;

        while(startPointer<endPointer){
            int sum = arr[startPointer] + arr[endPointer];

            if(sum == m){
                answer++;
                startPointer++;
            } else if(sum>m){
                endPointer--;
            } else{ //sum<m
                startPointer++;
            }
        }
        System.out.println(answer);
    }
}
