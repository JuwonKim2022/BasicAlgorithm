package ch02Array;

import java.util.Scanner;

/*
등수구하기
N명의 학생 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램 작성
같은 점수일 경우 높은 등수로 동일 처리
 */
public class Main081 {
    public int[] sol(int n, int[] arr){
        int[] answer = new int[n];

        for (int i = 0; i<n; i++){
            int cnt = 1;
            for (int j=0; j<n; j++){
                if(arr[j] > arr[i]){
                    cnt++;
                }
            }
            answer[i] = cnt;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main081 T = new Main081();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for (int x : T.sol(n,arr)){
            System.out.print(x + " ");
        }
    }
}
