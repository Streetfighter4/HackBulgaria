package hack.bulgaria.java.week06;

public class Person {
	private final String firstName = "Yasen";
	private final String secondName = "Alexiev";
	public int timesAccessed;
	
	@Override
	public int hashCode() {
		return getFirstName().hashCode() + getSecondName().hashCode();
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getSecondName() {
		return secondName;
	
	} 
	
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		
		if (obj instanceof BulgariaPerson) {
			Person other = (Person)obj;
			if (this.getFirstName().equals(other.getFirstName()) &&
				this.getSecondName().equals(other.getSecondName())) {
				return true;
			}
		} else if (obj instanceof Person) {
			Person other = (Person)obj;
			if (this.getFirstName().equals(other.getFirstName()) &&
				this.getSecondName().equals(other.getSecondName())) {
				return true;
			}
		}
		return false;
	}

	public String getUcn() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
