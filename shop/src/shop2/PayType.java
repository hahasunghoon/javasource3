package shop2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//열거타입 enum
//한정된 값만을 갖는 데이터 타입

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString
public class PayType {
    
	private int payNo;
	private String info;
	

}
