package exercise;

public class Exercise5 {
    public static void main(String[] args) {
        if(args.length!=1){
            System.out.println("no args");
            System.exit(0);
        }
        int money = Integer.parseInt(args[0]);
        System.out.println("money :" + money);

        int[] coinUnit = {500,100,50,10};
        int[] coin = {5,5,5,5};

        for(int i =0;i< coinUnit.length; i++){
            int coinNum=0;
            coinNum = money/coinUnit[i] > coin[i] ? 5 : money/coinUnit[i];
            money-=(coinNum*coinUnit[i]); //
            coin[i]-=coinNum;
            System.out.println(coinUnit[i] + " 원 : "+ coinNum);
        }

        if(money>0){
            System.out.println("거스름돈이 부족합니다.");
            System.exit(0);
        }
        System.out.println("= 남은 동전의 개수 =");
        for(int i = 0; i< coinUnit.length;i++){
            System.out.println(coinUnit[i] + "원 : " + coin[i]);
        }
    }
}
