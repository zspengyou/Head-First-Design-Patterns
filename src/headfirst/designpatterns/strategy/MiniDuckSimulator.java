package headfirst.designpatterns.strategy;

import headfirst.designpatterns.strategy.duck.DecoyDuck;
import headfirst.designpatterns.strategy.duck.Duck;
import headfirst.designpatterns.strategy.duck.MallardDuck;
import headfirst.designpatterns.strategy.duck.ModelDuck;
import headfirst.designpatterns.strategy.duck.RubberDuck;
import headfirst.designpatterns.strategy.flyBehavior.FlyRocketPowered;

public class MiniDuckSimulator {

	public static void main(String[] args) {

		MallardDuck mallard = new MallardDuck();
		RubberDuck rubberDuckie = new RubberDuck();
		DecoyDuck decoy = new DecoyDuck();

		Duck model = new ModelDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();

		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

	}
}
