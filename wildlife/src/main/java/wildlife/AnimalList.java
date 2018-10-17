package wildlife;

import java.util.ArrayList;
import java.util.List;

public class AnimalList {
   private List<IAnimal> animals = new ArrayList<IAnimal>();	

   public void addItem(IAnimal item){
      animals.add(item);
   }

   public Integer animalCanFly(){
      Integer flyCount = 0;
      
      for (IAnimal animal : animals) {
    	  if (animal.fly()){
    	     flyCount = flyCount +  1;
    	  }
      }		
      return flyCount;
   }
   
   public void makeAllAnimalSpeak() {

	   for (IAnimal animal : animals) {
		   System.out.println(animal.sing());
	   }		
	   
   }
}