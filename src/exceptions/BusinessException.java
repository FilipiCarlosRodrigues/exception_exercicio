package exceptions;

public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	/*construtor criado so para poder instanciar uma string */
	public BusinessException (String msg) {
		super(msg);
	}
	
}
