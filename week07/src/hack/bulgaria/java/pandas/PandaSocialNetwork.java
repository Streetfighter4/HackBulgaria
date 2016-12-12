package hack.bulgaria.java.pandas;

import java.util.ArrayList;
import java.util.List;

public class PandaSocialNetwork {
	private List<Panda> allPandas;
	
	public PandaSocialNetwork() {
		allPandas = new ArrayList<>();
	}
	
	public void addPanda(Panda newPanda) {
		if (hasPanda(newPanda)) {
			return;
		}
		allPandas.add(newPanda);
	}
	
	public boolean hasPanda(Panda checkPanda) {
		for (Panda panda : allPandas) {
			if (panda.getName().equals(checkPanda.getName()) &&
				panda.getEmail().equals(checkPanda.getEmail()) &&
				panda.getGender().equals(checkPanda.getGender())) {
				return true;
			}
		}
		return false;
	}
	
	public void makeFriends(Panda panda1, Panda panda2) {
		addPanda(panda1);
		addPanda(panda2);
		
		panda1.getFriends().add(panda2);
		panda2.getFriends().add(panda1);
	}
	
	public boolean areFriends(Panda panda1, Panda panda2) {
		for (Panda panda : panda1.getFriends()) {
			if (panda.getName().equals(panda2.getName()) &&
				panda.getEmail().equals(panda2.getEmail()) &&
				panda.getGender().equals(panda2.getGender())) {
				return true;
			}
		}
		return false;
	}
	
	public List<Panda> friendsOf(Panda panda) {
		return panda.getFriends();
	}
	
	public int connectionLevel(Panda panda1, Panda panda2, int level) {
		if (areFriends(panda1, panda2)) {
			return 1;
		}
		for (Panda panda : panda1.getFriends()) {
			level = 1 + connectionLevel(panda, panda2, level);
		}
		return level;
	}
	
	public boolean areConnected(Panda panda1, Panda panda2) {
		if (connectionLevel(panda1, panda2, 0) > 0) {
			return true;
		}
		return false;
	}
	
	public int howManyGenderInNetwork(int level, Panda panda, String gender) {
		//if ()
		
		return 0;
	}
	
}
