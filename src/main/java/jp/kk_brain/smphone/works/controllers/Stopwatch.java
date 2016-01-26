package jp.kk_brain.smphone.works.controllers;

import java.util.Calendar;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.glassfish.jersey.server.mvc.Template;

import jp.kk_brain.smphone.works.stopwatch.StopwatchForm;

@Path("/stopwatch")
public class Stopwatch {

	@GET
	@Path("/index")
	@Template(name="/stopwatch/welcome")
	public Object index() {
		return new Object();
	}

	@POST
	@Path("/start")
	@Template(name="/stopwatch/started")
	public StopwatchForm start() {
		StopwatchForm form = new StopwatchForm();
		form.setStartTime(String.format("%1$TH:%1$TM:%1$TS.%1$TL", Calendar.getInstance()));
		return form;
	}

	@POST
	@Path("/stop")
	@Template(name="/stopwatch/stoped")
	public StopwatchForm stop(@FormParam("startTime")String startTime) {
		StopwatchForm form = new StopwatchForm();
		form.setStartTime(startTime);
		form.setStopTime(String.format("%1$TH:%1$TM:%1$TS.%1$TL", Calendar.getInstance()));
		return form;
	}
}
