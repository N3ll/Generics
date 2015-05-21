package generics;


public class Person<T extends Comparable<T>> implements Comparable<Person<T>>{

	private T name;

	public Person() {
		this.name = null;
	}

	public Person(T name) {
		this.name = name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public T getName() {
		return this.name;
	}

	@Override
	public String toString() {
		if(name == null){
			return "";
		}else
		{
		
		return name.toString();
		}
	}


	@Override
	public int compareTo(Person<T> o) {
		return	this.getName().compareTo(o.getName());
	}
}
