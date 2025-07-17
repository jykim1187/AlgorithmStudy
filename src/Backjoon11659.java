import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon11659 {
    public static void main(String[] args) throws IOException {
    /*
    1.n과 m을 받는다
    2.둘째줄에 들어오는 n개의 수를 배열로 받는다.
    3.이 배열을 수의 개수만큼 for반복 돌리면서 합배열을 만든다.
    3.for(반복횟수 m){
    StringTokenizer로 구간을 나타내는 i와 j를 받는다.
    합배열(j)-합배열(i) = 원래배열의 i부터 j까지 합구간
    }
     */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        int[] sumArr = new int[n];
        sumArr[0]=arr[0];
        for(int i=1; i<n; i++){
            sumArr[i] = sumArr[i-1] +arr[i];
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<m; i++){
            StringTokenizer st3 = new StringTokenizer(br.readLine()," ");
            int start = Integer.parseInt(st3.nextToken());
            int end = Integer.parseInt(st3.nextToken());

            if(start==1){
              int answer = sumArr[end-1];
                sb.append(answer).append('\n');
            } else{
                int answer = sumArr[end-1] -sumArr[start-2];
                sb.append(answer).append('\n');
            }

        }
        System.out.println(sb);

    }
}
