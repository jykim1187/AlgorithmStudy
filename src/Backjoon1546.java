import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] originalScores = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int max =0;
        for(int i=0; i<n; i++){
            originalScores[i] = Integer.parseInt(st.nextToken());
            if(max<originalScores[i]){
                max=originalScores[i];
            }
        }
        double fakeScoresSum =0;
        for(int s : originalScores){
           fakeScoresSum+= ((double) s /max) *100;
        }

        double answer = fakeScoresSum / n;
        System.out.println(answer);
    }
}
