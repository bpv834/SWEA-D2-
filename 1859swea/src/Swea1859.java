import java.util.Scanner;

public class Swea1859 {

}

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int i=0;i<T;i++){
            int n= sc.nextInt();
            Long [] arr = new Long[n];



            // 배열에 값 채우기
            for(int j=0;j<n;j++){
                arr[j] = sc.nextLong();
            }
            // 총 이익
            Long maxValue = 0L;
            // 현재 인덱스까지 가장 큰 값 (판매가격)
            Long maxPrice = arr[n-1];

            // 뒤에서부터 판매하기
            for(int j=arr.length-2;j >=0 ; j--){


                if(arr[j] >maxPrice){
                    // 현재 인덱스 번째날이 판매가격보다 높은경우 팔 수없고, maxPrice 가격을 바꿔준다.
                    maxPrice = arr[j];
                }else{
                    // 팔아야 하는 날이라면
                    maxValue +=  maxPrice - arr[j];
                }
            }
            System.out.println("#"+(i+1)+" "+maxValue);
        }

    }
}
