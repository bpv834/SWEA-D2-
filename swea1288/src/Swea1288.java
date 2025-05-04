import java.util.HashSet;
import java.util.Scanner;

public class Swea1288 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();

    }

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
            HashSet<Integer> set = new HashSet<Integer>();

            int idx=1;
            int num = 0;
            while(true){
                num = n*idx++;

                String decimal =String.valueOf(num);

                for(int i=0; i<decimal.length(); i++){
                    char ch = decimal.charAt(i);

                    int nb =  ch - 48 ;
                    // System.out.println("nb = " + nb);

                    set.add(nb);
                }
                if(set.size() ==10 )break;
            }
            System.out.println("#"+test_case+" "+num);

        }
    }
}