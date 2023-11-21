package ch03TwoPointSlidingWindow;

import java.lang.reflect.Array;
import java.util.*;

/*
공통원소 구하기 => A,B 두 집합 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력
 - 첫 번째 줄의 집합A 크기 1<=N<=30,000
 - 두 번째 줄에 N개의 원소가 주어짐. 원소가 중복되어 주어지지 않음
 - 세 번째 줄에 집합B 크기 1<=M<=30,000
 - 네 번째 줄에 M개의 원소가 주어짐. 원소가 중복되어 주어지지 않음
 각 집합 원소는 1,000,000,000 이하의 자연수

 해설 : 작은 수 포인트를 증가시키면서 소거, 공통 나오면 add -> 둘 다 동시에 증가시킴
 */
public class Main021 {
    public ArrayList<Integer> sol(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int p1=0, p2=0;
        while (p1<n && p2<m){
            if (a[p1] == b[p2]){
                answer.add(a[p1++]);
                p2++;
            }else if (a[p1]<b[p2]){
                p1++;
            }else {
                p2++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main021 T = new Main021();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i=0; i<m; i++){
            b[i] = sc.nextInt();
        }
        for (int x : T.sol(n, m, a, b)){
            System.out.println(x + " ");
        }
    }
}
