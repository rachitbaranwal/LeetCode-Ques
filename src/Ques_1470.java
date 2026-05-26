package arrays;

import java.util.Arrays;

//Shuffle the Array
public class Ques_1470 {
    public static void main(String [] args){
        int [] nums ={2, 5, 1, 3, 4, 7};
        int n = nums.length/2;
        int [] ans = new int[2*n];
        for(int i=0; i<n; i++){
            ans[2*i]= nums[i]; //0-> 2, 2->5, 4-> 1
            ans[2*i+1]= nums[i+n];//1-> 3, 3-> 4, 5-> 7,
        }
        System.out.println(Arrays.toString(ans)); //[2, 3, 5, 4, 1, 7]
    }
}
