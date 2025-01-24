package _01_OCP;

public class SoundPlayer {
	private PlayInterface playInter;
	
	void setPalyInter(PlayInterface playInter) {
		this.playInter = playInter;
	}
	
	void play() {
		playInter.player();
	}
}
