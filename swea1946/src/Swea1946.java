import java.util.Scanner;

public class Swea1946 {
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
            System.out.println("#"+test_case);
            int n = sc.nextInt(); //3
            int idx=0;
            for(int i=0;i<n; i++){

                String str = sc.next(); //A
                int num = sc.nextInt(); //10
                while(num >0){
                    if(idx>9){
                        System.out.println();
                        idx=0;                }
                    else{
                        System.out.print(str);
                        idx++;
                        num--;
                    }
                }

            }
            System.out.println();






        }
    }
}