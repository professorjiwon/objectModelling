package _01_OCP;
/*
 * 개방 폐쇄 원칙(OCP, Open-Closed Principle)
   - 확장에 열려있어야 한다
     : 요구사항이 변경될 때 새로운 동작을 추가하여 애플리케이션의 기능을 확장할 수 있어야 한다.
   - 수정에 닫혀있어야 한다
     : 기존의 코드를 수정하지 않고 애플리케이션의 동작을 추가하거나 변경할 수 있어야 한다.
 */
class Player {
	void play() {
		System.out.println("play wav");
	}
	// 나중에 기능 추가
	void mp3Play() {
		System.out.println("play mp3");
	}
}
public class T01_OCP {
	public static void main(String[] args) {
		Player player = new Player();
		player.play();
		player.mp3Play();
	}
}
