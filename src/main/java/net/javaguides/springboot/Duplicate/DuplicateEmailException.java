package net.javaguides.springboot.Duplicate;

public class DuplicateEmailException extends RuntimeException {
 
	public DuplicateEmailException(String message) {
        super(message);
	}
}
