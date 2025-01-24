package _03_Observer;
/*
 * Observer Pattern
   - 어떤 객체의 상태가 변할 때 그와 연관된 객체들에게 알림을 보내는 디자인 패턴
 */
public class T01_Observer {

	public static void main(String[] args) {
		Subject subject = new ConcreateSubject();
		
		ObserverA oa = new ObserverA();
		ObserverB ob = new ObserverB();
		
		// 구독자(감시자)를 등록
		subject.registerObserver(oa);
		subject.registerObserver(ob);
		
		subject.notifyObserver();
		System.out.println("-----------------");
		subject.notifyObserver();
		
		subject.removeObserver(oa);
		System.out.println("-----------------");
		
		subject.notifyObserver();
	}
}