import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Backjoon11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String line2 = br.readLine();
        String[] line2Arr = line2.split("");
        int sum=0;

        for(int i=0; i<n; i++){
            sum+= Integer.parseInt(line2Arr[i]);
        }

        System.out.println(sum);

    }
}


