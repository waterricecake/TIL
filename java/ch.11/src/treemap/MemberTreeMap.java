package treemap;

import java.util.TreeMap;
import java.util.Iterator;

public class MemberTreeMap {
	
	private TreeMap<Integer, Member>treemap;
	public MemberTreeMap() {
		treemap = new TreeMap<Integer,Member>();
	}
	
	public void addMember(Member member) {
		treemap.put(member.getMemberId(),member);
	}
	
	public boolean removeMember(int memberId) {
		if(treemap.containsKey(memberId)) {
			treemap.remove(memberId);
			return true;
		}
		System.out.println("no Id");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = treemap.keySet().iterator();
		while (ir.hasNext()) {
			int key = ir.next();
			Member member = treemap.get(key);
			System.out.println(member);
			
		}
		System.out.println();
	}
}
