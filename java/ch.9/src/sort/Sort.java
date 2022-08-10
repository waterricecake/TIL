package sort;

public interface Sort {
	void ascedning(int[] arr);
	void descending(int[] arr);
	default void description() {
		System.out.println("Sort");
	}
	
}
