package ch05StackQueu;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
응급실
- 의사 1명, 환자 N명, M번째 환자는 몇 번째로 진료 보나 출력
- 환자 도착 순서로 진료, 위험도 높으면 빨리 응급조치
-- 접수 순서대로 목록에서 제일 앞에 있는 환자목록 꺼냄
-- 나머지 대기 목록에서 꺼낸 환자보다 위험도 높은 환자가 존재하면 대기목록 제일 뒤로 다시 넣음

 */
class Person{
    int id;
    int priority;
    public Person(int id, int priority){
        this.id = id;
        this.priority = priority;
    }
}
public class Main081 {
    public int sol(int n, int m, int[] arr){
        int answer = 0;
        Queue<Person> Q = new LinkedList<>();

        for (int i=0; i<n; i++){
            Q.offer(new Person(i, arr[i]));
        }
        while (!Q.isEmpty()){
            Person tmp = Q.poll();
            for (Person x : Q){
                if (x.priority > tmp.priority){
                    Q.offer(tmp);
                    tmp=null;
                    break;
                }
            }
            if (tmp != null){
                answer++;
                if (tmp.id == m){
                    return answer;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main081 T = new Main081();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(T.sol(n,m,arr));
    }
}
