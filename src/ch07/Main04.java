package ch07;

/*
<피보나치 수열>
 */
//가장 느림
public class Main04 {
    public int DFS(int n){
        if (n==1) {
            return 1;
        } else if(n==2){
            return 1;
        } else {
            return DFS(n-2) + DFS(n-1);
        }
    }

    public static void main(String[] args) {
        Main04 T = new Main04();
        int n = 5;
        for(int i=1; i<=n; i++){
            System.out.print(T.DFS(i) + " ");
        }
    }
}
//중간
class Main041 {
    static int[] fibo;
    public int DFS(int n){
        if (n==1) {
            return fibo[n] = 1;
        } else if(n==2){
            return fibo[n] = 1;
        } else {
            return fibo[n] = DFS(n-2) + DFS(n-1);
        }
    }

    public static void main(String[] args) {
        Main041 T = new Main041();
        int n = 5;
        fibo = new int[n+1];
        T.DFS(n);
        for(int i=1; i<=n; i++){
            System.out.print(fibo[i] + " ");
        }
    }
}

//최고
class Main042 {
    static int[] fibo;
    public int DFS(int n){
        if (fibo[n] > 0){
            return fibo[n];
        } else if (fibo[n]==1) {
            return fibo[n] = 1;
        } else if(n==2){
            return fibo[n] = 1;
        } else {
            return fibo[n] = DFS(n-2) + DFS(n-1);
        }
    }

    public static void main(String[] args) {
        Main042 T = new Main042();
        int n = 5;
        fibo = new int[n+1];
        T.DFS(n);
        for(int i=1; i<=n; i++){
            System.out.print(fibo[i] + " ");
        }
    }
}