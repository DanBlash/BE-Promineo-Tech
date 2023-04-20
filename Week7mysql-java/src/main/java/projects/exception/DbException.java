package projects.exception;

public class DbException extends RuntimeException {

	
	
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//	In this section, you will create the class DbException in the projects.exception package.
//	In the projects.exception package, create a class named "DbException". This class must extend RuntimeException. Override the following constructors from the superclass:
//		public DbException(String message) {}
//		public DbException(Throwable cause) {}
//		public DbException(String message, Throwable cause) {}
//		Be sure to call the matching constructor in the superclass from each constructor in DbException.  Show DbException class in your video.
	
	public DbException(String message) {
		super(message);
	}
	
	public DbException(Throwable cause) {
		super(cause);
	}
	
	public DbException(String message, Throwable cause) {
		super(message, cause);
	}
}

	