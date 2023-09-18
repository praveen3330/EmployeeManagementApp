package net.javaguids.springboot.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
 
	//RunTimeExceptioon internally uses serilaziable Interface
	private static final long serialVersionUID = 1L;
	public ResourceNotFoundException(String message) {

		super(message);
	
}
}