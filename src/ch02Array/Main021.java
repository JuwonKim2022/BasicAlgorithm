package ch02Array;

import java.util.Scanner;

/*
N명 줄 세우기, 앞에서부터 볼 수 있는 수, 자기 앞보다 크면 보이고, 작거나 같으면 안 보임. 5<=N<=100000
 */
public class Main021 {
    public int sol(int n, int[] arr){
        int answer = 1;
        int max = arr[0];

        for(int i=1; i<n; i++){
            if(arr[i] > max){
                answer ++;
                max = arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main021 T = new Main021();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(T.sol(n, arr));
    }
}
