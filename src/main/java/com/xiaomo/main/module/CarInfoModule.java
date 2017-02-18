package com.xiaomo.main.module;

import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Fail;
import org.nutz.mvc.annotation.Ok;

@IocBean
@At("/carInfo")
@Fail("http:500")
public class CarInfoModule {

	private static final Log log = Logs.get();
	
	
	@At
	@Ok("raw")
	 public String getInfo(String xtlb,String jkxlh,String jkid,String QueryXmlDoc) {
		 
		 log.infof("\n xtlb = %s \n jkxlh = %s \n jkid = %s \n QueryXmlDoc = %s", xtlb , jkxlh , jkid ,QueryXmlDoc);
		 
		 String xmlStr = "<root>"
					+ "<head>"
					+ "<code>1</code>"
					+ "<message>数据下载成功</message>"
					+ "</head>"
					+ "<body>"
					+ "<veh>"
					+ "<hpzl>来一个</hpzl>"
					+ "<hphm>东京1232132</hphm>"
					+ "<clxh>凯迪拉克</clxh>"
					+ "</veh>"
					+ "</body>"
					     + "</root>";  
		 
		 return xmlStr;
	    }
}
