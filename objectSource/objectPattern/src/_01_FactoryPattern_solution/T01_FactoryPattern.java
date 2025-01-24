package _01_FactoryPattern_solution;

public class T01_FactoryPattern {

	public static void main(String[] args) {
		Product p1 = ProductFactory.getInstance("TV");
		System.out.println(p1);
		
		p1 = ProductFactory.getInstance("computer");
		System.out.println(p1);
	}
}
