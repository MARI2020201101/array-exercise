package exercise;

public class Exercise4 {
    public static void main(String[] args) {
        int[] coinUnit = {500,100,50,10};
        int money = 2680;
        System.out.println("money = "+money);

        for(int i = 0; i<coinUnit.length ;i++){
            int tmp=0;
            tmp = money/coinUnit[i];
            money%=coinUnit[i];
            System.out.println(coinUnit[i] + "원: " + tmp);
        }
    }
}
