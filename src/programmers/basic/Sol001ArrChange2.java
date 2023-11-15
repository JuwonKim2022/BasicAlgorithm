package programmers.basic;

import java.util.*;

public class Sol001ArrChange2 {
    public int[] sol(int[] arr){
        List<Integer> list = new ArrayList<>();

        for(int i : arr){
            if(i>=50 && i%2==0){
                list.add(i/2);
            }else if(i<50 && i%2==1){
                list.add(i*2);
            }else{
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
