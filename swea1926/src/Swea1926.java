import java.util.Scanner;

public class Swea1926 {
    class Solution
    {
        public static void main(String args[]) throws Exception
        {

            Scanner sc = new Scanner(System.in);
            int T;
            T=sc.nextInt();
            for(int i=1;i<=T;i++){
                int j=i;
                String str = "";
                int cnt = 0;
                while(j>=1){
                    int n = j%10; // 1
                    //System.out.println("n: "+n);

                    if(n==3||n==6||n==9){
                        str="";
                        ++cnt;

                    }else{
                        str=n+str;
                    }
                    j=j/10;
                }
                //System.out.println("i= "+i+" cnt= "+cnt);

                if(cnt!=0){
                    if(cnt==1){
                        System.out.print("- ");
                    }else if(cnt==2){
                        System.out.print("-- ");
                    }else{
                        System.out.print("--- ");
                    }
                }else{
                    System.out.print(str+" ");
                }

            }
        }
    }
}
