package Portfolio_5;

import java.io.BufferedReader;
import java.io.FileReader;

public class File4 {
	
	public static void main(String[] args)throws Exception{
		BufferedReader r = new BufferedReader(new FileReader("data/Tom Swift in the Land of Wonders.txt"));
		r.lines()
		.map(l->l.toUpperCase())
		.forEach(l->System.out.println(l));
		r.close();
	}

}
