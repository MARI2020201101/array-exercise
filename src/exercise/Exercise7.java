package exercise;

public class Exercise7 {
    public static void main(String[] args) {
        char[][] star={
                {'*','*',' ',' ',' '},
                {'*','*',' ',' ',' '},
                {'*','*','*','*','*'},
                {'*','*','*','*','*'}
        };
        char[][] result = new char[star[0].length][star.length];

        for(int i =0 ; i<star.length;i++){
            for(int j=0; j<star[0].length;j++){
                System.out.print(star[i][j]);
            }
            System.out.println();
        }
        for(int i =0 ;i<star.length;i++){
            for(int j=0; j<star[0].length;j++){
                result[j][star.length-i-1]=star[i][j];
            }
        }
        System.out.println();
        for(int i =0 ; i<result.length;i++){
            for(int j=0; j<result[0].length;j++){
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}
