package Portfolio_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Optional;

public class File7 {
	
	public static void main(String[] args) throws Exception{
		BufferedReader r = new BufferedReader(new FileReader("data/Tom Swift in the Land of Wonders.txt"));
		Optional<String> result= r.lines().reduce((left,right) -> left.concat("".concat(right)));
		
		if(result.isPresent())
			System.out.println("result is "+ result.get());
		else
			System.out.println("result not present");
		
		r.close();
	}

}
