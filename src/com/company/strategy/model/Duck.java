package com.company.strategy.model;

import com.company.strategy.behavior.FlyBehavior;
import com.company.strategy.behavior.QuackBehavior;

public class Duck{

	protected FlyBehavior flyBehavior;

	protected QuackBehavior quackBehavior;

	public void performFly(){
		flyBehavior.fly();
	}

	public void performQuack(){
		quackBehavior.quack();
	}

	public void  setterFlyBehavior(FlyBehavior flyBehavior){
		this.flyBehavior = flyBehavior;
	}

	public void setterQuackBehavior(QuackBehavior quackBehavior){
		this.quackBehavior = quackBehavior;
	}
}