package hack.bulgaria.java.week06;

public class BulgariaPerson extends Person{
	private String ucn;
	
	public String getUcn() {
		return ucn;
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
				this.getSecondName().equals(other.getSecondName()) &&
				this.getUcn().equals(other.getUcn())) {
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
	
}
