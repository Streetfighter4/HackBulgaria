package orm;

import java.lang.reflect.Field;
import java.util.List;

public class ObjectsModel<T> {
	
	Class callerClass;
	
	public ObjectsModel(String callerClass) {
		this.callerClass = callerClass;
	}
	
	private String makeFirstLetterCapital(String s) {
		return s.substring(0,1).toUpperCase() + s.substring(1);
	}
	
	private T convertToObject(List<String> row) {
		try {
			Field[] fields = callerClass.getDeclaredFields();
			
			Object instance = callerClass.newInstance();
			return (T) instance;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public List<T> all() {
		convertToObject(db.selectFrom(className + "s").get(0));
	}
}
