package com.xiaomo.main.service;

import java.util.List;

import org.nutz.dao.Cnd;
import org.nutz.dao.Dao;
import org.nutz.dao.QueryResult;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.lang.util.NutMap;

import com.xiaomo.main.bean.DemoCarNumber;

@IocBean
public class DemoCarNumberService {

	 @Inject
	 protected Dao dao;
	 
	 public NutMap add(DemoCarNumber demoCarNumber){
		 NutMap re = new NutMap();
		 demoCarNumber =  dao.insert(demoCarNumber);
		 return re.setv("code", 1);
	 }
	 
	 public NutMap del(int id){
		 dao.delete(DemoCarNumber.class,id);
		 return new NutMap().setv("code", 1);
	 }
	
	 public List<DemoCarNumber> query(){
		 List<DemoCarNumber> list = dao.query(DemoCarNumber.class, Cnd.orderBy().desc("id"));
		 return list;
	 }
}
