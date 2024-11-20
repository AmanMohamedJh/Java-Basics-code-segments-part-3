package TemplatePattern;

public class Tea extends BeverageTemplate {

	@Override
	void brew() {
		System.out.println("Brewing tea");
	}

	@Override
	void addCondiments() {
		System.out.println("adding lemon to tea");
	}

}
