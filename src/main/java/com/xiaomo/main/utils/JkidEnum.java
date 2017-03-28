package com.xiaomo.main.utils;

public enum JkidEnum {
	/**
	 * 查询机动车告知信息--警务
	 */
	Cxjdcgz("05C02") 
	/**
	 * 查询机动车三同和多次告知信息--警务
	 */
	,Cxjdcsthdcgz("05C04")
	/**
	 * 查询机动车非现场违法告知信息--警务
	 */
	,Cxjdcfxcwfgz("05C05")
	/**
	 * 查询电子监控文本信息--违法
	 */
	,Cxdzjkwb("04C03")
	/**
	 * 读取机动车基本信息--机动车
	 */
	,Cxjdcjb("01C21")
	;

	private String string;

	private JkidEnum(String string) {
		this.string = string;
	}

	public String getString() {
		return string;
	}
}
