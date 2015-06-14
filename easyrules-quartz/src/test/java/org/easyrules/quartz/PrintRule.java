package org.easyrules.quartz;

import org.easyrules.annotation.Action;
import org.easyrules.annotation.Condition;
import org.easyrules.annotation.Rule;

/**
 * Created by Sunand on 6/8/2015.
 */
@Rule(name = "Print", description = "Check if number greater than zero and then print")
public class PrintRule {

    private int number;

    public PrintRule(int number) {
        this.number = number;
    }

    @Condition
    public boolean checkNumber() {
        return number > 0;
    }

    @Action
    public void printNumber() {
        System.out.println("Number : " + number);
    }
}