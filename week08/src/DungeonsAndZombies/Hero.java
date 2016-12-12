package DungeonsAndZombies;

public class Hero extends Entity{
	String name;
	String title;
	float manaRegenRate;
	
	public Hero(String name, String title, float health, float mana, float manaRegenRate) {
		super();
		this.name = name;
		this.title = title;
		this.manaRegenRate = manaRegenRate;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getManaRegenRate() {
		return manaRegenRate;
	}

	public void setManaRegenRate(float manaRegenRate) {
		this.manaRegenRate = manaRegenRate;
	}

	@Override
	public boolean isAlive() {
		if (getHealth() > 0.0) {
			return true;
		}
		return false;
	}

	@Override
	public float getHealth() {
		return getHealth();
	}

	@Override
	public float getMana() {
		return getMana();
	}

	@Override
	public boolean canCast() {
		return false;
	}

	@Override
	public void takeHealing(float healingPoints) {
		setHealth(healingPoints);
	}

	@Override
	public void takeMana(float manaPoints) {
		setMana(manaPoints);
	}

	@Override
	public void takeDamage(float damagePoints) {
		
	}

	@Override
	public float attack() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
