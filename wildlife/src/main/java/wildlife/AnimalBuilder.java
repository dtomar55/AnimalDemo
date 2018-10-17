package wildlife;

import language.GlobalLanguage;

public class AnimalBuilder {

	GlobalLanguage globalLanguage;
	
	public AnimalBuilder(GlobalLanguage globalLanguage) {
	   this.globalLanguage = globalLanguage;
	}

	public AnimalList prepareListOfAnimal (){
		   AnimalList animalList = new AnimalList();
	      animalList.addItem(new Chicken());
	      animalList.addItem(new Duck());
	      animalList.addItem(new ParrotWithCat());
	      animalList.addItem(new ParrotWithDog());
	      animalList.addItem(new ParrotWithRooster());
	      animalList.addItem(new Clownfish());
	      animalList.addItem(new Shark());
	      
	      Rooster rooster = new Rooster(globalLanguage);      
	      Chicken chicken = new Chicken();
	      rooster.add(chicken);
	      
	      animalList.addItem(chicken);
	      animalList.addItem(rooster);
	      
	      return animalList;
	   }   

	}