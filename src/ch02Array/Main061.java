package ch02Array;

import java.util.*;

/*
<뒤집은 소수>
N개 자연수 입력 -> 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력
910 뒤집으면 019에서 19됨 (첫 자리 0 무시)
3<=N<=100, 자연수 크기 100,000 이하
 */
public class Main061 {
    public boolean isPrime(int num){ //소수인가 확인
        if(num==1) {
            return false;
        }
        for(int i=2; i<num; i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
    public ArrayList<Integer> sol(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i=0; i<n; i++){
            int tmp = arr[i];
            int res = 0;
            while(tmp>0){
                int t = tmp%10;
                res = res*10 + t;
                tmp = tmp/10;
            }
            if(isPrime(res)){
                answer.add(res);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main061 T = new Main061();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for (int x : T.sol(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
