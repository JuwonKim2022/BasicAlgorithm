package ch03TwoPointSlidingWindow;
import java.util.Scanner;
/*
<연속된 자연수의 합 2>
N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램
- 첫 번째 줄에 양의 정수 7<=N<=1000

=>몫과 나머지 : 15 일 경우!
1.2개의 숫자가능한가? 1,2 - (15-3)/2=6, 7,8 : 6을 동등하게 배분
2.3개의 숫자가능한가? 1,2,3 - (15-6)/3=3, 4,5,6 : 3을 동등하게 배분
...
 */
public class Main061 {
    public int sol(int n){
        int answer=0, cnt=1;
        n--;
        while(n>0){
            cnt++;
            n = n-cnt;
            if (n%cnt==0) answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Main061 T = new Main061();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.sol(n));
    }
}
