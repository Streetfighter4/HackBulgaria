package DungeonsAndZombies;

public abstract class Entity {
	float health;
	float mana;
	
	public void setHealth(float health) {
		this.health = health;
	}
	public void setMana(float mana) {
		this.mana = mana;
	}
	public abstract boolean isAlive();
	public abstract float getHealth();
	public abstract float getMana();
	public abstract boolean canCast();
	public abstract void takeHealing(float healingPoints);
	public abstract void takeMana(float manaPoints);
	public abstract void takeDamage(float damagePoints);
	public abstract float attack();
}
