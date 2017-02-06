package headfirst.designpatterns.templatemethod.barista;

import headfirst.designpatterns.templatemethod.barista.withHook.CoffeeWithHook;
import headfirst.designpatterns.templatemethod.barista.withHook.TeaWithHook;
import headfirst.designpatterns.templatemethod.barista.withoutHook.Coffee;
import headfirst.designpatterns.templatemethod.barista.withoutHook.Tea;

public class BeverageTestDrive {
	public static void main(String[] args) {
 
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
 
		System.out.println("\nMaking tea...");
		tea.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffee.prepareRecipe();

 
		TeaWithHook teaHook = new TeaWithHook();
		CoffeeWithHook coffeeHook = new CoffeeWithHook();
 
		System.out.println("\nMaking tea...");
		teaHook.prepareRecipe();
 
		System.out.println("\nMaking coffee...");
		coffeeHook.prepareRecipe();
	}
}
