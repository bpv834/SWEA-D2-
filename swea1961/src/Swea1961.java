import java.util.Scanner;

public class Swea1961 {
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

            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            int[][] arr90 = new int[n][n];
            int[][] arr180 = new int[n][n];
            int[][] arr270 = new int[n][n];

            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    arr[i][j] = sc.nextInt();
                }
            }

            //90도 회전
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    arr90[i][j] = arr[n-j-1][i];
                }
            }

            //180도 회전
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    arr180[i][j] = arr[n-1-i][n-1-j];
                }
            }

            //270도 회전
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    arr270[i][j] = arr[j][n-1-i];
                }
            }
            System.out.println("#"+test_case+" ");
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print(arr90[i][j]);
                }
                System.out.print(" ");
                for(int j=0; j<n; j++){
                    System.out.print(arr180[i][j]);
                }
                System.out.print(" ");
                for(int j=0; j<n; j++){
                    System.out.print(arr270[i][j]);
                }
                System.out.println();

            }

        }
    }
}