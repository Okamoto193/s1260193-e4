
import java.util.Random;



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

		System.out.println("Rolling the dice...");
		System.out.println("Die 1:  " + dice.dice1);
		System.out.println("Die 1:  " + dice.dice2);
		System.out.println("Total value:  " + dice.value());

		if(dice.value() > 6){
			System.out.println("You won");
		}else{
			System.out.println("You lost");
		}


	}
}
