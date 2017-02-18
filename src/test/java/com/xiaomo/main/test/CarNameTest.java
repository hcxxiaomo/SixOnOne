package com.xiaomo.main.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.log.Log;
import org.nutz.log.Logs;

import com.xiaomo.main.module.CarInfoModule;

@RunWith(MyNutTestRunner.class)
@IocBean // 必须有
public class CarNameTest {

private static final Log log = Logs.get();
	
	// 跟通常的@Inject完全一样.
//    @Inject("refer:$ioc")
//    protected Ioc ioc;
    
    @Inject
    protected CarInfoModule carInfoModule;
	
	
	@Test
	public void testCombin(){
		log.info(carInfoModule.getInfo("xtlbbbbb", "jkxlhhhhh", "jkiddddd", "QueryXmlDocccccc"));
	}
}
