package orm;

public class Model<T> {
//	public ObjectsModel objects {
//		
//	}
	
	public ObjectsModel<T> objects() {
		return new ObjectsModel<T>();
	}
	
}
