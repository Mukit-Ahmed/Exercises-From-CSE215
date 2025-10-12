package lab4;

import java.util.Scanner;

public class LabManual2Task5 {

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("scissor (0), rock (1), paper (2): ");
		int userHand = scanner.nextInt();
		int computerHand = (int) (Math.random() * 3);
		
		
		// converting user's hand integer value to string
		
		String hand1 = "";
		if (userHand == 0)
			hand1 = "scissor";
		else if (userHand == 1)
			hand1 = "rock";
		else
			hand1 = "paper";
		
		// converting computers's hand integer value to string
		
		String hand2 = "";
		if (computerHand == 0)
			hand2 = "scissor";
		else if (computerHand == 1)
			hand2 = "rock";
		else
			hand2 = "paper";
		
		
		
		if (userHand == computerHand)
			System.out.println("The computer is " + hand2 + ". You are " + hand1 + " too. It is a draw ");
		else if (userHand == 0) {
			
			//User is scissor
			
			if (computerHand == 1) {
				System.out.println("The computer is " + hand2 + ". You are " + hand1 + ". You lost ");
			} else {
				System.out.println("The computer is " + hand2 + ". You are " + hand1 + ". You won ");
			}
			

		} else if (userHand == 1) {
			
			//User is rock
			
			if (computerHand == 0) {
				System.out.println("The computer is " + hand2 + ". You are " + hand1 + ". You won ");
			} else {
				System.out.println("The computer is " + hand2 + ". You are " + hand1 + ". You lost ");
			}
			
			

		} else if (userHand == 2) {
			
			//User is paper
			
			if (computerHand == 0) {
				System.out.println("The computer is " + hand2 + ". You are " + hand1 + ". You lost ");
			} else {
				System.out.println("The computer is " + hand2 + ". You are " + hand1 + ". You won ");
			}
			

		}
		scanner.close();
	}

}
