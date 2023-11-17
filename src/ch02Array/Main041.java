package ch02Array;

import java.util.Scanner;

/*
피보나치 수열 술력. (앞에 두 숫자 더해서 다음에 나옴)
첫 줄에 총 항수는 3<=N<=45
 */
public class Main041 {
    public int[] sol(int n){
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;

        for (int i=2; i<n; i++){
            answer[i] = answer[i-2] + answer[i-1];
        }

        return answer;
    }

    public static void main(String[] args) {
        Main041 T = new Main041();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int x : T.sol(n)){
            System.out.println(x + " ");
        }
    }
}
