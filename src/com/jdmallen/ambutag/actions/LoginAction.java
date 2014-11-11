package com.jdmallen.ambutag.actions;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Jesse
 *
 */
public class LoginAction extends ActionSupport {

	private String username;
    private String password;
 
    /* (non-Javadoc)
     * @see com.opensymphony.xwork2.ActionSupport#execute()
     */
    public String authenticate() {
 
        if (this.username.equals("admin") 
                && this.password.equals("admin123")) {
            return "success";
        } else {
            return "error";
        }
    }

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
