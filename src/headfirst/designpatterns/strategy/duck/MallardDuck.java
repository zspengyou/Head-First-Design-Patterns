package headfirst.designpatterns.strategy.duck;

import headfirst.designpatterns.strategy.flyBehavior.FlyWithWings;
import headfirst.designpatterns.strategy.quackBehavior.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
