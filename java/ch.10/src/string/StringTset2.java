package string;

public class StringTset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String java = new String("java");
		String android = new String("android");
		System.out.println(System.identityHashCode(java));
		
		java = java.concat(android);
		
		System.out.println(java);
		System.out.println(System.identityHashCode(java));
	}

}
