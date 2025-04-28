import java.util.Scanner;
import java.util.Stack;

public class Swea2001 {
}

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();



        for (int test_case = 1; test_case <= T; test_case++)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[n][n];
            int max = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i <= n - m; i++) {
                for (int j = 0; j <= n - m; j++) {
                    int point = 0;

                    // m x m 범위 더하기
                    for (int x = 0; x < m; x++) {
                        for (int y = 0; y < m; y++) {
                            point += arr[i + x][j + y];
                        }
                    }

                    max = Math.max(max, point);
                }
            }

            System.out.println("#" + test_case + " " + max);
        }
    }
}