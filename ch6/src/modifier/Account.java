package modifier;

 public class Account {
	 //속성(인스턴스변수) ==> private 막아버린다
	 //외부에서는 속성에 직접적으로 접근 불가
	 //인스턴스변수의 값을 변경or 얻어내거나 싶다면 ? ==> 메소드로 처리
	 private String ano;

	 //getter // setter메소드 활용 오른쪽마우스->소스->겟앤셋
	
	 public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	 
	

	 
	 
	 
}
