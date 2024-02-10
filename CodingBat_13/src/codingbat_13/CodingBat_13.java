
package codingbat_13;

import java.util.Arrays;
import java.util.Random;


public class CodingBat_13 {

public static int []nums(){
    Random rn = new Random();
    int []nums = new int[rn.nextInt(20)+1];
    
    for(int i=0;i<nums.length;i++){
        nums[i] = rn.nextInt(2);
        
    }
     System.out.println(Arrays.toString(nums));
    return nums;
} 

public static int []evenOdd(int []nums){
    int []evenOdd = new int[nums.length];
    int start = 0;
    int last = nums.length-1;
    for(int i=0;i<nums.length;i++){
        if(nums[i]%2==0){
            evenOdd[start] = nums[i];
            start++;
        }
        if(nums[i]%2==1){
            evenOdd[last] = nums[i];
            last--;
        }
           
    }
        System.out.println(Arrays.toString(evenOdd));
    
    
    return  evenOdd;
}
    public static void main(String[] args) {
        evenOdd(nums());
    }
    
}
