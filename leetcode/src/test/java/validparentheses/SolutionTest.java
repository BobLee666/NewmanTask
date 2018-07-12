package validparentheses;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Asus_User on 2018/7/12.
 */
public class SolutionTest {
    Solution sol = new Solution();
    @Test
    public void isValid(){
        Assert.assertEquals( false,sol.isValid(")"));
        Assert.assertEquals( true,sol.isValid("()[]{}"));
        Assert.assertEquals( false,sol.isValid("(}"));
        Assert.assertEquals( false,sol.isValid("([)]"));
        Assert.assertEquals( true,sol.isValid("{[]}"));
    }

}