package climbingstairs;

/**
 * Created by Asus_User on 2018/7/13.
 */
public class Solution {
    public int climbStairs(int n) {
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        int sum = 2;
        int sump = 1;
        int temp = 0;
        for(int i=2;i<n;i++){
            temp = sum;
            sum = sum + sump;
            sump = temp;
        }
        return sum;
    }
}
