package TemplatePattern;

public class Coffee extends BeverageTemplate {

	@Override
	void brew() {
		System.out.println("Brewing Coffee by stirring coffee");
	}

	@Override
	void addCondiments() {
		System.out.println("adding milk and coffee to tea");
	}

}
