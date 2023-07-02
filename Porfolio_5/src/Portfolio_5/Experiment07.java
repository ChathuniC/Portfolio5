package Portfolio_5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Experiment07 {
	
	public void run() {
		String[] n1 = {"Alex", "Devon", "Cameron"};
		
		List<String> n2 = Arrays.asList(n1);
		
		n2.forEach(new Consumer<String>() {
			public void accept(String str) {
				System.out.println(str);
		}
		});
	}
	
	public static void main(String[] args) {
		new Experiment07().run();
		
	}

}
