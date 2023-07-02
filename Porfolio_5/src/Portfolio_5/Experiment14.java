package Portfolio_5;

import java.util.stream.Stream;

public class Experiment14 {
	
	  class NameStreamBuilder {
		    public Stream<String> build(){
		      Stream.Builder<String> builder = Stream.builder(); 
		      builder.add("Alex");
		      builder.add("Devon");
		      builder.add("Cameron");
		      return builder.build();
		    }
		  }
		  
		  public void run() {
		    NameStreamBuilder builder = new NameStreamBuilder();
		    Stream <String> nameStream = builder.build();
		    nameStream.forEach(n -> System.out.println(n));
		  }

		  public static void main(String[] args) {
		    new Experiment14().run();
		  }

}
