package wildlife;

public abstract class Bird implements IAnimal{

	public Boolean fly() {
		return Boolean.TRUE;
	}

	public Boolean walk() {
	    return Boolean.TRUE;
	}

	public Boolean swim() {
		return Boolean.FALSE;
	}

}
