package com.nwl.lanya.po;

public class AccountCodeWithBLOBs extends AccountCode {
    private String pwd;

    private String userIntro;
    
    private String salt;
    

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUserIntro() {
        return userIntro;
    }

    public void setUserIntro(String userIntro) {
        this.userIntro = userIntro;
    }

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}
}