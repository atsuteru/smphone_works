package jp.kk_brain.smphone.works;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.mvc.jsp.JspMvcFeature;

public class ApplicationSetting extends ResourceConfig {

	public ApplicationSetting() {
		//Jersey MVC を登録する
        packages(this.getClass().getPackage().getName());
        register(JspMvcFeature.class);
    }
}
