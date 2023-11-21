package ch03TwoPointSlidingWindow;

import java.util.ArrayList;
import java.util.Scanner;

/*
두 배열 합치기 => 투 포인트 알고리즘으로 하라
오름차순으로 정렬이 된 두 배열이 주어지면, 두 배열을 오름차순으로 합쳐 출력하는 프로그램 작성
 - 첫 번째 줄의 첫번째 배열 크기 1<=N<=100
 - 두 번째 줄에 N개의 배열 원소가 오름차순으로 주어짐
 - 세 번째 줄에 두번째 배열의 크기 1<=M<=100
 - 네 번째 줄에 M개의 배열 원소가 오름차순으로 주어짐
 각 리스트 원소는 int 형 변수의 크기를 넘지 않음
 */
public class Main011 {
    public ArrayList<Integer> sol(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0, p2=0;

        while (p1<n && p2<m){
            if (a[p1]<b[p2]){
                answer.add(a[p1++]);      //p1 가리키는 값 add하고, p1 1 증가
            }else {
                answer.add(b[p2++]);
            }
            while (p1<n){
                answer.add(a[p1]++);
            }
            while (p2<m){
                answer.add(b[p2]++);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main011 T = new Main011();
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
