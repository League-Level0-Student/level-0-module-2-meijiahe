//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	
	public static void main(String[] args) {
for(int i=0; i<10;i++) {
		// 1. OPTIONAL: Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		// 2. On paper, write all the numbers that get printed when you run this class 10 timesSystem.out.println(randomNumber);

		// 3. Use each value of randomNumber to give the user a random compliment.
if (randomNumber== 0){
JOptionPane.showMessageDialog(null, "You are such a good guy.");
}
if (randomNumber== 1) {
	JOptionPane.showMessageDialog(null,"You are awesome, I like your jackets,your hair is so beautiful, dude you are cool.");
}
if (randomNumber== 2) {
JOptionPane.showMessageDialog(null, "you are nice dude.");
}
if (randomNumber== 3) {
JOptionPane.showMessageDialog(null,"I haven't see the guy that ever nice than you.");
}
if (randomNumber== 4) {
	JOptionPane.showMessageDialog(null, "OMG, you are so nice.");
}
	


}
		// 4. Repeat all the code above 10 times
		
		// 5. Find someone to test out your program. They will like it :)
	}
}
