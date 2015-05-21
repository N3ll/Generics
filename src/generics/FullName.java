package generics;

public class FullName implements Comparable<FullName> {

	private String firstName;
	private String lastName;

	public FullName() {
		this.firstName = null;
		this.lastName = null;
	}

	public FullName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String lestName() {
		return lastName;
	}

	@Override
	public String toString() {
		String name = this.firstName + " " + this.lastName;
		return name;
	}

	@Override
	public int compareTo(FullName o) {
		if(this.firstName.length() < o.getFirstName().length()){
			return -1;
		}else if(this.firstName.length() > o.getFirstName().length()){
			return 1;
		}else{
			return 0;
		}
	}
}
