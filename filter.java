import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filter {
    public static void main(String[] args) {
		
		List<String> List= Arrays.asList("abc","abcdef","abcd","abcdefg","a","b");
		List<String> List2 = new ArrayList<String>();
		
		
		
		//stream
		
		List2 = List.stream().filter(n->n.length()>5 && n.length()<8).collect(Collectors.toList());
		System.out.println(List2);
		
		List.stream().filter(n->n.length()>5 && n.length()<8).forEach(n->System.out.println(n));

	}
}
