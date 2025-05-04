import java.util.Scanner;

public class Swea1204 {
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
            int caseNum = sc.nextInt();
            int[] arr = new int[101];
            int maxScore = -1;
            int maxPreq = -1;

            for(int i=0; i<1000; i++){
                int rate = sc.nextInt();
                arr[rate] = arr[rate]+1;

                if(maxPreq < arr[rate] || (maxPreq == arr[rate] && rate> maxScore)){
                    maxScore = rate;
                    maxPreq = arr[rate];
                }
            }
            System.out.println("#"+test_case+" "+maxScore);
        }
    }
}