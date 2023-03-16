package generics; //box1 복사

/* Box2<T> : 지네릭 클래스, T Box2라고읽는다.
 * T : 타입변수 또ㅓ는 타입 매개변수
 * Box2 : 원시 타입(raw type)
 */
public class Box2<T> {
	private T item;
	//set 자동완성(T) 다시만들기
	
	public void setItem(T item) {
		this.item = item;
	}
	

	//get 자동완성(T) 다시만들기
	
	public T getItem() {
		return item;
	}
	
}
