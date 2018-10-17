package wildlife;

import java.util.ArrayList;
import java.util.List;

import language.GlobalLanguage;
import language.RoosterLang;

public class Rooster extends Bird{

	private RoosterLang roosterLang = new RoosterLang();

	private GlobalLanguage globalLanguage;
	private List<Chicken> childs = new ArrayList<Chicken>();

	public Rooster(GlobalLanguage globalLanguage) {
		this.globalLanguage = globalLanguage;
	}

	public String sing() {
		return roosterLang.speakDesiredLanguage(globalLanguage.getSelectedLanguage());
	}

	public void add(Chicken e) {
	   childs.add(e);
	}

	public void remove(Chicken e) {
	   childs.remove(e);
	}

	public List<Chicken> getChild(){
	    return childs;
	}	
}
