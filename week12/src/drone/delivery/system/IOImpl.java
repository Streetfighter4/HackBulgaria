package drone.delivery.system;

import java.util.HashMap;

public class IOImpl implements IO{
	RequestManager rq;
	//TODO 
	// req manager v contrutora
	
	
	private class Request {
		int id;
		int x;
		int y;
		HashMap<Integer, Integer> productsQuantity = new HashMap<Integer, Integer>();
		
		Request(String request) {
			String[] components = request.split(" ");
			id = Integer.parseInt(components[1]);
			
			//TODO refactor coords
			String[] coords = components[3].split(",");
			x = Integer.parseInt(coords[0]);
			y = Integer.parseInt(coords[1]);
			
			for (int i = 4; i < components.length; i+=2) {
				int product = Integer.parseInt(components[i]);
				int quantity = Integer.parseInt(components[i+1]);
				
				productsQuantity.put(product, quantity);				
			}
		}	
	}
	
	@Override
	public boolean acceptRequest(String request) {
		Request req = new Request(request);

		
		return false;
	}

}
