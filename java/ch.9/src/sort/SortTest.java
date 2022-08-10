package sort;

import java.io.IOException;
public class SortTest {

	public static void main(String[] args) throws IOException {
		int[] arr = {1,2,3,4};
	
		// TODO Auto-generated method stub
		System.out.println("How");
		System.out.println("B : bubblesort");
		System.out.println("H : heasort");
		System.out.println("Q : quicksort");
		
		int ch = System.in.read();
		Sort sort = null;
		
		if(ch == 'B'||ch == 'b') {
			sort = new BubbleSort();
		}
		else if(ch == 'H'||ch == 'h') {
			sort = new HeaSort();
		}
		else if(ch == 'Q'||ch == 'q') {
			sort = new QuickSort();
		}
		else {
			System.out.println("wrong type");
		}
		
		sort.ascedning(arr);
		sort.descending(arr);
		sort.description();
		
	}

}
