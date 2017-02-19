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
					+ "<hpzl>号牌种类</hpzl>"
					+ "<hphm>号牌号码111</hphm>"
					+ "<clxh>车辆型号a</clxh>"
					+ "<clpp1>中文品牌ab</clpp1>"
					+ "<clsbdh>车辆识别代号32132</clsbdh>"
					+ "<fdjh>发动机号ba</fdjh>"
					+ "<csys>车身颜色</csys>"
					+ "<syr>机动车所有人32</syr>"
					+ "<ccdjrq>凯初次登记日期12fd</ccdjrq>"
					+ "<yxqz>检验有效期止</yxqz>"
					+ "<zt>机动车状态2</zt>"
					+ "<fdjxh>发动机型号克</fdjxh>"
					+ "</veh>"
					+ "</body>"
					     + "</root>";  
		 
		 return xmlStr;
	    }
}
