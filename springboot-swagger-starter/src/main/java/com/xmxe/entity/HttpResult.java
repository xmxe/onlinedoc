package com.xmxe.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "返回数据包装类")
public class HttpResult {
	// 响应的状态码
	@ApiModelProperty(value = "响应的状态码",example = "200")
	private int code;
	// 响应的响应体
	@ApiModelProperty(value = "返回body")
	private String body;
	public HttpResult(int code, String body) {
		this.code = code;
		this.body = body;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	
}
