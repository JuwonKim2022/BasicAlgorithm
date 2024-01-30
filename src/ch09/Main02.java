package ch09;

import java.util.*;

/*
 * <회의실 배정>
 * 한 개의 회의실,n개의 회의 -> 회의실 사용표
 * 각 회의의 시작, 끝 시간 주어짐. 안 겹치게 하면서 사용할 수 있는 최대수, 중간 끊기 안됨, 끝남과 동시에 다음 회의 시작 가능
 * 회의 시작 시간과 끝나는 시간 같을 수 있음
 *
 * 그리드기법, 빠른거 부터 하면 최상의 결과
 */

class Time02 implements Comparable<Time02>{
    public int s, e;
    Time02(int s, int e){
        this.s = s;
        this.e = e;
    }
    @Override
    public int compareTo(Time02 o) {
        if(this.e == o.e) return this.s - o.s;
        else return this.e - o.e;
    }
}

class Main02{
    public int sol(ArrayList<Time02> arr, int n) {
        int cnt = 0;
        Collections.sort(arr);
        int et = 0;
        for(Time02 ob : arr) {
            if(ob.s >= et) {
                cnt++;
                et = ob.e;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Main02 T = new Main02();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time02> arr = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Time02(x, y));
        }
        System.out.println(T.sol(arr, n));
    }
}