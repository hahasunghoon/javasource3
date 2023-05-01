package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter @Setter
public class ChangeDTO {
	private String userid;
	private String cuurentPassword;
	private String newPassword;
	private String confirmPassword;

}
