package inheritance;
/*오버로딩 : 하나의 클래스에 동일한 이름의 메소드(생성자를)작성
 * -메소드 오버로딩, 생성자 오버로딩
 * 
 * 오버라이딩 : 상속
 * -부모의 메소드와 동일한 시그니처(리턴타입,메소드명,매개변수를 가짐)
 */

public class SubListString extends ListString {
	String name = "성춘향";
	
	@Override
	public void List() {
		super.List();
		System.out.println(name+ " 하위 클래스 이름");
	}

	public void writer( ) {
		System.out.println("하위 클래스 name 값 "+this.name);
		System.out.println("하위 클래스 name 값 "+super.name);
		//list() 호출 - subListString, ListString
		List(); //this.list();
		super.List();
	}
	
	
	
	
}