package net.absoft.discriminant;

public class Discriminant {

    public Solution findSolution(int a, int b, int c) {
        Solution solution = null;

        int discriminant = b * b - 4 * a * c;

        if (discriminant >= 0) {
            int x1 = (int) ((-b + Math.sqrt(discriminant))/(2 * a));
            int x2 = (int) ((-b - Math.sqrt(discriminant))/(2 * a));
            solution = new Solution(x1, x2);
        }

        return solution;
    }

}
