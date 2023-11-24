package ch03TwoPointSlidingWindow;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/*
<K번째 큰 수>
1~100 사이 자연수 적힌 N장 카드, 같은 숫자 카드 중복 가능
3장 뽑아 기록 - 모든 경우수 기록하기
- 첫 번째 줄에 자연수 5<=N<=100, 1<=K<=50
- 두 번째 줄에 N개의 카드값 입력
 ===> 해쉬 + set(중복제거)/TreeSet(중복제거+정렬)
 */
public class Main061 {
    public int sol(int[] arr, int n, int k){
        int answer=-1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                for (int l=j+1; l<n; l++){
                    Tset.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        int cnt = 0;
        for (int x : Tset){
            cnt++;
            if (cnt==k) return x;
        }
        return answer;
    }
    public static void main(String[] args) {
        Main061 T = new Main061();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(T.sol(arr, n, k));
    }
}

/*
<TreeSet method>
1. Tset.remove(143); 143 부분 지워라
2. Tset.size(); 원소 갯수 알려줌
3. Tset.first(); 내림차순에서 최대값, 오름차순에서 최소값
4. Tset.last(); 내림차순에서 최소값, 오름차순에서 최대값
*/