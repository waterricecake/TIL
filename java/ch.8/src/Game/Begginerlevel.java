package Game;

public class Begginerlevel extends playerlevel{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run slowly");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("u can't jump");
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("u can't turn");
	}

	@Override
	public void showLevelMessage() {
		// TODO Auto-generated method stub
		System.out.println("************ beginerlevel");
	}

}
