import java.util.Scanner;

public class Swea1970 {
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
            int cost = sc.nextInt();
            int[] arr = new int[8];

            arr[0] = cost/50000;
            cost%= 50000;
            arr[1] = cost/10000;
            cost%=10000;
            arr[2] = cost/5000;
            cost%=5000;
            arr[3] = cost/1000;
            cost%=1000;
            arr[4] = cost/500;
            cost%= 500;
            arr[5] = cost/100;
            cost%= 100;
            arr[6]= cost/50;
            cost%=50;
            arr[7] = cost/10;

            System.out.println("#"+test_case+" ");
            for(int i=0; i<8 ; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();

        }
    }
}