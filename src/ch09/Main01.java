package ch09;

import java.util.*;

/*
 * <씨름선수> -
 * 씨름 선수 선발 공고, N명 지원자, 각 지원자 키 몸무게 알고 있음
 * A라는 지원자를 다른 모든 지원자와 일대일 비교해서 키와 몸무게 모두 A지원자보다 높은 지원자가 존재하면 A지원자 탈락, 그렇지 않으면 선발
 * N명 지원자 주어지면, 위의 선발원칙으로 최대 몇 명의 선수 선발 가능
 */

class Body01 implements Comparable<Body01>{
    public int h, w;
    Body01(int h, int w){
        this.h = h;
        this.w = w;
    }
    @Override
    public int compareTo(Body01 o) {
        return o.h - this.h;
    }
}

class Main01{
    public int sol(ArrayList<Body01> arr, int n) {
        int cnt = 0;
        Collections.sort(arr);
        int max = Integer.MIN_VALUE;
        for(Body01 ob : arr) {
            if(ob.w > max) {
                max = ob.w;
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Main01 T = new Main01();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Body01> arr = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            arr.add(new Body01(h, w));
        }
        System.out.println(T.sol(arr, n));
    }
}