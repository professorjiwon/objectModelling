package _01_FactoryPattern;

public class T01_FactoryPattern {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setName("Tv");
		System.out.println(p1);
		
		p1.setName("COMPUTER");
		System.out.println(p1);
	}
}
