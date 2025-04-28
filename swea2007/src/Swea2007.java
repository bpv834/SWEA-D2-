import java.util.Scanner;

public class Swea2007 {
    public static void main(String[] args) {

    }
}
class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        String[] strArr = new String[T];
        for(int i=0;i<T;i++){
            strArr[i] = sc.next();
        }

        for(int i=0;i<T;i++){
            String str = strArr[i];
            String initCh = str.substring(0,1);

            for(int j=1;j<str.length();j++){
                String ch = str.substring(j,j+1);
                if(initCh.equals(ch)){
                    if(str.substring(0,j).equals(str.substring(j,j*2))){
                        System.out.println("#"+(i+1)+" "+j);
                        break;
                    }
                }
            }

        }


    }
}
