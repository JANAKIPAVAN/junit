package pavan;

import java.util.HashSet;
import java.util.*;

public class Pavan {

	public static void main(String[] args) {

StringBuilder sb = new StringBuilder();

List<String> letters = Arrays.asList("A","B","C");

for (String letter : letters) {

for (int i = 0; i <= letters.indexOf(letter); i++) {

sb.append(letter);

}

sb.append(System.lineSeparator());

}

System.out.println(sb.toString());


	
	}
}
