import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Swea1979 {
    public static void main(String[] args) {

    }
}


class Solution
{
    public static void main(String args[]) throws Exception
    {
        ArrayList<LocalTime> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();


        for(int test_case = 1; test_case <= T; test_case++)
        {
            int hour = sc.nextInt();
            int minute = sc.nextInt();

            int addHour = sc.nextInt();
            int addMinute = sc.nextInt();

            LocalTime time = LocalTime.of(hour,minute);
            time = time.plusHours(addHour);
            time = time.plusMinutes(addMinute);

            list.add(time);

        }
        int idx =1;


        for(LocalTime time: list)
        {
            System.out.println("#"+idx+" "+time.getHour()+" "+time.getMinute());
            idx++;
        }
    }
}