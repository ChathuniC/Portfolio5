package Portfolio_5;

import java.util.List;
import java.util.Arrays;

public class BillboardHot1005 {
	
	public static void main(String[] args) {
		    List<Billboard> table = Arrays.asList(
			        new Billboard(1288410, 1, null, "Adele","Easy On Me", 1, 3 , 1),
			        new Billboard(1272848, 2, null, "The Kid LAROI & Justin Bieber", "Stay", 2, 16, 1),
			        new Billboard(1274683, 3, null, "Lil Nas X & Jack Harlow", "Industry Baby", 3, 14, 1),
			        new Billboard(1268006, 4, null, "Walker Hayes", "Fancy Like", 4, 19, 3),
			        new Billboard(1270457, 5, null, "Ed Sheeran", "Bad Habits", 5, 18, 2 ),
			        new Billboard(1281326, 6, null, "Drake Featuring Future & Young Thug", "Way 2 Sexy", 6, 8, 1),
			        new Billboard(1281955, 7, null, "Sale Sharks", "Shivers", 9, 7, 7),
			        new Billboard(1263769, 8, null, "Olivia Rodrigo", "Good 4 U", 7, 24, 1),
			        new Billboard(1268401, 9, null, "Doja Cat", "Need To Know", 11, 20, 9),
			        new Billboard(1196234, 10, null, "Dua Lipa", "Levitating", 8, 56, 2),
			        new Billboard(1234012, 11, null, "Wizkid Featuring Justin Bieber & Tems", "Essence", 12, 17, 9),
			        new Billboard(1257647, 12, null, "Doja Cat Featuring SZA", "Kiss Me More", 10, 29, 3),
			        new Billboard(1211118, 13, null, "Glass Animals", "Heat Waves", 14, 41, 12),
			        new Billboard(1267478, 14, null, "Maneskin", "Beggin'", 15, 18, 14),
			        new Billboard(1278099, 15, null, "Elton John & Dua Lipa", "Cold Heart (PNAU Remix)", 21, 8, 15),
			        new Billboard(1270465, 16, null, "Doja Cat & The Weeknd", "You Right", 16, 18, 11),
			        new Billboard(1195199, 17, null, "The Weeknd & Ariana Grande", "Save Your Tears", 17, 46, 1),
			        new Billboard(1275100, 18, null, "Jason Aldean & Carrie Underwood", "If I Didn't Love You", 23, 14, 15),
			        new Billboard(1265345, 19, null, "Olivia Rodrigo", "Traitor", 22, 23, 9),
			        new Billboard(1284531, 20, null, "Coldplay x BTS", "My Universe", 13, 5, 1),
			        new Billboard(1252236, 21, null, "Nardo Wick Featuring G Herbo, Lil Durk & 21 Savage", "Who Want Smoke??", 19, 3, 17),
			        new Billboard(1281644, 22, null, "Drake Featuring 21 Savage & Project Pat", "Knife Talk", 18, 8, 4),
			        new Billboard(1269396, 23, null, "THE ANXIETY: WILLOW & Tyler Cole", "Meet Me At Our Spot", 32, 7, 23),
			        new Billboard(1255678, 24, null, "Lil Nas X", "Montero (Call Me By Your Name)", 24, 31, 1),
			        new Billboard(1249365, 25, null, "Ryan Hurd With Maren Morris", "Chasing After You", 25, 26, 23)
			        );

		    System.out.println("Sorted by Comparator in class");
		    table.stream().forEach(System.out::println);

		    System.out.println();
		    System.out.println("Sorted by lambda");
		    table.stream()
		         .sorted((c1, c2) -> 
		            ((Integer) c1.getWeeksonchart()).compareTo(c2.getWeeksonchart()))
		         .forEach(System.out::println);
		  }
}
