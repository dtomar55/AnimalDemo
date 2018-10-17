package wildlife;

public class Clownfish extends Fish{

	@Override
	public String color() {
		return "Orange";
	}

	@Override
	public String size() {
		return "Small";
	}

	@Override
	public Boolean isVegetarian() {
		return Boolean.TRUE;
	}

	@Override
	public Boolean makeJokes() {
		return Boolean.TRUE;
	}


}
