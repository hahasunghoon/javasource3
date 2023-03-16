package inter;
/*인터페이스
 * 추상화 클래스
 * 추상 클래스보다 추상화 정도가 높음 => 일반메소드, 멤버변수 가질수없음
 * 기본설계도
 * 
 * 모든 멤버변수는 무조건 public, static ,final(생략가능) 이다.
 * 모든 메소드는 public abstract 임(생략가능)
 * 단, static 메소드와 디폴트 메소드는 사용이가능하다 (jdk8버너전부터 가능)
 */
public interface Account {
	//the blank final field x may not have been initialized
	final int x=0, y=0; // 모든 멤버변수는 무조건 public, static ,final(생략가능) 이다.
	// void stop() {} // Abstract methods do not specify a body
	// 모든 메소드는 public abstract 임(생략가능)
	void stop();
	
	//단, static 메소드와 디폴트 메소드는 사용이가능하다 (jdk8버너전부터 가능)
	static void print() {}
	default void add() {}

}
