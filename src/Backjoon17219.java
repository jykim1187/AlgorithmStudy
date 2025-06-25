import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Backjoon17219 {
    public static void main(String[] args) throws IOException {
//        사이트와 비밀번호가 짝지어 저장되서 해당 사이트에 맞는 비밀번호를 갖고와야하니까 맵구조
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken()); // 저장된 사이트 주소 수
        int m = Integer.parseInt(st.nextToken()); // 비밀번호 찾으려는 사이트 주소 수

        Map<String, String> siteAndPassword = new HashMap<>();

        for(int i=0; i<n; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
            siteAndPassword.put(st2.nextToken(),st2.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; i++){
            String site = br.readLine();
            String password = siteAndPassword.get(site);
            sb.append(password).append('\n');
        }
        System.out.println(sb);
    }
}
