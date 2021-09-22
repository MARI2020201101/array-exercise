package exercise;

public class Exercise2 {
    public static void main(String[] args) {
        int[][] arr ={
                {5,5,5,5,5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };

        int total = 0;
        float average = 0;

        for(int[] ar : arr){
            for(int a : ar){
                total +=a;
            }
        }
        average = (total*1.0f)/(arr.length*arr[0].length);
        System.out.println(total);
        System.out.println(average);
    }
}
