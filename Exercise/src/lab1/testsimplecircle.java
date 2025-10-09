package testcircle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class testsimplecircle {

	public static void main(String[] args) {
		
		String filepath = "C:\\Users\\User\\Desktop\\words.txt";
		ArrayList<String> words = new ArrayList<>();
		try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
			String line;
			while((line = reader.readLine())!=null) {
				words.add(line.trim());
			}

		}
		catch(FileNotFoundException e) {
			System.out.println("Could not find file");
			
		}catch(IOException e) {
			System.out.println("Something went wrong");
		}
		
		Random random = new Random();
		
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Character> wordlist = new ArrayList<>();
		String word = words.get(random.nextInt(words.size()));
		for (int i = 0; i < word.length(); i++) {
			wordlist.add('_');
		}
		int wrongGuess = 0;
		System.out.println("****************************");
		System.out.println("Welcome to Java Hangman game");
		System.out.println("****************************");

		while (wrongGuess < 6) {
			System.out.println(printHangman(wrongGuess));
			System.out.print("Guess the word: ");
			System.out.println(wordlist);
			System.out.print("Enter a character: ");
			char character = scanner.next().toLowerCase().charAt(0);
			boolean found = false;
			for (int i = 0; i < word.length(); i++) {
				if (character == word.charAt(i)) {
					found = true;
					wordlist.set(i, character);
				}
			}
			
			  boolean won = true;
			  for (int i = 0; i < word.length(); i++) 
			  { if ('_' == wordlist.get(i)) { won = false; break; } }
			  if (won) {
			  System.out.println("Congratulations you have won the Hangman game.");
			  scanner.close(); return; }
			 
			if (!found) {
				wrongGuess++;
			}

		}
		if (wrongGuess >= 6) {

			System.out.println(printHangman(wrongGuess));
			System.out.println("Game over");
			System.out.print("The correct word is: ");
			System.out.println(word);
		}
		scanner.close();
	}

	static String printHangman(int wrongGuess) {

		return switch (wrongGuess) {
		case 0 -> """



				""";
		case 1 -> """
				 o


				""";
		case 2 -> """
				 o
				 |

				""";

		case 3 -> """
				 o
				/|

				""";
		case 4 -> """
				 o
			 /|\\

				""";
		case 5 -> """
				 o
				/|\\
			 /
				""";
		case 6 -> """
				 o
				/|\\
				/ \\
				""";
		default -> "";

		};

	}

}
