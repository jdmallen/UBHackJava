/**
 * 
 */
package com.jdmallen.ambutag.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.InterceptorRefs;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author jdmallen
 *
 */
@Action("index")
@Result(name = "success", location = "index.jsp")
public class IndexAction extends ActionSupport {
	
	public String execute() {
		return ActionSupport.SUCCESS;
	}

}
