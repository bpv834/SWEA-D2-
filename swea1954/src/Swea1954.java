import java.util.Scanner;

public class Swea1954 {
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
            int[][] snail = new int[n][n];

            int st = 0;
            int ed = n-1;
            int top = 0;
            int bot = n-1;

            int i=1;
            int x=0; // 행
            int y=0; // 열
            System.out.println("#"+test_case);
            while(st<=ed && top<= bot){

                while(y<ed){
                    snail[x][y] = i++;
                    ++y;
                    if(i>n*n) break;
                }
                ++top;

                // 현재 x =0 / y =3
                while(x<bot){
                    snail[x][y] = i++;
                    ++x;
                    if(i>n*n) break;
                }

                --ed;


                // 현재 x =3 / y =3
                while(y>st){
                    snail[x][y] = i++;
                    --y;
                    if(i>n*n) break;
                }

                --bot;

                while(x>top){
                    snail[x][y] = i++;
                    --x;
                    if(i>n*n) break;
                }
                // 전부 돌았는데 마지막칸을 채우지 못한 경우 직접 채워준다.
                if(snail[x][y] == 0) snail[x][y] = n*n;
                ++st;
            }


            for(int q =0; q<n; q++){
                for(int w = 0; w<n; w++){
                    System.out.print(snail[q][w]+" ");
                }
                System.out.println();
            }

        }
    }
}
