package com.xiaomo.main.bean;

public class MessageDto {
	
	private Integer code;
	private String msg;
	private Object data;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public MessageDto(Integer code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}
	public MessageDto() {
		super();
	}
	@Override
	public String toString() {
		return "MessageDto [code=" + code + ", msg=" + msg + ", data=" + data + "]";
	}

	
	
}
