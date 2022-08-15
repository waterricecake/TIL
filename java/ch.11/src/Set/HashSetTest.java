package Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		set.add("Lee");
		set.add("kim");
		set.add("Kang");
		set.add("Lee");
		
		System.out.println(set);
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Lee");
		arr.add("kim");
		arr.add("Kang");
		arr.add("Lee");
		
		System.out.println(arr);
		
		Iterator<String> ir = set.iterator();
		
		while(ir.hasNext()) {
			String str = ir.next();
			System.out.println(str);
		}
	}

}
