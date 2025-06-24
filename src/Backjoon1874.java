
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Backjoon1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //문제에서 주어진 n
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        boolean impossible =false;

        int x =1;

        for(int i=0; i<n; i++){
            int inputNum = Integer.parseInt(br.readLine()); //pop 해야할 숫자
            for(; x<=inputNum; x++){ //pop을 해야하기 때문에 그 값까지 push한다. /for문 내에서 초기식 생략. 그래야 다음턴에 오름차순 유지할 수 있으니까
                stack.push(x);
                sb.append("+").append('\n');
            }
            if(stack.peek()==inputNum){ //pop해야 할 숫자가 되었으니 스택에서 pop.
                stack.pop();
                sb.append("-").append('\n');
            } else{ //pop할 수가 없음.
                impossible = true;
            }
        }

        if(impossible){
            System.out.println("NO");
        } else{
            System.out.println(sb);
        }

    }
}
