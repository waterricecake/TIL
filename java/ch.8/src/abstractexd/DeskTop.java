package abstractexd;

public class DeskTop extends Computer {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Desktop display");
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing");
	}
	
	@Override
	public void turnoff() {
		System.out.println("Desktop turnoff");
	}
}
