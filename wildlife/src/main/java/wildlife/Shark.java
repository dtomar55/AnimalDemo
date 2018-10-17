package wildlife;

public class Shark extends Fish{

	@Override
	public String color() {
		return "Grey";
	}

	@Override
	public String size() {
		return "Large";
	}

	@Override
	public Boolean isVegetarian() {
		return Boolean.FALSE;
	}

	@Override
	public Boolean makeJokes() {
		return Boolean.FALSE;
	}


}
