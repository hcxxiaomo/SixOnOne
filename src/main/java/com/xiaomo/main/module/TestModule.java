package com.xiaomo.main.module;

import javax.servlet.http.HttpSession;

import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Fail;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;

@IocBean
@At("/test")
@Ok("json")
@Fail("http:500")
public class TestModule {

	private static final Log log = Logs.get();
	
//	 @Inject
//	 protected Dao dao;
	 
	 @At
	    public Object login(@Param("username")String name, @Param("password")String password, HttpSession session) {
	            return true;
	       
	    }
	 
	 @At
	    @Ok(">>:/")
	    public void logout(HttpSession session) {
	        session.invalidate();
	    }
	 
	 @At("/hello")
	    @Ok("jsp:jsp.hello")
	    public String doHello() {
	        return "Hello Nutz";
	    }
	 
}
