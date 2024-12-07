import java.util.Scanner;
public class GPA {

	public static void main(String[] args) {
		Scanner sd = new Scanner(System.in);
		
		System.out.println("Physics");
		int phy = sd.nextInt();
		
        double gpa1 = 0, gpa2 = 0, gpa3 = 0, gpa4 = 0, gpa5 = 0;
		
		
		if(phy >= 70 && phy<=100) {
			System.out.println("A");
			System.out.println("Pass");
			gpa1 =5;
		}
		else if(phy >= 60 && phy<=69) {
			System.out.println("B+");
			System.out.println("Pass");
			gpa1 =4.5;
		}
		else if(phy >= 50 && phy<=59) {
			System.out.println("B");
			System.out.println("Pass");
			gpa1 =4;
		}
		
		else if(phy >= 40  && phy<=49) {
			System.out.println("C");
			System.out.println("Pass");
			gpa1 =3;
		}
		else if(phy >= 30 && phy<=39) {
			System.out.println("D");
			System.out.println("Suplimentary");
			gpa1 =2;
			
		}
		else if(phy >= 0 && phy<=29) {
			System.out.println("E");
			System.out.println("Suplimentary");
			gpa1 =1;
			
		}
		else {
			System.out.println("check your data and try again");
		}
		
		
		
		
		System.out.println("Chemistry");
		int chem = sd.nextInt();
		
		
		if(chem >= 70 && chem<=100) {
			System.out.println("A");
			System.out.println("Pass");
			gpa2 = 5;
		}
		else if(chem >= 60 && chem<=69) {
			System.out.println("B+");
			System.out.println("Pass");
			gpa2 = 4.5;
		}
		else if(chem >= 50 && chem<=59) {
			System.out.println("B");
			System.out.println("Pass");
			gpa2 = 4;
		}
		
		else if(chem >= 40 && chem<=49) {
			System.out.println("C");
			System.out.println("Pass");
			gpa2 = 3;
		}
		else if(chem >= 30 && chem<=39) {
			System.out.println("D");
			System.out.println("Suplimentary");
			gpa2 = 2;
		}
		else if(chem >= 0 && chem<=29) {
			System.out.println("E");
			System.out.println("Suplimentary");
			gpa2 = 1;
			
		}
		else {
			System.out.println("Check your data and try again");
		}
		
		
		
		System.out.println("Biology");
		int bio = sd.nextInt();
		
		if(bio >= 70 && bio<=100) {
			System.out.println("A");
			System.out.println("Pass");
			gpa3 = 5;
		}
		else if(bio >= 60 && bio<=69) {
			System.out.println("B+");
			System.out.println("Pass");
			gpa3 = 4.5;
		}
		else if(bio >= 50 && bio<=59) {
			System.out.println("B");
			System.out.println("Pass");
			gpa3 = 4;
		}
		
		else if(bio >= 40 && bio<=49) {
			System.out.println("C");
			System.out.println("Pass");
			gpa3 = 3;
		}
		else if(bio >= 30 && bio<=39) {
			System.out.println("D");
			System.out.println("Suplimentary");
			gpa3 = 2;
		}
		else if(bio >= 0 && bio<=29) {
			System.out.println("E");
			System.out.println("Suplimentary");
			gpa3 = 1;
			
		}
		else {
			System.out.println("Check your data and try again");
		}
		
		
		
		System.out.println("Mathematics");
		int math = sd.nextInt();
		
		
		if(math >= 70 && math<=100) {
			System.out.println("A");
			System.out.println("Pass");
			gpa4 = 5;
		}
		else if(math >= 60 && math<=69) {
			System.out.println("B+");
			System.out.println("Pass");
			gpa4 = 4.5;
		}
		else if(math >= 50 && math<=59) {
			System.out.println("B");
			System.out.println("Pass");
			gpa4 = 4;
		}
		
		else if(math >= 40 && math<=49) {
			System.out.println("C");
			System.out.println("Pass");
			gpa4 = 3;
		}
		else if(math >= 30 && math<=39) {
			System.out.println("D");
			System.out.println("Suplimentary");
			gpa4 = 2;
		}
		else if(math >= 0 && math<=29) {
			System.out.println("E");
			System.out.println("Suplimentary");
			gpa4 = 1;
			
		}
		else {
			System.out.println("Check your data and try again");
		}
		
		
		
		System.out.println("English");
		int eng = sd.nextInt();
		
		
		if(eng >= 70 && eng<=100) {
			System.out.println("A");
			System.out.println("Pass");
			gpa5 = 5;
		}
		else if(eng >= 60 && eng<=69) {
			System.out.println("B+");
			System.out.println("Pass");
			gpa5 = 4.5;
		}
		else if(eng >= 50 && eng<=59) {
			System.out.println("B");
			System.out.println("Pass");
			gpa5 = 4;
		}
		
		else if(eng >= 40 && eng<=49) {
			System.out.println("C");
			System.out.println("Pass");
			gpa5 = 3;
		}
		else if(eng >= 30 && eng<=39) {
			System.out.println("D");
			System.out.println("Suplimentary");
			gpa5 = 2;
		}
		else if(eng >= 0 && eng<=29) {
			System.out.println("E");
			System.out.println("Suplimentary");
			gpa5 = 1;
			
		}
		else {
			System.out.println("Check your data and try again");
		}
		
		
	 double GPA;
	 
	 //CREDIT
	 int phygrade = 4;
	 int chemgrade = 3;
	 int biograde = 3;
	 int mathgrade = 4;
	 int enggrade = 3;
	 
	 int totalgrade;
	 //calculating total grade
	 
	 totalgrade = phygrade+chemgrade+biograde+mathgrade+enggrade;
	 
	 
	 GPA = ((gpa1*phygrade)+(gpa2*chemgrade)+(gpa3*biograde)+(gpa4*mathgrade)+(gpa5*enggrade))/totalgrade;
	 
	 System.out.println("GPA is " + GPA);
	 
	 
	 
	 if(GPA>=4.4 && GPA<=5.0) {
		 System.out.println("First class");
	 }
	
	 else if(GPA>=3.5  && GPA<4.3) {
		 System.out.println("Upper second class");
	 }
	
	 else if(GPA>=2.7  && GPA<3.4){
		 System.out.println("Lower second class");
	 }
	 else{
		 System.out.println("Pass");
	 }
	
	
	

	}

}
