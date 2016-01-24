import java.util.Scanner;

//trainer = user 
public class Trainer extends PokeMart {
	//data types here 
	int tPokeballs = 1; 
	int tPotions = 2; 
	int tAntidotes = 0; 
	
	public void buyPokeballs(int numPoke){
		tPokeballs += numPoke; 
		System.out.println("You have " + tPokeballs + " Pokeballs");
	}
	
	public  void buyPotions(int numPotion){
		tPotions += numPotion; 
		System.out.println("You have " + tPotions + " Potions");
	}
	
	public void buyAntidotes(int numAnt){
		tAntidotes += numAnt; 
		System.out.println("You have " + tAntidotes + " Antidotes");
		
	}
	
	public static void main(String[] args) {
		//create/import all Pokemart data and functions  
		PokeMart pokeMart = new PokeMart(); 
		Trainer trainer = new Trainer();
		
		//create/import Scanner for reading lines 
		Scanner reader = new Scanner(System.in); 
		 
		//keep reading lines until store is sold out 
		while ((pokeMart.Pokeballs > 0) || (pokeMart.Potions > 0) || (pokeMart.Antidotes > 0)){
			
			//ask user to enter item 
			System.out.println("What will you like to buy?");
			
			//read line from user 
			String n = reader.nextLine();
			
			
			if (n.equals("Pokeballs")){
				//read number
				System.out.println("How many?");
				int num = reader.nextInt();
				pokeMart.sellPokeballs(num);
				trainer.buyPokeballs(num); 
			}
			
			if (n.equals("Potions")){
				//read number
				System.out.println("How many?");
				int num = reader.nextInt();
				pokeMart.sellPotions(num);
				trainer.buyPotions(num);
			}
			
			if (n.equals("Antidotes")){
				//read number
				System.out.println("How many?");
				int num = reader.nextInt();
				pokeMart.sellAntidotes(num);
				trainer.buyAntidotes(num);
			}
			
		}
		System.out.println("Thanks for Shopping");
	}
}
