import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon12891 {
    public static void main(String[] args) throws IOException {
 /*
        1.주어지는 문자열 s길이와 비밀번호 문자열 p길이를 받는다
        2.s문자열을 String으로 받는다
        3.StringTokenizer로 각 알파벳 최소개수를 받는다
        4.s문자열.toCharArray로 char배열로 만들고, 두 포인터를 p차이가 나도록 지정한다.
        5.일단 현재 위치한 슬라이드 윈도우 내에서 각 알파벳 개수가 몇개인지 체크한다.
        6.엔드포인터가 s.length를 벗어나기까지 while반복 윈도우를 이동시킨다.(두 포인터를 ++; 한다는 말)
        7.이때 슬라이드윈도우는 시작포인터가 한칸 오른쪽으로 이동하니 기존의 시작점에 있는 알파벳이 빠진다는 얘기고 엔드포인터도 한칸 오른쪽으로 이동하니 새로운 알파벳이 들어온다는 말.
        8.while반복도는 동안 개수 잘체크하면 된다
  */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int sLength =Integer.parseInt(st.nextToken());
        int pLength =Integer.parseInt(st.nextToken());
        String s = br.readLine();
        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
        int aCount = Integer.parseInt(st2.nextToken());
        int cCount = Integer.parseInt(st2.nextToken());
        int gCount = Integer.parseInt(st2.nextToken());
        int tCount = Integer.parseInt(st2.nextToken());

        char[] sArr = s.toCharArray();
        int startPointer = 0;
        int endPointer = pLength-1;
        int answer =0;

        int aCheck =0;
        int cCheck =0;
        int gCheck =0;
        int tCheck =0;

        for(int i=startPointer; i<=endPointer; i++ ){
            if(sArr[i] =='A'){
                aCheck++;
            } else if(sArr[i] == 'C'){
                cCheck++;
            } else if(sArr[i] == 'G'){
                gCheck++;
            } else if(sArr[i] == 'T'){
                tCheck++;
            }
        }

        while(endPointer<=sLength-1){
            if(aCheck>=aCount && cCheck>=cCount && gCheck>=gCount && tCheck>=tCount){
              answer++;
          }

          if(sArr[startPointer]=='A'){
              aCheck--;
          } else if(sArr[startPointer]=='C'){
              cCheck--;
          } else if(sArr[startPointer]=='G'){
              gCheck--;
          } else if(sArr[startPointer]=='T'){
              tCheck--;
          }

              startPointer++;
              endPointer++;

         if(endPointer<=s.length()-1) {

             if (sArr[endPointer] == 'A') {
                 aCheck++;
             } else if (sArr[endPointer] == 'C') {
                 cCheck++;
             } else if (sArr[endPointer] == 'G') {
                 gCheck++;
             } else if (sArr[endPointer] == 'T') {
                 tCheck++;
             }
         }
        }
        System.out.println(answer);

    }
}
