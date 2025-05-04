import java.util.HashMap;
import java.util.Scanner;

public class Swea1928 {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
        HashMap<Character,Integer> chMap = new HashMap<Character,Integer>();
        char[] chArr = str.toCharArray();
    }
}

class Solution
{
    public static void main(String args[]) throws Exception
    {
        // 전체 디코딩 문자 종류
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
        char[] chArr = str.toCharArray();
        HashMap<Character,Integer> chMap = new HashMap<Character,Integer>();

        for(int i=0; i<chArr.length; i++){
            chMap.put(chArr[i],i);
            // 표에 A -> 0, B->1 ... a -> 26, +->62 ,/ ->63 이라고 돼있음
        }


        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            // Base 64 인코딩된 문자열을 입력받는다
            String encodingStr = sc.next();
            // 인코딩된 문자열을 ch 배열에 나눠 담는다.
            char[] encodingArr = new char[encodingStr.length()];
            // 인코딩된 문자에 해당 정수값을 넣는 배열
            int[] encodingIntArr = new int[encodingStr.length()];
            // 이진수배열
            String[] binaryArr = new String[encodingStr.length()];
            // 이진코드로 바뀐 전체 스트링을 보관할 문자열
            String allStr = "";

            //System.out.println("encodingArr= "+encodingArr);
            // 인코딩된 str 을 차배열로 변환해서 해당배열에 할당한다
            encodingArr = encodingStr.toCharArray();

            for(char ch :encodingArr){
                //System.out.println("ch= "+ch);
            }

            for(int i=0; i<encodingArr.length ; i++){
                // 인코딩Int 배열에 해당값을 넣는다 T=> 19, G=>6 ...
                encodingIntArr[i] = chMap.get(encodingArr[i]);
            }

            for(int i=0; i<encodingArr.length ; i++){
                //System.out.println("decodingIntArr[i] = " +decodingIntArr[i]);
            }

            for(int i=0; i<encodingArr.length ; i++){
                // 바이너리 배열에 담는다
                String binStr = Integer.toBinaryString(encodingIntArr[i]);
                String newStr = "";
                //6자리로 맞춘후 ""는 0으로 변환
                // format 6자리로 할당하면 빈 문자열은 공백으로 전환됨
                newStr = String.format("%6s",binStr).replace(" ","0");

                binaryArr[i] = newStr;
            }

            for(int i=0; i<encodingArr.length ; i++){
                //System.out.println("encodingIntArr[i]= "+encodingIntArr[i]+" binaryArr[i] = " +binaryArr[i]);
                // 변환한 진수를 한 문자열에 전부 합친다 8자리로 슬라이싱 하기위해
                allStr += binaryArr[i];
            }
            // System.out.println("allStr= "+allStr);

            String ans = "";

            // 8자리로 슬라이싱
            for(int i=0;i<(allStr.length())/8;i++){
                String bin8 = allStr.substring(i*8,(i+1)*8);
                //System.out.println("bin8= "+bin8);
                // 이진수 문자열을 정수로 변환한다
                int chara = Integer.parseInt(bin8,2);
                //System.out.println("str= "+chara);
                // 정수값을 char로 명시적  형변환 한다.
                char newChar = (char) chara;
                ans += newChar;
            }
            System.out.println("#"+test_case+" "+ans);

        }
    }
}