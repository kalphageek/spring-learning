package me.kalpha.calc;

abstract class Calculator {
    int left, right;
    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
    }
    int _sum() {
        return left + right;
    }
    public abstract void sum();
    public abstract void avg();
    public void run() {
        sum();
        avg();
    }
}
