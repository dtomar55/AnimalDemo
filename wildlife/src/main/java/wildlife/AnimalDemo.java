package wildlife;

import language.GlobalLanguage;

public class AnimalDemo {

	public static void main(String[] args) {
		
		GlobalLanguage globalLanguage = new GlobalLanguage("Danish");
		
		AnimalBuilder animalBuilder = new AnimalBuilder(globalLanguage);

		AnimalList animalList = animalBuilder.prepareListOfAnimal();
		
        System.out.println("Count of Animal can FLY: " + animalList.animalCanFly());
        
        animalList.makeAllAnimalSpeak();
	}

}
