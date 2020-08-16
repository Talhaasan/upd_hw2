public class Player {
	
	//players property
	String name;
    int highScore;
    
    
    
 public Player(String name) {
		
		this.name = name;
	}


	public Player(String name, int highScore) {
        this.name = name;
        this.highScore = highScore;
    }


	@Override
    public String toString() {
        return "Player [name=" + name + ", highScore=" + highScore + "]";
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }
    
    
   
    
}



