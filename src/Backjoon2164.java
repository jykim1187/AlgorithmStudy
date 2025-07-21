import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Backjoon2164 {
    public static void main(String[] args) throws IOException {
        /*
        1.큐에 1~n까지 담는다.
        2.홀수번째일 때는 가장 앞에 있는 걸 버린다.
        3.짝수번째일 때는 가장 앞에 있는 걸 맨 뒤로 옮긴다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<n+1; i++){
            queue.add(i);
        }

       int count =1;
       while(queue.size()>1){
           if(count % 2 ==1){
               queue.poll();
           } else{
               int a = queue.poll();
               queue.add(a);
           }
           count++;
       }
        System.out.println(queue.poll());
    }
}
