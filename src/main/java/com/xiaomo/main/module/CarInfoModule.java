package com.xiaomo.main.module;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Fail;
import org.nutz.mvc.annotation.Ok;

import com.xiaomo.main.bean.DemoCarNumber;
import com.xiaomo.main.service.DemoCarNumberService;
import com.xiaomo.main.utils.JkidEnum;


@IocBean
@At("/carInfo")
@Fail("http:500")
public class CarInfoModule {

	private static final Log log = Logs.get();
	
	@Inject
	protected DemoCarNumberService demoCarNumberService;
	
	@At
	@Ok("raw")
	 public String getInfo(String xtlb,String jkxlh,String jkid,String QueryXmlDoc) {
		 
		 log.infof("\n xtlb = %s \n jkxlh = %s \n jkid = %s \n QueryXmlDoc = %s", xtlb , jkxlh , jkid ,QueryXmlDoc);
		 if (JkidEnum.Cxjdcjb.getString().equals(jkid)) {
			 Document document = null;
			 try {
				 document = DocumentHelper.parseText(QueryXmlDoc);
			 } catch (DocumentException e) {
				 log.error("document = DocumentHelper.parseText(QueryXmlDoc);", e);
			 }
			 // 获取根元素  
			 Element root = document.getRootElement();  
//        System.out.println("Root: " + root.getName()); 
			 Element QueryCondition = root.element("QueryCondition");
			 Element hpzm = QueryCondition.element("hpzm");
			 String hpzmStr = hpzm.getText();
//        Element message = head.element("message");
//        String messageStr = message.getText();
			 try {
				log.infof("hpzmStr= %s" ,URLDecoder.decode(hpzmStr, "utf-8"));
			} catch (UnsupportedEncodingException e) {
				log.error("CarInfoModule.getInfo.decode error",e);
			}
			 DemoCarNumber dcn =  demoCarNumberService.getDomeByhpzm(hpzmStr);
			 if (dcn != null) {
				 StringBuilder sb = new StringBuilder();
				 sb.append("<root>"
						 + "<head>"
						 + "<code>1</code>"
						 + "<rownum>1</rownum>"
						 + "<message>数据下载成功</message>"
						 + "</head>"
						 + "<body>"
						 + "<veh>")
				 .append("<hpzl>").append(dcn.getTypeHpzl()).append("</hpzl>")
				 .append("<hphm>").append(dcn.getCarNumberHpzm()).append("</hphm>")
				 .append("<clxh>").append(dcn.getTypeClxh()).append("</clxh>")
				 .append("<clpp1>").append(dcn.getBrandClpp1()).append("</clpp1>")
				 .append("<clsbdh>").append(dcn.getVinClsbdh()).append("</clsbdh>")
				 .append("<fdjh>").append(dcn.getEngineNumberFdjh()).append("</fdjh>")
				 .append("<csys>").append(dcn.getColorCsys()).append("</csys>")
				 .append("<syr>").append(dcn.getOwnerSyr()).append("</syr>")
				 .append("<ccdjrq>").append(dcn.getFirstRegisterTimeCcdjrq()).append("</ccdjrq>")
				 .append("<yxqz>").append(dcn.getTestValidityTimeYxqz()).append("</yxqz>")
				 .append("<zt>").append(dcn.getStatusZt()).append("</zt>")
				 .append("<fdjxh>").append(dcn.getEngineTypeFdjxh()).append("</fdjxh>")
				 .append("<legal>").append(dcn.getLegal()).append("</legal>")
				 .append("</veh>"
						 + "</body>"
						 + "</root>");
				 
				 return sb.toString();
			 }else {
				 return  "<root>"
						 + "<head>"
						 + "<code>1</code>"
						 + "<message>数据下载成功</message>"
						 + "</head>"
						 + "<body>"
						 + "<veh>"
						 + "<hpzl>默认数据</hpzl>"
						 + "<hphm>默认数据</hphm>"
						 + "<clxh>车辆默认数据</clxh>"
						 + "<clpp1>中文品牌默认数据</clpp1>"
						 + "<clsbdh>车辆识别代号默认数据</clsbdh>"
						 + "<fdjh>发动机号默认数据</fdjh>"
						 + "<csys>车身颜色默认数据</csys>"
						 + "<syr>机动车所有人默认数据</syr>"
						 + "<ccdjrq>凯初次登记日期默认数据12fd</ccdjrq>"
						 + "<yxqz>检验有效期止默认数据</yxqz>"
						 + "<zt>机动车状态2默认数据</zt>"
						 + "<fdjxh>发动机型号默认数据克</fdjxh>"
						 + "<legal>否</legal>"
						 + "</veh>"
						 + "</body>"
						 + "</root>";  
			 }
		}else if(JkidEnum.Cxjdcgz.getString().equals(jkid)){
			return  "<root>"
					 + "<head>"
					 + "<code>1</code>"
					 + "<message>数据下载成功</message>"
					 + "</head>"
					 + "<body>"
					 + "<BasApprizequeueveh>"
					 + "<xh>告知11单号</xh>"
					 + "<jdcxh>机11动车序号</jdcxh>"
					 + "<hpzl>号牌11种类</hpzl>"
					 + "<hphm>号牌11号码</hphm>"
					 + "<fzjg>发证11机关</fzjg>"
					 + "<ywlb>1</ywlb>"
					 + "</BasApprizequeueveh>"
					 + "<BasApprizequeueveh>"
					 + "<xh>告知单22号</xh>"
					 + "<jdcxh>机动22车序号</jdcxh>"
					 + "<hpzl>号牌种22类</hpzl>"
					 + "<hphm>号牌号22码</hphm>"
					 + "<fzjg>发证22机关</fzjg>"
					 + "<ywlb>2</ywlb>"
					 + "</BasApprizequeueveh>"
					 + "</body>"
					 + "</root>";  
		}
		 return null;
	    }
}
