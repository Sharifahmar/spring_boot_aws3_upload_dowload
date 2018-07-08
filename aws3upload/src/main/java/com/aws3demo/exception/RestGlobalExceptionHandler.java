package com.aws3demo.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartException;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestGlobalExceptionHandler extends ResponseEntityExceptionHandler {

	/**
	 * Method to handle controller exceptions
	 * 
	 * @param request
	 * @param ex
	 * @return
	 */
	@ExceptionHandler(GenericException.class)
	@ResponseBody
	public ResponseEntity<?> handleControllerException(
			HttpServletRequest request, GenericException ex) {
		HttpStatus status = getStatus(request);
		CustomResponse customResponse = new CustomResponse();
		customResponse.setErrCode("dummy");
		customResponse.setErrDesc(ex.getMessage());
		return new ResponseEntity<>(customResponse, status);
	}
	
	@ExceptionHandler(MultipartException.class)
	@ResponseBody
	public ResponseEntity<?> handleMultipartException(
			HttpServletRequest request, MultipartException ex) {
		//HttpStatus status = getStatus(request);
		CustomResponse customResponse = new CustomResponse();
		customResponse.setErrCode("dummy");
		customResponse.setErrDesc("Bad Request");
		return new ResponseEntity<>(customResponse, HttpStatus.BAD_REQUEST);
	}

	/**
	 * Method to get http status codes
	 * 
	 * @param request
	 * @return
	 */
	private HttpStatus getStatus(HttpServletRequest request) {
		Integer statusCode = (Integer) request
				.getAttribute("javax.servlet.error.status_code");
		if (statusCode == null) {
			return HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return HttpStatus.valueOf(statusCode);
	}

}
