package programmers.basic;

public class Sol001ArrChange {
    public int[] sol(int[] arr){
        int[] answer = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            if(arr[i] >= 50 && arr[i]%2 == 0){
                arr[i] = arr[i]/2;
                answer[i] = arr[i];
            }else if(arr[i] < 50 && arr[i]%2 == 1){
                arr[i] = arr[i]*2;
                answer[i] = arr[i];
            }else{
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}
