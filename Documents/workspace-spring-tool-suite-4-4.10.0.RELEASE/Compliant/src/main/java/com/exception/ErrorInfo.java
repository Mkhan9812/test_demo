package com.exception;

public class ErrorInfo {
String errorcode;
String errorMsg;
int status;
public String getErrorcode() {
	return errorcode;
}
public void setErrorcode(String errorcode) {
	this.errorcode = errorcode;
}
public String getErrorMsg() {
	return errorMsg;
}
public void setErrorMsg(String errorMsg) {
	this.errorMsg = errorMsg;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
      public ErrorInfo(String errorcode, String errorMsg, int status) {
	  this.errorcode = errorcode;
	  this.errorMsg = errorMsg;
	  this.status = status;
}
	



}
