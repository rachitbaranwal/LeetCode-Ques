import java.util.Arrays;

// Build Array from Permutation
public class Ques_1920 {

    public static void main(String [] args){
        int [] nums= {0, 2, 1, 5, 3, 4};
        int n = nums.length;
        int [] ans = new int[n];
        for (int i =0; i<n; i++){
            ans[i] = nums[nums[i]];
        }
        System.out.println(Arrays.toString(ans));
           // [0, 1, 2, 4, 5, 3] -> output
    }
}
