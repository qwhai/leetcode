package LeetCode_0877;

import org.junit.Assert;
import org.junit.Test;

/**
 * TODO
 * <p>
 * Create Time: 2019-07-01 16:29
 * Last Modify: 2019-07-01
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class SolutionTests {

    @Test
    public void test1() {
        Assert.assertTrue(new Solution().stoneGame(new int[] { 5, 3, 4, 5 }));
    }

    @Test
    public void test2() {
        Assert.assertTrue(new Solution().stoneGame(new int[] { 1, 5, 3, 4, 5, 1 }));
    }

    @Test
    public void test3() {
        Assert.assertTrue(new Solution().stoneGame(new int[] { 7, 7, 12, 16, 41, 48, 41, 48, 11, 9, 34, 2, 44, 30, 27, 12, 11, 39, 31, 8, 23, 11, 47, 25, 15, 23, 4, 17, 11, 50, 16, 50, 38, 34, 48, 27, 16, 24, 22, 48, 50, 10, 26, 27, 9, 43, 13, 42, 46, 24 }));
    }
}
