package inte.task1;

public class Player {
	private String name;
    private int score = 0;
    private int rounds = 0;

    
    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    public void addScore(int points) {
    	 score = score + points;
    }

    public void addRound() {
    	 rounds = rounds + 1;
    }

    public int getScore() {
        return score;
    }

    public int getRounds() {
        return rounds;
    }

    public void showResult() {
    	 System.out.println("\n Game Result:");
        System.out.println("Player Name: " + name);
        System.out.println("Rounds Played: " + rounds);
        System.out.println("Final Score: " + score);
    }
}



