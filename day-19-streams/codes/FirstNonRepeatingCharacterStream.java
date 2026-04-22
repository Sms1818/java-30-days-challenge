
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

/*
Task

Given:

String str = "java streams";

👉 Find the first non-repeating character using streams

🎯 Expected Output
j
*/

public class FirstNonRepeatingCharacterStream {
    public static void main(String[] args) {
        String str = "java streams";
        LinkedHashMap<Character,Integer> freq=
         str
        .chars()
        .mapToObj(c->(char)c)
        .filter(c->c!=' ')
        .collect(Collectors.toMap(c->c, c->1, Integer::sum, LinkedHashMap::new));

        freq.entrySet().stream().filter(x->x.getValue()==1).findFirst().ifPresent(x->System.out.println(x.getKey()));


    }
}

