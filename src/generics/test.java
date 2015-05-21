package generics;

import java.util.ArrayList;
import java.util.Collections;

public class test {

	public static void main(String[] args) {
		Person<String> p1 = new Person<String>("Al");
		System.out.println(p1);

		Person<String> p3 = new Person<String>("Al");
		System.out.println(p3);

		FullName name = new FullName("Paul", "Gibsen");
		Person<FullName> p2 = new Person<FullName>(name);
		System.out.println(p2);

		FullName name2 = new FullName("Sar", "Noris");
		Person<FullName> p4 = new Person<FullName>(name2);
		System.out.println(p4);

		FullName name3 = new FullName("An", "Bobsen");
		Person<FullName> p5 = new Person<FullName>(name3);
		System.out.println();

		//p2.setName(name);
		//System.out.println(p2);

		System.out.println(p1.compareTo(p3));
		System.out.println(p2.compareTo(p4));
		System.out.println();
		System.out.println();

		ArrayList<Person<FullName>> persons = new ArrayList<Person<FullName>>();
		persons.add(p2);
		persons.add(p4);
		persons.add(p5);

		for (Person<FullName> person : persons) {
			System.out.println(person);
		}

		System.out.println();

		Collections.sort(persons);
		for (Person<FullName> person : persons) {
			System.out.println(person);
		}
	}

}
