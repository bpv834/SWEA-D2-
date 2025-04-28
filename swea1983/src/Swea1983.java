import java.util.Arrays;
import java.util.Scanner;

public class Swea1983 {
}
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++)
        {
            // 0번에 학생번호, 1번에 점수 저장
            int n = sc.nextInt();
            int k = sc.nextInt();

            Double[][] info = new Double[n][2];

            for (int i = 0; i < n; i++) {
                double fTest = sc.nextDouble();
                double lTest = sc.nextDouble();
                double assignment = sc.nextDouble();

                double score = (fTest * 0.35 + lTest * 0.45 + assignment * 0.2);
                info[i][0] = (double)(i + 1);  // 학생 번호 (주의)
                info[i][1] = score;            // 총점
            }

            // [i][1] 기준으로 내림차순 정렬
            Arrays.sort(info, (a, b) -> Double.compare(b[1], a[1]));

            int rate = 1;
            for (int i = 0; i < n; i++) {
                // info[i][0]를 int로 변환해서 k와 비교

                if (info[i][0] == k) {
                    break;
                } else {
                    rate++;
                }
            }

            double rank = ((double) (rate) / n) * 100;

            // 상위 10 퍼센트 안에 든다는것은 rank ==10 이 아니고 rank <= 10임을 명심하자 이거떄매 한참 헤맸다!!!!

            System.out.print("#" + test_case + " ");
            if (rank <= 10.0) {
                System.out.println("A+");
            } else if (rank <= 20.0) {
                System.out.println("A0");
            } else if (rank <= 30.0) {
                System.out.println("A-");
            } else if (rank <= 40.0) {
                System.out.println("B+");
            } else if (rank <= 50.0) {
                System.out.println("B0");
            } else if (rank <= 60.0) {
                System.out.println("B-");
            } else if (rank <= 70.0) {
                System.out.println("C+");
            } else if (rank <= 80.0) {
                System.out.println("C0");
            } else if (rank <= 90.0) {
                System.out.println("C-");
            } else {
                System.out.println("D0");
            }
        }
    }
}