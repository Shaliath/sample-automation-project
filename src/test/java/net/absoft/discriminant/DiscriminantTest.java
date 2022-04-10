package net.absoft.discriminant;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DiscriminantTest {

    @Test
    public void testVerifyPositiveDiscriminant() {
        Discriminant discriminant = new Discriminant();
        Solution solution = new Solution(5, -1);
        Assert.assertTrue(solution.equals(discriminant.findSolution(1, -4, -5)), "D > 0, so the result should be 2 distinct roots");
    }

    @Test
    public void testVerifyNegativeDiscriminant() {
        Discriminant discriminant = new Discriminant();
        Assert.assertNull(discriminant.findSolution(3, -4, 2), "D < 0, so the result should be null");
    }

    @Test
    public void testVerifyZeroDiscriminant() {
        Discriminant discriminant = new Discriminant();
        Solution solution = new Solution(-1, -1);
        Assert.assertTrue(solution.equals(discriminant.findSolution(2, 4, 2)), "D = 0, so the result should be 2 equal roots");
    }

}
