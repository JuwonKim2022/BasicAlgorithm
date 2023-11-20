package ch02Array;

import java.util.Scanner;

/*
OX문제 맞추기, 문제 일점, 연속으로 맞추면 +1 추가되어 점수, 틀리면 0
 */
public class Main071 {
    public int sol(int n, int[] arr){
        int answer = 0, cnt =0;

        for (int i=0; i<n; i++){
            if (arr[i]==1){
                cnt++;
                answer += cnt;
            }else{
                cnt = 0;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main071 T = new Main071();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(T.sol(n, arr));
    }
}
