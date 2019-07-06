package data1;

import java.util.Random;
import java.util.Scanner;


public class dice {
	Random rand = new Random();

	private int dice1;
	private int dice2;

	public dice() {
		this.dice1 = rand.nextInt(5)+1;
		this.dice2 = rand.nextInt(5)+1;
	}

	int value() {
		return dice1 + dice2;
	}

	public static void main(String[] args) {
		dice dice = new dice();
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		System.out.print(">  ");
		String name = scan.nextLine();
		System.out.println("Hello, " + name + "!");
		System.out.println("Rolling the dice...");
		System.out.println("Die 1:  " + dice.dice1);
		System.out.println("Die 1:  " + dice.dice2);
		System.out.println("Total value:  " + dice.value());
	}
}
