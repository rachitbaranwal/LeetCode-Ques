
//Richest Customer Wealth
public class Ques_1672 {
    public static void main(String [] args) {
        int[][] wealth = {
                {1, 2, 3},
                {3, 2, 1}
        };
        int maxwealth = 0;
        for (int person = 0; person < wealth.length; person++) {
            int rowmaxwealth = 0;
            for (int amount = 0; amount < wealth[person].length; amount++) {
                rowmaxwealth += wealth[person] [amount];
            }
            if(rowmaxwealth>maxwealth){
                maxwealth=rowmaxwealth;
            }
        }
        System.out.println(maxwealth);
    }
}
