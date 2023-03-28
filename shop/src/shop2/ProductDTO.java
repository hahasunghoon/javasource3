package shop2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
//@AllArgsConstructor
//@Data //@Getter @Setter @equals @canEqual @hashCode @ ToString 기본생성자 (한번에만듬)

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString

public class ProductDTO {
	
	private int productId;
	private String pname;
	private int price;
	private String content;

}
