package ch02Array;

import java.util.Scanner;

/*
피보나치 수열 술력. (앞에 두 숫자 더해서 다음에 나옴)
첫 줄에 총 항수는 3<=N<=45
 */
public class Main042 {
    public void sol(int n){
        int a = 1, b = 1, c;

        System.out.println(a + " " + b + " ");
        for (int i=2; i<n; i++){
            c = a + b;
            System.out.println(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Main042 T = new Main042();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        T.sol(n);
    }
}
