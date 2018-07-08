package com.aws3demo.exception;

public class CustomResponse {

	private String errCode;
	private String errDesc;

	public String getErrCode() {
		return errCode;
	}

	public String getErrDesc() {
		return errDesc;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public void setErrDesc(String errDesc) {
		this.errDesc = errDesc;
	}

	public CustomResponse() {
		super();
	}

	public CustomResponse(String errCode, String errDesc) {
		super();
		this.errCode = errCode;
		this.errDesc = errDesc;
	}

	@Override
	public String toString() {
		return "CustomResponse [errCode=" + errCode + ", errDesc=" + errDesc
				+ "]";
	}

}
