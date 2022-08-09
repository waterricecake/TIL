package abstractexd;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer = new DeskTop();
		computer.display();
		computer.turnoff();
		
		Notebook myNote = new MyNotebook();		
	}

}
