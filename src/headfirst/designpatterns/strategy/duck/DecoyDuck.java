package headfirst.designpatterns.strategy.duck;

import headfirst.designpatterns.strategy.flyBehavior.FlyNoWay;
import headfirst.designpatterns.strategy.quackBehavior.MuteQuack;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
