package _01_FactoryPattern_solution;

public class Product {
	private String name;
	private int price;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [이름=" + name + ", 가격=" + price + "]";
	}
}
