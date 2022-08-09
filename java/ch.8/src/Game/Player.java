package Game;

public class Player {
	playerlevel level;
	
	public Player() {
		level = new Begginerlevel();
		level.showLevelMessage();
	}
	
	public playerlevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(playerlevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
