/*
* @author sivaganesh
*/
//stream API:filter examples by siva
import java.util.*;
import java.util.stream.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		List<String> list=new ArrayList<String>();
		list.add("SIVA");
		list.add("");
		list.add("GANESH");
		list.add("SIVA");
		list.add("");
		//count empty strings in list
		long count=list.stream().filter(s->s.isEmpty()).count();
			//count Strings lenght >3
		long count1=list.stream().filter(s->s.length()>3).count();
			//count Strings Starts with S
			long count2=list.stream().filter(s->s.startsWith("S")).count();
			//getNonEmpty list from the list
			List<String> nonEmptyList=list.stream().filter(s->!s.isEmpty()).collect(Collectors.toList());
				//get strings lenght>2 from the list
			List<String> lengthgt2=list.stream().filter(s->s.length()>2).collect(Collectors.toList());
			
			System.out.println("count::"+count);
			System.out.println("count lgth>2:"+count1);
			System.out.println("Starts with S:"+count2);
			System.out.println("non Empty Strings List:"+nonEmptyList);
				System.out.println("List String gt2:"+lengthgt2);
	}
}
