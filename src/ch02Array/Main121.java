package ch02Array;

import java.util.Scanner;

/*
멘토링 : 멘토 - 멘티
M번의 수학 시험에서 A가 B보다 모두 성정이 좋아야 멘토 가능
짝 만들 수 있는 경우의 수는?
학생수는 N

 */
public class Main121 {
    public int sol(int n, int m, int[][] arr){
        int answer = 0;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++) {
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    int pi =0, pj = 0;
                    for (int s=0; s<n; s++) {
                        if (arr[k][s]==i){
                            pi = s;
                        }
                        if (arr[k][s]==j){
                            pj = s;
                        }
                        if (pi < pj){
                            cnt++;
                        }
                    }
                    if(cnt == m){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main121 T = new Main121();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i=0; i<m; i++){ //i 학생 번호
            for (int j=0; j<n; j++){ //j 학년
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print(T.sol(n, m, arr));
    }
}
