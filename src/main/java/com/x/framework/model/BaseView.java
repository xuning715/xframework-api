package com.x.security.controller;

import java.io.Serializable;

/**
 * 响应结果对象
 * @author yangyonghao
 */
public class BaseView implements Serializable {

	private int code = 1;//响应码

	private Object result;//结果集

	private Integer errorCode;//错误代码

	private String msg;//响应消息

	public BaseView(){

	}

	public BaseView(int code){
		this.code = code;
	}

	public BaseView(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public BaseView(int code, Object result) {
		this.code = code;
		this.result = result;
	}

	public BaseView(int code, String msg, Object result) {
		this.code = code;
		this.msg = msg;
		this.result = result;
	}

	public BaseView(int code, Integer errorCode, String msg) {
		this.code = code;
		this.errorCode = errorCode;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
