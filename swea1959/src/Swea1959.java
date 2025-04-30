import java.util.Scanner;

public class Swea1959 {
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
            int m = sc.nextInt();

            int[] arr1 = new int[n];
            int[] arr2 = new int[m];
            int[] lArr;
            int[] sArr;


            for(int i=0; i<n; i++){
                arr1[i] = sc.nextInt();
            }

            for(int i=0; i<m; i++){
                arr2[i] = sc.nextInt();
            }

            if(n>m){
                lArr = arr1;
                sArr = arr2;
            }else{
                lArr = arr2;
                sArr = arr1;
            }





            int dx = 0;
            int max = -1;
            while(dx<= lArr.length - sArr.length){
                int pt = 0;
                for(int i =0; i<sArr.length; i++){
                    pt += sArr[i]*lArr[i+dx];
                }
                max = Math.max(max,pt);
                ++dx;
            }
            System.out.println("#"+test_case+" "+max);


        }
    }
}