package _02_Builder4_solution;

public class T01_SubwayBuilder {

	public static void main(String[] args) {
		Subway menu1 = new SubwayBuilder(15, "통밀", "머스터드")
				.setCheese("모자렐라")
				.build();
		
		System.out.println(menu1);
		
		Subway menu2 = new SubwayBuilder(14, "밀", "핫소스")
				.setVagetable(true)
				.setExtraTopping("토마토")
				.build();
		System.out.println(menu2);
		
		
	}

}
