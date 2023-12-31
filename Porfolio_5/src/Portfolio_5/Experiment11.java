package Portfolio_5;

import java.util.Arrays;
import java.util.List;

public class Experiment11 {

	public void run() {
		String[] n1 = {"Alex", "Devon", "Cameron"};
		
		List<String> n2 = Arrays.asList(n1);
		n2.stream().map(name -> name.replaceAll("e", "")).forEach(name -> System.out.println(name));
		
	}
	public static void main(String[] args) {
		new Experiment11().run();
	}
}
