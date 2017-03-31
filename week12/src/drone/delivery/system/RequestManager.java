package drone.delivery.system;

public interface RequestManager {
	public boolean availableProducts(int id, int quantity);
	public boolean availableDrones(int dronesCount);
}
