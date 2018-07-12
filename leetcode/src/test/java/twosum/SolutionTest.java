package twosum;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Asus_User on 2018/7/12.
 */
public class SolutionTest {
    Solution sol = new Solution();
    @Test
    public void twoSum() {
        int[] nums = {2,7,11,15};
        int[] exp = {0,1};
        int[] res = sol.twoSum(nums,9);
        Assert.assertArrayEquals(exp,res);
    }
}