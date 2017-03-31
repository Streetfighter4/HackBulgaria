package parseURL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLReader {
	
	public static void main(String[] args) throws IOException {
		URL reader = new URL("http://api.openweathermap.org/data/2.5/weather?q=Sofia&appid=9ed81d9300f326bbd3f1ef06bb0f1207");
		BufferedReader in = new BufferedReader(new InputStreamReader(reader.openStream()));
		
		String inputLine;
		while ((inputLine = in.readLine()) != null) {
			if (inputLine.toLowerCase().contains("temp".toLowerCase())){
				System.out.println(inputLine);
			}
		}
		in.close();
	}

}
