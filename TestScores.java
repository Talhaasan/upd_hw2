public class TestScores {
	
	public static void main(String[] args) {
		
		

    	GameScoresArray scoresArray = new GameScoresArray(10);

        Player pA1 = new Player("p1", 50);
        Player pA2 = new Player("p2", 81);
        Player pA3 = new Player("p3", 90);
        Player pA4 = new Player("p4", 10);
        Player pA5 = new Player("p5", 82);
        Player pA6 = new Player("p6", 45);
        Player pA7 = new Player("p7", 81);
        Player pA8 = new Player("p8", 38);
        Player pA9 = new Player("p9", 28);
        Player pA10 = new Player("p10", 19);
     
        

       System.out.println("**************Array Outputs!***************");
        
       //Adding the array....
        scoresArray.add(pA1);
        scoresArray.add(pA2);
        scoresArray.add(pA3);
        scoresArray.add(pA4);
        scoresArray.add(pA5);
        scoresArray.add(pA6);
        scoresArray.add(pA7);
        scoresArray.add(pA8);
        scoresArray.add(pA9);
        scoresArray.add(pA10);
        
       System.out.println("*****");
       scoresArray.print();
        
       //Updating the array..
       scoresArray.updatePlayer("p1",65);
       scoresArray.updatePlayer("p4",35);
       scoresArray.updatePlayer("p3",65);
       scoresArray.updatePlayer("p5",40);
       scoresArray.updatePlayer("p3",100);
       System.out.println("*****");
       scoresArray.print();
       System.out.println("*****");
       
       scoresArray.findPlayers(50, 70);
       
     
        GameScoresDoublyLinkedList scoresDoublyLinkedList = new GameScoresDoublyLinkedList(10);
      
       Player pL1 = new Player("p1", 70);
       Player pL2 = new Player("p2", 100);
       Player pL3 = new Player("p3", 90);
       Player pL4 = new Player("p4", 10);
       Player pL5 = new Player("p5", 35);
       Player pL6 = new Player("p6", 63);
       Player pL7 = new Player("p7", 50);
       Player pL8 = new Player("p8", 68);
       Player pL9 = new Player("p9", 90);
       Player pL10 = new Player("p10", 10);
      
      
      System.out.println("**************Linked Lists Outputs!***************");
      //Adding the Linked Lists
      scoresDoublyLinkedList.insertFirst(pL1);
      scoresDoublyLinkedList.insertLast(pL2);
      scoresDoublyLinkedList.insertLast(pL3);
      scoresDoublyLinkedList.insertLast(pL4);
      scoresDoublyLinkedList.insertLast(pL5);
      scoresDoublyLinkedList.insertLast(pL6);
      scoresDoublyLinkedList.insertLast(pL7);
      scoresDoublyLinkedList.insertLast(pL8);
      scoresDoublyLinkedList.insertLast(pL9);
      scoresDoublyLinkedList.insertLast(pL10);
      scoresDoublyLinkedList.print();
      
      
      
      
    
      
	}
}	
