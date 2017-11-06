package com.company.strategy.model;

import com.company.strategy.behavior.MyFlyBehavior2;
import com.company.strategy.behavior.MyQuackBehavior2;

public class LinDuck extends Duck{

	public LinDuck(){
		flyBehavior = new MyFlyBehavior2();
		quackBehavior = new MyQuackBehavior2();
	}

	public void display(){
		System.out.println("this is a LinDuck !");
	}
}