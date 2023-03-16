package lang;

public class Value {
	
	int value;
    
	//소스->파일
	Value(int value) {
		super();
		this.value = value;
	}
	//eq 클릭 컨트롤스페이스바 오버라이딩
	//Object 가 equals() 주소 비교로 넘겨줬음
	// 값 비교로 바꾸고싶은 상황 =>>오버라이딩
	@Override
	public boolean equals(Object obj) {
		//instanceof : 특정 객체의 인스턴스인지 확인
		// obj가 Value 객체의 인스턴스냐?
		if(obj instanceof Value) {
			Value v = (Value) obj;
			
			if(this.value == v.value) {
				return true;
			}
		}
		
		return false;
		
		//toString() : Object는 패키지명. 클래스명@hascode값
		//자손 toString() : 인스턴스에 대한 정보(멤버변수에 할당된 값)를 문자열로 제공하는 목적으로 사용
	
	  //소스->tostring
	}
	@Override
	public String toString() {
		return "Value [value=" + value + "]";
	}
}
