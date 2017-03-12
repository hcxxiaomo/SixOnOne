package com.xiaomo.main.bean;

import java.util.Date;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Name;
import org.nutz.dao.entity.annotation.Table;

@Table("t_demo_car_info")
public class DemoCarNumber {

	/*传入号牌种类和号牌号码，返回所有人、机动车状态、品牌、型号、颜色、发动机号、车架号、初次登记日期、
	检验有效期等数据，可分正常显示和详细显示，正常显示只需所有人、状态、号牌、颜色、有效期，详细显示则全部列出*/
	
	@Id
	private int id;
	
	@Name
	private String carNumberHpzm;
	
	@Column
	private String typeHpzl;
	
	@Column
	private String ownerSyr;
	@Column
	private String statusZt;
	@Column
	private String brandClpp1;
	
	@Column
	private String typeClxh;
	@Column
	private String colorCsys;
	@Column
	private String testValidityTimeYxqz;
	
	@Column
	private String engineNumberFdjh;
	@Column
	private String vinClsbdh;
	@Column
	private String firstRegisterTimeCcdjrq;
	@Column
	private String engineTypeFdjxh;
	
	@Column
	private String legal;//是否违法
	
	@Column("ct")
    private Date createTime;
	@Column("ut")
    private Date updateTime;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getTypeHpzl() {
		return typeHpzl;
	}
	public void setTypeHpzl(String typeHpzl) {
		this.typeHpzl = typeHpzl;
	}
	public String getCarNumberHpzm() {
		return carNumberHpzm;
	}
	public void setCarNumberHpzm(String carNumberHpzm) {
		this.carNumberHpzm = carNumberHpzm;
	}
	public String getOwnerSyr() {
		return ownerSyr;
	}
	public void setOwnerSyr(String ownerSyr) {
		this.ownerSyr = ownerSyr;
	}
	public String getStatusZt() {
		return statusZt;
	}
	public void setStatusZt(String statusZt) {
		this.statusZt = statusZt;
	}
	public String getBrandClpp1() {
		return brandClpp1;
	}
	public void setBrandClpp1(String brandClpp1) {
		this.brandClpp1 = brandClpp1;
	}
	public String getTypeClxh() {
		return typeClxh;
	}
	public void setTypeClxh(String typeClxh) {
		this.typeClxh = typeClxh;
	}
	public String getColorCsys() {
		return colorCsys;
	}
	public void setColorCsys(String colorCsys) {
		this.colorCsys = colorCsys;
	}
	public String getTestValidityTimeYxqz() {
		return testValidityTimeYxqz;
	}
	public void setTestValidityTimeYxqz(String testValidityTimeYxqz) {
		this.testValidityTimeYxqz = testValidityTimeYxqz;
	}
	public String getEngineNumberFdjh() {
		return engineNumberFdjh;
	}
	public void setEngineNumberFdjh(String engineNumberFdjh) {
		this.engineNumberFdjh = engineNumberFdjh;
	}
	public String getVinClsbdh() {
		return vinClsbdh;
	}
	public void setVinClsbdh(String vinClsbdh) {
		this.vinClsbdh = vinClsbdh;
	}
	public String getFirstRegisterTimeCcdjrq() {
		return firstRegisterTimeCcdjrq;
	}
	public void setFirstRegisterTimeCcdjrq(String firstRegisterTimeCcdjrq) {
		this.firstRegisterTimeCcdjrq = firstRegisterTimeCcdjrq;
	}
	public String getEngineTypeFdjxh() {
		return engineTypeFdjxh;
	}
	public void setEngineTypeFdjxh(String engineTypeFdjxh) {
		this.engineTypeFdjxh = engineTypeFdjxh;
	}
	public String getLegal() {
		return legal;
	}
	public void setLegal(String legal) {
		this.legal = legal;
	}
	@Override
	public String toString() {
		return "PlateNumber [typeHpzl=" + typeHpzl + ", carNumberHpzm=" + carNumberHpzm + ", ownerSyr=" + ownerSyr
				+ ", statusZt=" + statusZt + ", brandClpp1=" + brandClpp1 + ", typeClxh=" + typeClxh + ", colorCsys="
				+ colorCsys + ", testValidityTimeYxqz=" + testValidityTimeYxqz + ", engineNumberFdjh="
				+ engineNumberFdjh + ", vinClsbdh=" + vinClsbdh + ", firstRegisterTimeCcdjrq=" + firstRegisterTimeCcdjrq
				+ ", engineTypeFdjxh=" + engineTypeFdjxh
				+ ", legal=" + legal
				+ "]";
	}
	
}
