package philosophers.multithreading;


import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

public class Philosopher extends Thread {

	private final int philosopherId;
	private final Fork left;
	private final Fork right;
	private int foodCounter = 0;
	
	private final Random random = new Random();

	private final AtomicBoolean dining = new AtomicBoolean(true);

	public Philosopher(int id, Fork left, Fork right) {
		philosopherId = id;
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return "Philosopher-" + philosopherId;
	}

	public void think() {
		System.out.println(this + " thinking!");
		try {
			Thread.sleep(random.nextInt(500));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void eat() {
		foodCounter ++;
		System.out.println(this + " eating!");
		try {
			Thread.sleep(random.nextInt(1000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int getFoodCounter() {
		return foodCounter;
	}
	
	public void finishDining() {
		dining.set(false);
	}

	@Override
	public void run() {
		try {
            while (true) {
                think();
                left.pickUp(this);
                right.pickUp(this);
                eat();
                left.putDown(this);
                right.putDown(this);
            }
        } catch (InterruptedException e) {
            System.out.println("WTF");
        }
	}
}

