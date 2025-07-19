import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Backjoon1874_2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        boolean isPossible = true;

        int x=1;

        for(int i=0; i<n; i++){
            if(x<=arr[i]){
                while(x<=arr[i]){
                    stack.push(x);
                    x++;
                    sb.append("+\n");
                }
            }
            if(stack.peek()==arr[i]){
                stack.pop();
                sb.append("-\n");
            } else if(stack.peek()>arr[i]){
                isPossible = false;
                break;
            }
        }
        if(isPossible){
            System.out.println(sb);
        } else{
            System.out.println("NO");
        }


    }
}
