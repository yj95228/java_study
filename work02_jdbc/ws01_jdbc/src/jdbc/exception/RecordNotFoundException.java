package jdbc.exception;

public class RecordNotFoundException extends Exception{

	public RecordNotFoundException() {
		this("This is RecordNotFoundException..");
	}
	
	public RecordNotFoundException(String mssage) {
		super(mssage);
	}

}
