package TemplatePattern;

public class myMain {
	
	static BeverageTemplate beverage = null;

	public static void main(String[] args) {
		
		System.out.println("============TEA===============");
		BeverageTemplate Tea = new Tea();
		Tea.prepareRecipe();
		
		System.out.println("============TEA===============");
		BeverageTemplate Coffee = new Coffee();
		Coffee.prepareRecipe();
		
	}

}
