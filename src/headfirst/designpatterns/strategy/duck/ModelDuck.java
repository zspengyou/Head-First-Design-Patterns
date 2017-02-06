package headfirst.designpatterns.strategy.duck;

import headfirst.designpatterns.strategy.flyBehavior.FlyNoWay;
import headfirst.designpatterns.strategy.quackBehavior.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
