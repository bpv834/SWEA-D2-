import java.util.Scanner;

public class Swea1976 {
}
class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int hour = sc.nextInt();
            int minute = sc.nextInt();

            int addHour = sc.nextInt();
            int addMinute = sc.nextInt();

            int[] time = new int[2];
            int[] addTime = new int[2];
            time[0] = hour;
            time[1] = minute;

            addTime[0] = addHour;
            addTime[1] = addMinute;

            int resultMinute = time[1] + addTime[1];
            int overHour = 0;


            overHour = resultMinute/60;
            resultMinute = resultMinute%60;



            int resultHour = overHour + time[0] + addTime[0];
            if(resultHour >12)
                resultHour = resultHour %12;

            if(resultHour == 0) resultHour = 12;

            System.out.println("#"+test_case+" "+resultHour+" "+resultMinute);





        }
    }
}