import java.util.Scanner;
import java.util.Stack;

public class Swea1989 {
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
            Stack<String> stack = new Stack<>();
            String str = sc.next();
            String cpStr = "";
            for(int i=0;i<str.length();i++){
                stack.push(str.substring(i,i+1));
            }

            while(!stack.isEmpty()){
                cpStr += stack.pop();
            }
            System.out.print("#"+""+test_case);
            if(str.equals(cpStr)){
                System.out.println(" 1");
            }else{
                System.out.println(" 0");
            }



        }
    }
}