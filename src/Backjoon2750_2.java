import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Backjoon2750_2 {
    public static void main(String[] args) throws IOException {
        /*
        1.수의 개수를 받는다. n개의 수를 배열로 받는다
        2.for(int i=0; i<n; i++){
        if(arr[i]>arr[i+1){
            arr[i]와 arr[i+1]의 자리를 바꿔준다. =>버블정렬 1회차로 한자리수만 확정
        3.이걸 n개 만큼 반복
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0; i<n-1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int var = 0;
                    var = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = var;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int a: arr){
            sb.append(a).append('\n');
        }
        System.out.println(sb);
    }
}
