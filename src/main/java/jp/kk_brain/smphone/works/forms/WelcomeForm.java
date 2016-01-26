package jp.kk_brain.smphone.works.forms;

import javax.ws.rs.FormParam;

import lombok.Data;

@Data
public class WelcomeForm {
	
	@FormParam("user_name")
	private String userName;
	
	@FormParam("message")
	private String message;
	
}
