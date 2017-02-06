package headfirst.designpatterns.strategy.duck;

import headfirst.designpatterns.strategy.flyBehavior.FlyWithWings;
import headfirst.designpatterns.strategy.quackBehavior.Quack;

public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
