package shop2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//DTO에는 생성자가 있어야함 , getter/setter, toString == >롬복 라이버러리 이용(프로젝트 포함)

@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class UserDTO {
	
	private int userId;
	private String name;
	private int payNo;
	
	//card, cash 정보 담을 변수
	private String type;
	
	
	

}
