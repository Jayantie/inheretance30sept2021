import java.util.ArrayList;
import java.util.Scanner;

public class Student_Management {
//arraylist allstudent bewaart en weergeeft alle attributen van een person
	public static ArrayList<String> allstudent = new ArrayList<String>();
	
	public Student_Management() {
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
//kies optie 1 of 2		
		System.out.println("1.Gegevens invoeren");
		System.out.println("2.Gegevens bekijken");

		Student student = new Student();
		
		if (input.next()=="1") {
			System.out.println("Lastname:");
			student.setLastname(input.next());
			
			System.out.println("Firstname:");
			student.setFirstname(input.next());
			
			System.out.println("Birthdate:");
			student.setBirthdate(input.next());
		
			System.out.println("Gender:");
			student.setGender(input.next());
			
			System.out.println("ethnicity:");
			student.setEthnicity(input.next());
			
			System.out.println("Nationality:");
			student.setNationality(input.next());
			
			System.out.println("Adress:");
			student.setAdress(input.next());
			
			System.out.println("Naam:");
			student.setLastname(input.next());
			
			System.out.println("Cohort:");
			student.setCohort(input.next());
			
			System.out.println("Student_number:");
			student.setStudent_number(input.next());
			
			System.out.println("Email:");
			student.setEmail(input.next());
			
			System.out.println("Specialization:");
			student.setSpecialization(input.next());
			
		
//ik probeer alle ingevoerde gegevens te adden in array middels addall method			
			allstudent.addAll(student.studentarray);
//FIXME
//Als ik optie 1 kies, vraagt hij me niet student gegevens in te vullen
			
			System.out.println("1.Gegevens invoeren");
			System.out.println("2.Gegevens bekijken");
			
		} else if(input.next()=="2") {
			
		}else {
			System.out.println("Graag een keuze maken uit bovenstaande opties");
		}
		
	}
	
//FIXME	
//hier will ik ingevoerde gegevens saven in me arraylist		
	public void SaveStudent() {
	}

}
