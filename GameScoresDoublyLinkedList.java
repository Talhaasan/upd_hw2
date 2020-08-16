public class GameScoresDoublyLinkedList {
	

	public String name;
	Player players;
	

	public Node head;
    public Node tail;
   
    int capacity;
    int size;

	

    public GameScoresDoublyLinkedList(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        
    }
    
 public boolean isEmpty() {
        return (head == null);
    }


    
    public void insertFirst(Player player) {
        
    	Node newNode = new Node();
        newNode.player = player;
        newNode.next = head;
        newNode.prev=null;
        
        if(size == capacity) {
        	System.out.println("Capacity is full!");
       }	
        else if(head!=null) {
            head.prev=newNode;
        head = newNode;
        }
        
        else if(tail==null){
            tail=newNode;
     
        }
        size++;
    }

    // used to insert a node at the start of linked list
    public void insertLast(Player player) {
        
    	
    	
    	Node newNode = new Node();
        newNode.player = player;
        newNode.next = null;
        newNode.prev=tail;
        
        if(size == capacity) {
        	System.out.println("Capacity is full!");
        }
        
        else if(tail!=null)
         tail.next=newNode;
        tail = newNode;
       
        if(head==null)
            head=newNode;
      
        size++;
    }

    // used to delete node from start of Doubly linked list
    public Node deleteFirst() {

        if (size == 0) {
        	//throw new RuntimeException("Doubly linked list is already empty");
        	System.out.println("LinkedList is empty!");
        }
            
        Node temp = head;
        head = head.next;
        head.prev = null;
        size--;
        return temp;
    }

    // used to delete node from last of Doubly linked list
    public Node deleteLast() {

        Node temp = tail;
        tail = tail.prev;
        tail.next=null;
        size--;
        return temp;
    }


    // For printing Doubly Linked List forward
    public void print() {

        Node current = head;
        while (current != null) {
            current.displayNodeData();
            current = current.next;
        }
        System.out.println();
    }

 
 /*

    public Player updatePlayer(String name,int newScore) {
	 
     Node active = head;
     
    
     do{
    	 
 		active = active.next;// Döngü sürekli bir sonrakine aktarýlýyor
 		
 		updatedPlayer =active.player;
 			
 			
      if (newScore>updatedPlayer.highScore && updatedPlayer.name.equals(name)) {
    	  
     	 updatedPlayer.setHighScore(newScore);
      }
      
      else if(newScore<updatedPlayer.highScore) {
    	  System.out.println("ERROR");
      }
      
      return updatedPlayer;
     }while (active.player.name != name); // Eþleþme bulana kadar			

   }
  */
    /*
    public Player findPlayers(int low, int high) {
    	Node active = head;
    	Player matchedPlayers = null;
       
    	
        while(active!=null) {
    		 if ( low < players.getHighScore() && players.getHighScore() < high) {
    			 
    			 active = active.next;
    			 matchedPlayers.name = players.name;
    			
                 
    			 return matchedPlayers;
             }
    		
    	}
    	
        return null;
    }
    */
    
/*
   public void scoreTable() {
	   Node active = head;
	   
       int noviceIndex = 0;
      
       
     
       int proIndex = 0;

       int winnerScore = 0;
       int winnerIndex = 0;
       int runnerUpScore = 0;
       int runnerUpIndex = 0;
       int i;

       
       while(active!=null) {
    	   active = active.next;
    	   
    	   if( active.player.getHighScore() > winnerScore) {
               winnerScore = active.player.getHighScore();
               runnerUpIndex = winnerIndex;
            //   runnerUpScore = active.player.runnerUpIndex.getHighScore();
               winnerIndex = i;
           }

           else if(active.player.getHighScore() < winnerScore && active.player.getHighScore() > runnerUpScore) {
               runnerUpScore = active.player.getHighScore();
               runnerUpIndex = i;
           }

           if ( active.player.getHighScore() < 30 && i != winnerIndex || i != runnerUpIndex) {
               novice[noviceIndex] = active.player;
               noviceIndex++;
           }
           if ( active.player.getHighScore() > 80 && i != winnerIndex || i != runnerUpIndex) {
               pro[proIndex] = active.player;
               proIndex++;
           }
    	   
    	   
       }
       
       }
       
       System.out.println(players1[winnerIndex].getHighScore());
       System.out.println(players1[runnerUpIndex].getHighScore());

       System.out.println("Pro");
       System.out.println(pro[0]);

       System.out.println("Novice");
       System.out.println(novice[0]);

 
   
   */
 
}

 
