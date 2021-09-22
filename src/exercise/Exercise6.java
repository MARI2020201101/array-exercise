package exercise;

import java.util.Arrays;

public class Exercise6 {
    public static void main(String[] args) {
        int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
        int[] counter = new int[4];

        for(int i =0; i< answer.length;i++){
            counter[answer[i]-1]++;
        }
        System.out.println(Arrays.toString(counter));
        for(int i=0; i<counter.length;i++){
            String star ="";
            for(int j=0;j<counter[i];j++){
                star+="*";
            }
            System.out.println(counter[i] +" "+ star);
        }
    }
}
