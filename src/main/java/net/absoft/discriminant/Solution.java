package net.absoft.discriminant;

public class Solution {

    private int firstRoot;
    private int secondRoot;

    public Solution(int firstRoot, int secondRoot) {
        this.firstRoot = firstRoot;
        this.secondRoot = secondRoot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Solution solution = (Solution) o;
        return firstRoot == solution.firstRoot && secondRoot == solution.secondRoot;
    }

}
