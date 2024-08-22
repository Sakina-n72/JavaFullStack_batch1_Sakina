package javabasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

record Person(String name, Gender gender, Long salary) {}
enum Gender{MALE, FEMALE, PNTS}


public class StreamsDemo {

	public static void main(String[] args) {
		List<Person> ListOfPerson = List.of(
				new Person("Karthik", Gender.MALE,21500L),
				new Person("Fatima", Gender.FEMALE, 24800L),
				new Person("Anshuman", Gender.MALE, 23000L),
				new Person("Dhruv", Gender.MALE,34900L)
				);
		ArrayList<Person> ArrayOfPerson = new ArrayList(ListOfPerson);
		
		Collections.sort(ArrayOfPerson, (o1, o2) -> o2.salary().compareTo(o1.salary()));
		System.out.println("Details of high income : "+ArrayOfPerson.get(0));
		
//		new ArrayList((ListOfPerson.(person1)->person1.gender().compareTo(Gender.FEMALE)));
		ListOfPerson.forEach(person -> System.out.println(person.name().length()));
		System.out.println("Details of all male");
		for(int i = 0; i < ListOfPerson.size(); i++) {
			if(ListOfPerson.get(i).gender().equals(Gender.MALE)) {
				System.out.println(ListOfPerson.get(i));
			}
			
		}
		
	}	
}
