package hack.bulgaria.java.pandas;

import java.util.ArrayList;
import java.util.List;

public class Panda {
	private String name;
	private String email;
	private String gender;
	
	private List<Panda> friendsList;
	
	public Panda(String name, String email, String gender) {
		super();
		if (email.indexOf('@') >= 0 && email.indexOf('.') >= 0 && email.length() >= 5) {
			this.name = name;
			this.email = email;
			this.gender = gender;
			friendsList = new ArrayList<>();
		}
	}
	
	public List<Panda> getFriends() {
		return friendsList;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public boolean isMale() {
		return getGender() == "male" ? true:false;
	}
	public boolean isFemale() {
		return getGender() == "female" ? true:false;
	}
}
