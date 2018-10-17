package language;

import java.util.HashMap;
import java.util.Map;

public class LanguageRoasterBuilder {

	   private Map<String,String> languages;

	   public LanguageRoasterBuilder() {
		   this.languages = prepareListOfAnimal();
	   }
	   
	   private  Map<String,String> prepareListOfAnimal(){
		   Map<String,String> roosterLangs = new HashMap<String,String>();
		   roosterLangs.put("Danish", "kykyliky");
		   roosterLangs.put("Dutch", "kukeleku");
		   roosterLangs.put("Finnish", " kukko kiekuu");
		   roosterLangs.put("English", "Cock-a-doodle-doo");
		   
		   return roosterLangs;
	   }   

	   public Map<String, String> getLanguages() {
		return languages;
	   }



}