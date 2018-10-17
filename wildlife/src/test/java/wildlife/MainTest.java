package wildlife;

import junit.framework.*;
import language.GlobalLanguage;

public class MainTest extends TestCase {
   protected AnimalList animalList = new AnimalList();
   
   protected GlobalLanguage globalLanguage = new GlobalLanguage("Danish");
	
   protected void setUp(){
	      
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

   }

   public void testCountOfFlyAnimals(){
	   
	  Integer countAnimalCanFly =  animalList.animalCanFly();
      assertTrue(countAnimalCanFly == 5);
   }

   public void testRoosterLanguage(){
	  
	   Rooster rooster = new Rooster(globalLanguage);
	   String voice = rooster.sing();
	   
      assertTrue(voice.equalsIgnoreCase("kykyliky"));
   }
   
}