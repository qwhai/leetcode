package LeetCode_043;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        String result = solution.multiply("123555555555555555556789053543466876987908667423424234243423432423423445344355", "4562344231312890097867857674643534534234");

        Assert.assertEquals("563702976135548198764411835118773319056885588904434976010786681522352690705793282857192500708302440101705050666149070", result);
    }
}