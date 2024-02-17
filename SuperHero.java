package app;
import java.util.Random;

public class SuperHero {
	private String name;
	private int health;
	private boolean isDead;
	
	public SuperHero(String name, int health) {
		// initialize internal variables
		this.name = name;
		this.health = health;
	}
	
	public void attack (SuperHero opponent) {
		// create a random number from 1 to 10
		Random rand = new Random();
		int damage = rand.ints(1, ( 10 + 1)).findFirst().getAsInt();
		
		//set the health of the provided opponent
		opponent.determineHealth(damage);
		System.out.println(String.format("%s  has damage of %d and health of %d", opponent.name, damage, opponent.health));
		
	}
	
	public boolean isDead() {
		// return the dead state
		return this.isDead;
	}
	
	private void determineHealth(int damage) {
		
		//if no more health mark as dead, else subtract damage from health and continue
		
		if(this.health - damage <= 0) {
			this.health = 0;
			this.isDead = true;
		}
		else {
			this.health = this.health - damage;
		}
	}

}
