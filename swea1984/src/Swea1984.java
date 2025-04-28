import java.util.Arrays;
import java.util.Scanner;

public class Swea1984 {
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
            int[] arr = new int[10];
            double sum = 0.0;
            for(int i=0;i<10;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i=1;i<9;i++){
                sum+=arr[i];
            }
            // math.round(double) -> long 리턴 따라서 int로 강제 형변환
            int ans = (int) Math.round((sum / 8));
            System.out.println("#"+test_case+" "+ans);


        }
    }
}