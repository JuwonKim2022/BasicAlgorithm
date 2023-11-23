package ch04HashMapTreeSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*
<매출액 종류 - 해쉬>
N일 동안의 매출기록을 주고 연속된 K일 동안의 매출액의 종류를 각 구간별로 구하기
N일간의 매출기록과 연속구간의 길이 K가 주어지면 첫번째 구간부터 각 구간별 매출액의 종류를 출력하는 프로그램 작성
- 첫 번째 줄 : 5<=N<=100,000, 2<=K<=N
- 두 번째 줄 : N개의 숫자열, 각 숫자는 500 이하의 음이 아닌 정수
- 단어 길이 100이하
*/
public class Main051 {
    public ArrayList<Integer> sol(int n, int k, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> HM = new HashMap<>();
        return answer;
    }
    public static void main(String[] args) {
        Main051 T = new Main051();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for (int x : T.sol(n, k, arr)) System.out.println(x + " ");
    }
}
