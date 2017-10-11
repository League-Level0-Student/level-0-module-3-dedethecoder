//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100)+1;
		
		// 2. Print out the random variable above
		    
		// 11. do the following 10 times
		       for (int i = 1; i <= 10; i++) {
				
			
			// 1. ask the user for a guess using a pop-up window, and save their response 
                 String Guess= JOptionPane.showInputDialog("Guess a number between 1 and 100");			
                  // 4. convert the users’ answer to an int (Integer.parseInt(string))
			            int guess=Integer.parseInt(Guess);
			// 5. if the guess is correct
				  if(guess==random) {
					  JOptionPane.showMessageDialog(null, "What is this Sorcery?Wow Congratulations.It took you "+ i + " tries" );
				      System.exit(0);
				  }
                  // 6. win
				  
			// 7. if the guess is high
				  if(guess>random){
					  JOptionPane.showMessageDialog(null, "My mans,It's too High");
				  }
				// 8. tell them it's too high
					  
			// 9. if the guess is low
				  if(guess<random){
					  JOptionPane.showMessageDialog(null, "My mans,It's too Low");
				  }
		       }	 // 10. tell them it's too low

		// 12. tell them they lose
				  JOptionPane.showMessageDialog(null, "You lost...not that surprising");
	}

}


