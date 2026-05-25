import java.util.Arrays;
/*
there are two ways we can do it either by creating a new array or replacing the value inplace itself
 */
//Running Sum of 1d Array
public class Ques_1480 {
  public static void main(String [] agrs){
      //  by creating new array:
      int [] nums = {1, 2, 3, 4};
      int n = nums.length;
          int [] runningSum = new int[n];
          runningSum[0]=nums[0];
      for( int i =1; i<n; i++){
          runningSum [i] = runningSum[i-1]+nums[i];
      }

      System.out.println(Arrays.toString(runningSum));

      // [1, 3, 6, 10] -> output

  }
}

/*
By inplace method:
 int first= nums[0];
      for( int i =1; i<n; i++){
          nums [i] = nums[i-1]+nums[i];
      }
       nums[0]=first;
      System.out.println(Arrays.toString(nums));

 */
