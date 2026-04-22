
import java.util.Map;
import java.util.stream.Collectors;

/*
Task

Given:

String str = "java streams";

Find the frequency of each character using streams.

Expected output

Order may vary:

{j=1, a=3, v=1,  =1, s=2, t=1, r=1, e=1, m=1}
*/

public class FrequencyOfCharactersStream {
    public static void main(String[] args) {
        String str = "java streams";
        Map<Character,Integer> freq=
         str
        .chars()
        .mapToObj(c->(char)c)
        .filter(c->c!=' ')
        .collect(Collectors.toMap(c->c, c->1, Integer::sum));

        freq.forEach((k,v)->System.out.println(k+"="+v));
        

    }
}