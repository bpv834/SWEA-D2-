import java.util.Scanner;

public class Swea1974 {
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
            int[][] board = new int [9][9];


            for(int i=0; i<9; i++){
                for(int j=0; j<9; j++){
                    board[i][j] = sc.nextInt();
                }
            }

            boolean isValid = true;
            for (int i=0; i< 9; i+=3){
                for(int j=0; j<9; j+=3){
                    // 메모
                    int []memo = new int[10];
                    for(int x=0; x<3; x++){
                        for(int y=0; y<3; y++){
                            int val = board[i+x][j+y];
                            if(memo[val] != 0) {
                                isValid = false;
                                break;
                            } memo[val] = ++memo[val];
                        }
                    }
                }
            }
            if(!isValid) System.out.println("#"+test_case+" "+0);
            else{
                for(int i=0; i<9; i++){
                    int[] memo = new int[10];
                    int[] memo2 = new int[10];
                    for(int j=0; j<9; j++){
                        int val = board[i][j];
                        int val2 = board[j][i];
                        if(memo[val] !=0){
                            isValid = false;
                            break;
                        }
                        if(memo2[val2] !=0){
                            isValid = false;
                            break;
                        }
                        memo[val] = ++memo[val];
                        memo2[val2] = ++memo2[val2];
                    }
                }
                if(isValid) System.out.println("#"+test_case+" "+1);
                else System.out.println("#"+test_case+" "+0);


            }


        }
    }
}