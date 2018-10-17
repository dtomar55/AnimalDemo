package wildlife;

public abstract class Fish implements IAnimal{

	public Boolean fly() {
		return Boolean.FALSE;
	}

	public Boolean walk() {
	    return Boolean.FALSE;
	}

	public Boolean swim() {
		return Boolean.TRUE;
	}

	public String sing() {
	    return "Fish Does not Sing";
	}

	abstract public String color();
	abstract public String size();
	abstract public Boolean isVegetarian();
	abstract public Boolean makeJokes();
}
