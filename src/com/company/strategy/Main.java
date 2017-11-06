package com.company.strategy;

import com.company.strategy.model.LinDuck;
import com.company.strategy.model.MallarDuck;
import com.company.strategy.behavior.MyFlyBehavior2;
import com.company.strategy.behavior.MyQuackBehavior;

public class Main {
    public static void main(String[] args) {
        MallarDuck mallarDuck = new MallarDuck();
        mallarDuck.performFly();
        mallarDuck.performQuack();
        mallarDuck.setterFlyBehavior(new MyFlyBehavior2());
        mallarDuck.performFly();
        LinDuck linDuck = new LinDuck();
        linDuck.performFly();
        linDuck.performQuack();
        linDuck.setterQuackBehavior(new MyQuackBehavior());
        linDuck.performQuack();
    }
}
