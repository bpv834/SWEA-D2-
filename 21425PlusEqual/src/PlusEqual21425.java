import java.util.Scanner;

public class PlusEqual21425 {

}

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        int[][] arr = new int[T][3];

        for(int i=0;i<T;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
        }

        for(int i=0;i<T;i++){
            int cnt = 0;
            int A = arr[i][0];
            int B = arr[i][1];
            int N = arr[i][2];


            while(A<=N && B<=N){
                cnt++;
                if(A>B){
                    B=B+A;
                }else{
                    A=A+B;
                }
            }
            System.out.println(cnt);
        }
    }
}
