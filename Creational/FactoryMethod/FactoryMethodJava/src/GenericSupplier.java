import windows.Window;
import java.lang.reflect.InvocationTargetException;

public class GenericSupplier extends Supplier {
	private Class<? extends Window> windowType;
	
	public GenericSupplier(Class<? extends Window> windowType) {
		this.windowType = windowType;
	}
	
	@Override
	public Window createWindow() {
		try {
			return windowType.getDeclaredConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// Log the error at a higher context level
			String errorMessage = "Error creating instance: " + e.getMessage();
			System.err.println(errorMessage); // Print to console
			e.printStackTrace(); // Optionally log detailed stack trace for debugging

			return null; // Return null if an error occurs to indicate failure
		} catch (InvocationTargetException | NoSuchMethodException nsm) {
			// Handle cases where the constructor was not accessible using reflection
			String errorMessage = "Error calling constructor: " + nsm.getMessage();
			System.err.println(errorMessage); // Print to console

			return null; // Return null if an exception occurs to indicate failure
		}
	}

}
