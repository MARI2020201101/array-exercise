package exercise;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        String[][] words={
                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"integer", "정수"}
        };

        Scanner scanner = new Scanner(System.in);
        int cnt = 0;
        for(int i=0;i<words.length;i++){
            System.out.printf("Q%d. "+words[i][0] + " 의 뜻은?",i+1);
            String input= scanner.nextLine();
            if(input.equals(words[i][1])){
                System.out.println("정답입니다.");
                cnt++;
            }else{
                System.out.println("틀렸습니다. 정답은 "+words[i][1]+" 입니다.");
            }

        }
        System.out.println("전체 "+ words.length + "문제 중 " +cnt +"문제 맞추셨습니다.");
    }
}
