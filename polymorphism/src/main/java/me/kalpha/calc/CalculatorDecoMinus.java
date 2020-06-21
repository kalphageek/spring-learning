package me.kalpha.calc;

public class CalculatorDecoMinus extends Calculator{
    @Override
    public void sum() {
        System.out.println("- sum" +  _sum());
    }

    @Override
    public void avg() {
        System.out.println("- avg" + (this.left+this.right)/2);
    }
}
