import LeetCode_0101.Solution;
import LeetCode_0101.TreeNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Q-WHai
 * @Date: Created in 18:15 2019/04/22
 */
public class LeetCode_0101_Tests {

    @Test
    public void test1() {
        TreeNode root = new TreeNode(1);
        {
            root.left = new TreeNode(2);
            {
                root.left.left = new TreeNode(3);
                root.left.right = new TreeNode(4);
            }

            root.right = new TreeNode(2);
            {
                root.right.left = new TreeNode(4);
                root.right.right = new TreeNode(3);
            }
        }

        Assert.assertTrue(new Solution().isSymmetric(root));
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(1);
        {
            root.left = new TreeNode(2);
            {
                root.left.right = new TreeNode(3);
            }

            root.right = new TreeNode(2);
            {
                root.right.right = new TreeNode(3);
            }
        }

        Assert.assertFalse(new Solution().isSymmetric(root));
    }

    @Test
    public void test3() {
        //[1,2,3,3,null,2,null]
        TreeNode root = new TreeNode(1);
        {
            root.left = new TreeNode(2);
            {
                root.left.left = new TreeNode(3);
            }

            root.right = new TreeNode(3);
            {
                root.right.left = new TreeNode(2);
            }
        }

        Assert.assertFalse(new Solution().isSymmetric(root));
    }

    @Test
    public void test4() {
        // [5,4,1,null,1,null,4,2,null,2,null]
        TreeNode root = new TreeNode(5);
        {
            root.left = new TreeNode(4);
            {
                root.left.right = new TreeNode(1);
                {
                    root.left.right.left = new TreeNode(2);
                }
            }

            root.right = new TreeNode(1);
            {
                root.right.right = new TreeNode(4);
                {
                    root.right.right.left = new TreeNode(2);
                }
            }
        }

        Assert.assertFalse(new Solution().isSymmetric(root));
    }

    @Test
    public void test5() {
        TreeNode root = new TreeNode(1);
        {
            root.left = new TreeNode(2);
            root.right = new TreeNode(3);
        }

        Assert.assertFalse(new Solution().isSymmetric(root));
    }
}
