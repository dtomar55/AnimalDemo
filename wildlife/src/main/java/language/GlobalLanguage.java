package language;

public class GlobalLanguage {
	String selectedLanguage;

	
    public GlobalLanguage(String language) 
    { 
    	this.selectedLanguage= language;
    } 
  
	public String getSelectedLanguage() {
		return selectedLanguage;
	}

}
