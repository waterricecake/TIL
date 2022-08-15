package treeset;
import java.util.TreeSet;
public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("Hong");
		treeSet.add("Kang");
		treeSet.add("Lee");
		
		for(String str: treeSet) {
			System.out.println(str);
		}
		
	}

}
