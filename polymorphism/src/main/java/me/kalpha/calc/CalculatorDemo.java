package me.kalpha.calc;

import java.util.ArrayList;

public class CalculatorDemo {
    public static void execute(Calculator calculator) {
        System.out.println("Run Result");
        calculator.run();
    }

    public static void main(String[] args) {
        ArrayList<Calculator> arrayList = new ArrayList<Calculator>();

        Calculator c1 = new CalculatorDecoPlus();
        c1.setOperands(10, 20);
        arrayList.add(c1);

        Calculator c2 = new CalculatorDecoMinus();
        c2.setOperands(10, 20);
        arrayList.add(c2);

        for (int i = 0; i < arrayList.size(); i++) {
            execute(arrayList.get(i));
        }
    }
}
