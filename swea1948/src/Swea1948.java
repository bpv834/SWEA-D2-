import java.util.HashMap;
import java.util.Scanner;

public class Swea1948 {
}
class Solution
{
    public static void main(String args[]) throws Exception
    {

        // 달력계산
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();


        for(int test_case = 1; test_case <= T; test_case++)
        {
            int month = sc.nextInt();
            int day = sc.nextInt();

            int addMonth = sc.nextInt();
            int addDays = sc.nextInt();

            int ans = 0;

            HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
            for(int k=1; k<=7;k++){
                if(k%2 !=0) map.put(k,31);
                else map.put(k,30);
            }
            for(int k=8; k<=12;k++){
                if(k%2 ==0) map.put(k,31);
                else map.put(k,30);
            }
            map.put(2,28);
            // 월에 끝 날짜 세팅완료

            if(month == addMonth) ans = addDays - day +1;
            else{
                // 1달 차이면
                if(addMonth - month == 1){
                    int theDays = map.get(month) - day +1 ;
                    ans = theDays + addDays;
                }

                else{
                    // 1달 차이가 아니면
                    // 만약 5월~7월이라면 5월에만 며칠인지 구함
                    int theDays = map.get(month) - day +1 ;
                    int otherDays = 0;
                    for(int j=month+1; j<addMonth ; j++){
                        otherDays+= map.get(j);
                    }
                    ans  = theDays+otherDays+addDays ;
                }
            }
            System.out.println("#"+test_case+" "+ans);
        }
    }
}