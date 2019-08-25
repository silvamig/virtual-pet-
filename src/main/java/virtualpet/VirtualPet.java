package virtualpet;

public class VirtualPet {

	//public static void main(String[] args) {
		
			int Hunger;
			int Thirst;
			int Boredom;
			int Happiness;
			
		//Enter the name of your pet
		//Show the status of your pet's hunger, thirst, boredom and happiness
		//How do I program feeding the pet
		public VirtualPet (int Hunger, int Thirst, int Boredom, int Happiness) {	
			this.Hunger = Hunger;
			this.Thirst = Thirst;
			this.Boredom = Boredom;
			this.Happiness = Happiness;
		}

		public void feed() {
			System.out.println("Keep your pet full by monitoring it's hunger ");
			
		}	
		
	
	}


