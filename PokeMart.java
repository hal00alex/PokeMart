
public class PokeMart {

	int Pokeballs = 20; 
	int Potions = 7; 
	int Antidotes = 3; 
	
	//function for selling and updating Pokeball Numbers 
	public void sellPokeballs(int numPokeballs){
		if (numPokeballs > Pokeballs){
			System.out.println("Sorry, the Mart does not have enough");
		}
		else{
			Pokeballs = Pokeballs - numPokeballs; 
			//Print PokeMart Totals Here 
			System.out.println("The Store has " + Pokeballs + " Pokeballs left"); 
		}
	}
	
	//function for selling and updating Potions Numbers 
	public void sellPotions(int numPotions){
		if (numPotions > Potions){
			System.out.println("Sorry, the Mart does not have enough"); 
		}
		else{
			Potions = Potions - numPotions; 
			//Print PokeMart Totals Here 
			System.out.println("The Store has " + Potions + " Potions left"); 
		}
	}
	
	//function for selling and updating antidotes Numbers 
	public void sellAntidotes(int numAntidotes){
		if (numAntidotes > Antidotes){
			System.out.println("Sorry, the Mart does not have enough"); 
		}
		else{
			Antidotes = Antidotes - numAntidotes; 
			//Print PokeMart Totals Here 
			System.out.println("The Store has " + Antidotes + " Antidotes left"); 
		}
	}
}
