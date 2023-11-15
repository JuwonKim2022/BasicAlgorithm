package ch02Array;

import java.util.ArrayList;
import java.util.Scanner;

/*
1<=N<=100개의 정수 입력, 자신의 바로 앞 수보다 큰 수만 출력(첫번째 수는 무조건 출력)
 */
public class Main011 {
    public ArrayList<Integer> sol(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i=1; i<n; i++){
            if(arr[i] >arr[i-1]){
                answer.add(arr[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main011 T = new Main011();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for (int x : T.sol(n, arr)){
            System.out.println(x + " ");
        }
    }
}
