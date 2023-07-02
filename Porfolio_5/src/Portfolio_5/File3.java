package Portfolio_5;

import java.io.BufferedReader;
import java.io.FileReader;

public class File3 {
	
	public static void main(String[] args)throws Exception{
		BufferedReader r = new BufferedReader(new FileReader("data/Tom Swift in the Land of Wonders.txt"));
		r.lines().filter(l-> l.contains("his")).forEach(l -> System.out.println(l));
		r.close();
	}
	
}
