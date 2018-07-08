/**
 * 
 */
package com.aws3demo.exception;

/**
 * @author Ahmar
 *
 */
public class GenericException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GenericException(Throwable arg0) {
		super(arg0);
	
	}

	public GenericException() {
		super();
		
	}

	public GenericException(String arg0, Throwable arg1, boolean arg2,
			boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		
	}

	public GenericException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		
	}

	public GenericException(String arg0) {
		super(arg0);
		
	}

}
