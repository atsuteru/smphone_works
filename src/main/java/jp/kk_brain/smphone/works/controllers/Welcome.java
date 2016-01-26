package jp.kk_brain.smphone.works.controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.server.mvc.Template;

import jp.kk_brain.smphone.works.forms.WelcomeForm;

@Path("/welcome")
public class Welcome {

	@GET
	@Path("/")
	@Template(name="/welcome/welcome")
	public WelcomeForm index() {
		WelcomeForm form = new WelcomeForm();
		form.setUserName("Kamiya");
		form.setMessage("Welcome!!");
		return form;
	}
	
	@GET
	@Path("/as/json")
	@Produces(MediaType.APPLICATION_JSON)
	public WelcomeForm asJson() {
		WelcomeForm form = new WelcomeForm();
		form.setUserName("Kamiya");
		form.setMessage("Welcome!!");
		return form;
	}
}
