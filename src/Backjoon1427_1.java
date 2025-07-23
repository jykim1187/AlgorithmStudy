import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjoon1427_1 {
    public static void main(String[] args) throws IOException {
         /*
        1.n을 받고 toCharArray로 배열로 만든다음 int배열로 변환한다
        2.최댓값을 찾는다.
        3.최댓값을 제일 앞에 배치한다.
        4.이를 자릿수만큼 반복한다
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        char[] charArr = n.toCharArray();
        int[] arr = new int[charArr.length];
        for(int i=0; i<arr.length; i++){
            arr[i] = charArr[i]-'0';
        }
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<arr.length; i++){
            int max =i;
         for(int j=i+1; j<arr.length; j++){
             if(arr[j]>arr[max]){
                 max=j;
             }
         }
         if(arr[i]<arr[max]){
             int temp = arr[i];
             arr[i] =arr[max];
             arr[max] = temp;
         }

        }

        for(int a: arr){
            sb.append(a);
        }
        System.out.println(sb);
    }
}
