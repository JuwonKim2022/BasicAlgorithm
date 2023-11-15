package ch02Array;

import java.util.Scanner;
/*
가위바위보 : 총 N번의 게임, A와 B가 해서 A가 이기면 A, B가 이기면 B, 비기면 D 출력
가위=1, 바위=2, 보=3
각 회를 누가 이겼나 출력하는 프로그램
 */
public class Main031 {
    public String sol(int n, int[] a, int[] b){
        String answer ="";

        for(int i=0; i<n; i++){
            if(a[i]==b[i]){
                answer += "D";
            }else if(a[i]==1 && b[i]==3){
                answer += "A";
            }else if(a[i]==2 && b[i]==1){
                answer += "A";
            }else if(a[i]==3 && b[i]==2){
                answer += "A";
            }else{
                answer += "B";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main031 T = new Main031();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            b[i] = sc.nextInt();
        }
        for(char x : T.sol(n, a, b).toCharArray()){
            System.out.println(x);
        }
    }
}
