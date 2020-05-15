package com.saha.jenkinsApp;

import org.springframework.stereotype.Component;

@Component
public class BikeTyre {
	public String condition = "USED";

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}


}
