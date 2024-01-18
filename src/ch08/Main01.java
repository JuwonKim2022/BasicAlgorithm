package ch08;

import java.util.*;

    /*
     * <합이 같은 부분집합 - DFS>
     * N개 원소로 구성된 자연수 집합, 두 개의 부분집합으로 나눔
     * 둘의 합이 서로 같으면 YES, 아니면 NO
     */
    public class Main01 {
        static String answer = "NO";
        static int n, total = 0;
        boolean flag = false;
        public void DFS(int L, int sum, int[] arr) {
            if(flag) return;
            if(sum > total/2) return;
            if(L==n) {
                if((total-sum)==sum) {
                    answer="YES";
                    flag=true;
                }
            }else {
                DFS(L+1, sum+arr[L], arr);
                DFS(L+1, sum, arr);
            }
        }

        public static void main(String[] args) {
            Main01 T = new Main01();
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
                total += arr[i];
            }
            T.DFS(0, 0, arr);
            System.out.println(answer);
        }
    }
