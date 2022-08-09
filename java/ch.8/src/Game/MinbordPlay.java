package Game;

public class MinbordPlay {
	public static void main(String[] args) {
		Player player = new Player();
		
		player.play(1);
		
		AdvancedLevel alevel = new AdvancedLevel();
		player.upgradeLevel(alevel);
		player.play(3);
	}
}
