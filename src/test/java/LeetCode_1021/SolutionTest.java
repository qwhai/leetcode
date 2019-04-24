package LeetCode_1021;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Description TODO
 * @Author Q-WHai
 * @Date 2019/4/25 0:18
 */
public class SolutionTest {

    @Test
    public void test1() {
        Assert.assertEquals("()()()", new Solution().removeOuterParentheses("(()())(())"));
    }

    @Test
    public void test2() {
        Assert.assertEquals("()()()()(())", new Solution().removeOuterParentheses("(()())(())(()(()))"));
    }

    @Test
    public void test3() {
        Assert.assertEquals("", new Solution().removeOuterParentheses("()()"));
    }
}
