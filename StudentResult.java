package Assignment3;

import java.util.*;

public class StudentResult {
//this program will get the name(Amit/Vijay/Rahul) of student from the user and will print
//the percent of marks which are stored in the hashmap
		String name;
		
		public static void main(String[] args) {
			
			HashMap<String,Integer> hm = new HashMap<String,Integer>();
			hm.put("Amit",85);
			hm.put("Vijay",98);
			hm.put("Rahul",79);
			StudentResult st = new StudentResult();
			Scanner sc = new Scanner(System.in); //to get input from the user
			System.out.println("Please enter the student name: Amit/Vijay/Rahul");
			st.name = sc.next(); //getting name of the student
			
			if (st.name.equalsIgnoreCase("Amit")){
				System.out.println(st.name+" has achieved "+hm.get("Amit")+" % marks");
			}
			
			else if (st.name.equalsIgnoreCase("Vijay")){
				System.out.println(st.name+" has achieved "+hm.get("Vijay")+" % marks");
			}
			
			else if (st.name.equalsIgnoreCase("Rahul")){
				System.out.println(st.name+" has achieved "+hm.get("Rahul")+" % marks");
			}
			
			else{
				System.out.println("Student name is not present in the records");
			}
			
			
		}

}
