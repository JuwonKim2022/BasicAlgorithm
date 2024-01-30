package ch09;

import java.util.*;

/*
 * <결혼식>
 * 다음 달 결혼식, 피로연 장소 빌려 3일간 쉬지 않고 함, N명 참석하는 친구에세 시간 정보 미리 요구(몇 시에 와서 몇 시에 떠나나 알려줌)
 * 동시에 존재하는 최대 인원 구하여 장소 구함
 */
class Time03 implements Comparable<Time03>{
    public int time;
    public char state;
    Time03(int time, char state){
        this.time = time;
        this.state = state;
    }
    @Override
    public int compareTo(Time03 ob) {
        if(this.time == ob.time) return this.state - ob.state;
        else return this.time - ob.time;
    }
}

class Main03{
    public int sol(ArrayList<Time03> arr) {
        int answer = Integer.MIN_VALUE;
        Collections.sort(arr);
        int cnt =0;
        for(Time03 ob : arr) {
            if(ob.state == 's') cnt++;
            else cnt--;
            answer = Math.max(answer ,  cnt);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main03 T = new Main03();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time03> arr = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int sT = sc.nextInt();
            int eT = sc.nextInt();
            arr.add(new Time03(sT, 's'));
            arr.add(new Time03(eT, 's'));
        }
        System.out.println(T.sol(arr));
    }
}


