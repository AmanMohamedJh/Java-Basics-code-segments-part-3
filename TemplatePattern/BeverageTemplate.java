package TemplatePattern;

public abstract class BeverageTemplate {

	final void prepareRecipe() {
		
		boilWater();
		brew();
		addCondiments();
		pourCup();
	
	}
	
	abstract void brew();
	
	abstract void addCondiments();
	
	void boilWater() {
		System.out.println("Boiling the water");
	}
	
	void pourCup() {
		System.out.println("pour into the cup");
	}
	
	
}
