package com.nwl.lanya.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("propertiesUtil")
public class PropertiesUtil {

	@Value("${lanya.salt}")
	private String salt;
	
	@Value("${lanya.initPwd}")
	private String initPwd;
	
	@Value("${lanya.imgSoureUrl}")
	private String imgSoureUrl;
	
	@Value("${lanya.imgHttpUrl}")
	private String imgHttpUrl;

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getImgSoureUrl() {
		return imgSoureUrl;
	}

	public void setImgSoureUrl(String imgSoureUrl) {
		this.imgSoureUrl = imgSoureUrl;
	}

	public String getImgHttpUrl() {
		return imgHttpUrl;
	}

	public void setImgHttpUrl(String imgHttpUrl) {
		this.imgHttpUrl = imgHttpUrl;
	}

	public String getInitPwd() {
		return initPwd;
	}

	public void setInitPwd(String initPwd) {
		this.initPwd = initPwd;
	}
	
}
