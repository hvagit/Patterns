package decorator;

public class Main {
 
    public static final void main(String[] args) {
	Coffee c = new SimpleCoffee();
	System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());
 
	c = new Milk(new SimpleCoffee());
	System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());
 
	c = new Sprinkles(new Milk(new SimpleCoffee()));
	System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());
 
	c = new Whip(new Sprinkles(new Milk(new SimpleCoffee())));
	System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());
 
	// Note that you can also stack more than one decorator of the same type
	c = new Sprinkles(new Whip(new Sprinkles(new Milk(new SimpleCoffee()))));
	System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());
    }
 
}