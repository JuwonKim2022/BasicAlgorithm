package ch09;

import java.util.*;

/*
 * <최대수입 스케쥴>
 * N개의 기업에서 강연 요청, 각 기업은 D일 안에 와서 강연 해 주면 M만큼의 강연료 추가
 * 가장 많은 돈 벌 수 있도록 스케쥴 짜기
 */

//내림차순 저장

class Lecture implements Comparable<Lecture>{
    public int money;
    public int time;
    Lecture(int money, int time){
        this.time = time;
        this.money = money;
    }
    @Override
    public int compareTo(Lecture ob) {
        return ob.time - this.time;
    }
}

class Main04{
    static int n, max=Integer.MIN_VALUE;
    public int sol(ArrayList<Lecture> arr) {
        int answer = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr); //날짜 큰 것부터 정렬
        int j=0;

        for(int i=max; i>=1; i--) {
            for(; j<n; j++) {
                if(arr.get(j).time < i) break;
                pQ.offer(arr.get(j).money);
            }
            if(!pQ.isEmpty()) answer+=pQ.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        Main04 T = new Main04();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int m = sc.nextInt();
            int d = sc.nextInt();
            arr.add(new Lecture(m, d));
            if(d > max) max = d;
        }
        System.out.println(T.sol(arr));
    }
}
