package com.expleo.QE;

//import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class Calculator {
    private int total;

    public Calculator() {
        this.total = 0;
    }

    public Calculator(int amount) {
        this.total = amount;
    }

    @Step("Add the two integers")
    public void add(int amount1,int amount2)
    {

        this.total = amount1 + amount2;
    }

    @Step
    public int getTotal() {

        return total;
    }
}