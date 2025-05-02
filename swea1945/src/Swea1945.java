import java.util.Scanner;

public class Swea1945 {
}
class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        int[] pArr = new int[]{2,3,5,7,11};




        for(int test_case = 1; test_case <= T; test_case++)
        {
            int num = sc.nextInt();
            int[] arr = new int[5];
            for(int i=0; i<5; i++){
                int pow = 0;
                while(num%pArr[i] ==0){

                    num/=pArr[i];
                    ++pow;

                }
                arr[i] = pow;
                if(num==1) break;
            }
            System.out.print("#"+test_case+" ");
            for(int i=0;i<5;i++){
                System.out.print(arr[i] + " ");
            }

            System.out.println();
        }
    }
}