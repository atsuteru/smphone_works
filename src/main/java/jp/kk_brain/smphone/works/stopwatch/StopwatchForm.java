package jp.kk_brain.smphone.works.stopwatch;

import javax.ws.rs.FormParam;

import lombok.Data;

@Data
public class StopwatchForm {
	
	@FormParam("startTime")
	private String startTime;
	
	@FormParam("stopTime")
	private String stopTime;
	
	@FormParam("spanTime")
	private String spanTime;
	
}
