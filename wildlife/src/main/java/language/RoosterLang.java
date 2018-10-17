package language;

public class RoosterLang implements ILanguage{

	private LanguageRoasterBuilder LanguageRoasterBuilder = new LanguageRoasterBuilder();
	
	public String speakDesiredLanguage(String language) {
		return LanguageRoasterBuilder.getLanguages().get(language);
	}


}
