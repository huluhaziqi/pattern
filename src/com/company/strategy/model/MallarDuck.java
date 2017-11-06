package com.company.strategy.model;

import com.company.strategy.behavior.MyFlyBehavior;
import com.company.strategy.behavior.MyQuackBehavior;

public class MallarDuck extends Duck {

	public MallarDuck(){
		this.flyBehavior = new MyFlyBehavior();
		this.quackBehavior = new MyQuackBehavior();
	}

	public void display(){
		System.out.println("this is a mallarDuck !");
	}

}