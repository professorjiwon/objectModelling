package _02_Builder4_solution;

public class SubwayBuilder {
	private int size;
	private String bread;
	private String cheese;
	private String extraTopping;
	private boolean vagetable;
	private String source;
	
	// 반드시 넣어야되는 것들은 생성자로
	public SubwayBuilder(int size, String bread, String source) {
		this.size = size;
		this.bread = bread;
		this.source = source;
	}

	// 생성자에 넣지 않은 필드들은 setter메서드 이용
	public SubwayBuilder setCheese(String cheese) {
		this.cheese = cheese;
		return this;
	}
	public SubwayBuilder setExtraTopping(String extraTopping) {
		this.extraTopping = extraTopping;
		return this;
	}
	public SubwayBuilder setVagetable(boolean vagetable) {
		this.vagetable = vagetable;
		return this;
	}

	public Subway build() {
		return new Subway(size, bread, cheese, extraTopping, vagetable, source);
	}
	
	@Override
	public String toString() {
		return "SubwayBuilder [size=" + size + ", bread=" + bread + ", cheese=" + cheese + ", extraTopping="
				+ extraTopping + ", vagetable=" + vagetable + ", source=" + source + "]";
	}
}
