package ch02Array;

import java.util.Scanner;

/*
소수(에라토스테네스 체 = 소수 구하는 방법론 중에서 가장 빠름) : 자연수 N이 입력되면 1부너 N까지의 소수의 개수를 출력하는 프로그램을 작성
첫 줄의 자연수 개수 2<=N<=200,000
 */
public class Main051 {
    public int sol(int n){
        int answer = 0;
        int[] ch = new int[n+1];

        for(int i = 2; i<=n; i++){
            if(ch[i]==0){
                answer++;
                for(int j=i; j<=n; j=j+i){
                    ch[j] = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main051 T = new Main051();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(T.sol(n));
    }
}
