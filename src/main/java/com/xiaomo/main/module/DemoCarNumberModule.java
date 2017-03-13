package com.xiaomo.main.module;

import java.util.List;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.lang.util.NutMap;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Fail;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.Param;

import com.xiaomo.main.bean.DemoCarNumber;
import com.xiaomo.main.service.DemoCarNumberService;

/**
 * 增加车辆信息功能Module
 * @author xiaomo
 *
 */
@IocBean
@At("/demo")
@Ok("json")
@Fail("http:500")
public class DemoCarNumberModule {
	
	@Inject
	protected DemoCarNumberService demoCarNumberService;

	private static final Log log = Logs.get();
	
	 @At
	 @Ok("jsp:jsp.result")
	public List<DemoCarNumber>  add( @Param("..")DemoCarNumber demoCarNumber){
		 log.info(demoCarNumber);
		 if (demoCarNumber.getCarNumberHpzm() != null) {
			 demoCarNumberService.add(demoCarNumber);
		}
		 return  demoCarNumberService.query();
//		return demoCarNumberService.add(demoCarNumber);
	}
	
	 @At("/del/?")
	 @Ok("jsp:jsp.result")
	public List<DemoCarNumber>  del(int id){
		 log.info(id);
		 demoCarNumberService.del(id);
		 return  demoCarNumberService.query();
	}
	
	 @At
	 @Ok("jsp:jsp.result")
	 public List<DemoCarNumber> query(){
		 return demoCarNumberService.query();
	 }
}
