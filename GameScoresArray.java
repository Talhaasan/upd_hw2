public class GameScoresArray {

    Player[] players;

    int numOfPlayers; //exists player in the list
    int capacity; //capacity of array


    public GameScoresArray(int capacity) {
        this.numOfPlayers = 0;
        this.capacity = capacity;
        this.players = new Player[capacity];
    }

    public boolean isEmpty() {
        for (Player player : players) {
            if (player != null) {
                return false;
            }
        }
        return true;
    }


    public boolean isPlayerExists(String name) {
        if(isEmpty()){
            return false;
        }
        for (int i=0; i < numOfPlayers; i++) {
            if (players[i] != null && players[i].getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    //adding player's score
    public void add(Player player) {
        if (isPlayerExists(player.getName())) {
            System.out.println("Your name is already selected. You can choose other name!");
            return;
        } else if (capacity == numOfPlayers) {
            System.out.println("List is full!");
            return;
        }
        players[numOfPlayers] = player;
        numOfPlayers++;
    }

    //removing player's score
    public Player remove(String name) {
        for (int i = 0; i < numOfPlayers; i++) {
            if (players[i].getName().equals(name)) {
                Player removedPlayer = players[i];
                players[i] = null;
                numOfPlayers--;
                return removedPlayer;
            }
        }
        System.out.println("Given Name does not exist!");
        return null;
    }

  
    
//updating player's score 
    public Player updatePlayer(String name, int newScore) {
        for (int i = 0; i < numOfPlayers; i++) {
            if (players[i].getName().equals(name)) {
               
            	Player updatedPlayer = players[i];
                if(newScore>updatedPlayer.highScore) {
                	updatedPlayer.setHighScore(newScore);
                }
                return updatedPlayer;
            }
        }
        System.out.println("Given Name does not exist!");
        return null;
    }

    //finding define range player's score
    public Player[] findPlayers(int low, int high) {
        Player[] matchedPlayers = new Player[capacity];
        int index = 0;
        for (int i = 0; i < numOfPlayers; i++) {
            if ( low < this.players[i].getHighScore() && this.players[i].getHighScore() < high) {
                matchedPlayers[index] = players[i];
                System.out.println("Matched players : " + (index+1));
                index++;
            }
        }
        return matchedPlayers;
    }

    //ordering and ranking player's score
    public void scoreTable() {
        Player[] novice = new Player[capacity];
        int noviceIndex = 0;

        Player[] pro = new Player[capacity];
        int proIndex = 0;

        int winnerScore = 0;
        int winnerIndex = 0;
        int runnerUpScore = 0;
        int runnerUpIndex = 0;

        for (int i = 0; i < numOfPlayers; i++) {

            if( this.players[i].getHighScore() > winnerScore) {
                winnerScore = players[i].getHighScore();
                runnerUpIndex = winnerIndex;
                runnerUpScore = players[runnerUpIndex].getHighScore();
                winnerIndex = i;
            }

            else if(this.players[i].getHighScore() < winnerScore && this.players[i].getHighScore() > runnerUpScore) {
                runnerUpScore = players[i].getHighScore();
                runnerUpIndex = i;
            }

            if ( this.players[i].getHighScore() < 30 && i != winnerIndex || i != runnerUpIndex) {
                novice[noviceIndex] = players[i];
                noviceIndex++;
            }
            if ( this.players[i].getHighScore() > 80 && i != winnerIndex || i != runnerUpIndex) {
                pro[proIndex] = players[i];
                proIndex++;
            }
        }
        
        System.out.println(players[winnerIndex].getHighScore());
        System.out.println(players[runnerUpIndex].getHighScore());

        System.out.println("Pro");
        System.out.println(pro[0]);

        System.out.println("Novice");
        System.out.println(novice[0]);

    }

//printing fields..
    public void print() {
        for (int i = 0; i < numOfPlayers; i++) {
            System.out.print("Player-" + i + ":" + players[i] + "\n");
        }
    }

}



