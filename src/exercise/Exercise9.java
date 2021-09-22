package exercise;

public class Exercise9 {
    public static void main(String[] args) {
        int[][] score = {
                {100,100,100},
                {20,20,20},
                {30,30,30},
                {40,40,40},
                {50,50,50}
        };

        int[][] result = new int[score.length+1][score[0].length+1];
        for(int i =0;i<score.length;i++){
            int tmp =0;
            for(int j =0 ; j< score[0].length;j++){
                tmp+=score[i][j];
                result[i][j]=score[i][j];
            }
            result[i][result[0].length-1]=tmp;
        }


        for(int i=0;i <result[0].length;i++){
            int tmp=0;
            for(int j=0;j< result.length;j++){
                tmp += result[j][i];
            }
            result[result.length-1][i]=tmp;
        }


        for(int i =0;i<result.length;i++){
            for(int j =0 ; j< result[0].length;j++){
                System.out.printf("%4d",result[i][j]);
            }
            System.out.println();
        }
    }
}
