package com.xiaomo.main;

import org.nutz.dao.Dao;
import org.nutz.ioc.Ioc;
import org.nutz.mvc.NutConfig;
import org.nutz.mvc.Setup;

import com.xiaomo.main.bean.DemoCarNumber;

public class MainSetup implements Setup {

	public void init(NutConfig conf) {
		 Ioc ioc = conf.getIoc();
	        Dao dao = ioc.get(Dao.class);
	        // 如果没有createTablesInPackage,请检查nutz版本
//	        Daos.createTablesInPackage(dao, "com.xiaomo.main", false);
	        dao.create(DemoCarNumber.class, false);
	        // 初始化默认根用户
	        if (dao.count(DemoCarNumber.class) == 0) {
	        	DemoCarNumber demoCarNumber = new DemoCarNumber();
	        	demoCarNumber.setBrandClpp1("brandClpp1");
	        	demoCarNumber.setCarNumberHpzm("carNumberHpzm");
	        	demoCarNumber.setColorCsys("colorCsys");
	        	demoCarNumber.setEngineNumberFdjh("engineNumberFdjh");
	        	demoCarNumber.setEngineTypeFdjxh("engineTypeFdjxh");
	        	demoCarNumber.setFirstRegisterTimeCcdjrq("firstRegisterTimeCcdjrq");
	        	demoCarNumber.setLegal("legal");
	        	demoCarNumber.setOwnerSyr("ownerSyr");
	        	demoCarNumber.setStatusZt("statusZt");
	        	demoCarNumber.setTestValidityTimeYxqz("testValidityTimeYxqz");
	        	demoCarNumber.setTypeClxh("typeClxh");
	        	demoCarNumber.setTypeHpzl("typeHpzl");
	        	demoCarNumber.setVinClsbdh("vinClsbdh");
	            dao.insert(demoCarNumber);
	        }
	}

	public void destroy(NutConfig nc) {
		// TODO Auto-generated method stub
		
	}

}
