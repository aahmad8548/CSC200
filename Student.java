
public class Student {
	//instance variables
	private String name;
	private int [] conceptArray;
	private int [] programmingArray;
	private int [] projectArray;
	
	//static variables
	private static String professorName = "Anwar Ahmad";
		
	//static methods
	public static void setProfessorName(String newProfessorName) {
		professorName = newProfessorName;
	}
		
	public static String getProfessorName() {
		return professorName;
	}
	
	//default constructor
	public Student() {
		name = "";
		conceptArray = new int[3];
		programmingArray = new int[3];
		projectArray = new int[8];
		
		for(int index = 0; index < conceptArray.length; index++) {
			conceptArray[index] = 0;
		}
		
		for(int index = 0; index < programmingArray.length; index++) {
			programmingArray[index] = 0;
		}
		
		for(int index = 0; index < projectArray.length; index++) {
			projectArray[index] = 0;
		}
	}
	
	//non-static methods
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public int getConceptTest1() {
		return conceptArray[0];
	}

	public void setConceptTest1(int newConceptTest1) {
		if(newConceptTest1 >= 0 && newConceptTest1 <= 100)
			conceptArray[0] = newConceptTest1;
	}

	public int getProgrammingTest1() {
		return programmingArray[0];
	}

	public void setProgrammingTest1(int newProgrammingTest1) {
		if(newProgrammingTest1 >= 0 && newProgrammingTest1 <= 100)
			programmingArray[0] = newProgrammingTest1;
	}

	public int getConceptTest2() {
		return conceptArray[1];
	}

	public void setConceptTest2(int newConceptTest2) {
		if(newConceptTest2 >= 0 && newConceptTest2 <= 100)
			conceptArray[1] = newConceptTest2;
	}

	public int getProgrammingTest2() {
		return programmingArray[1];
	}

	public void setProgrammingTest2(int newProgrammingTest2) {
		if(newProgrammingTest2 >= 0 && newProgrammingTest2 <= 100)
			programmingArray[1] = newProgrammingTest2;
	}

	public int getProject1() {
		return projectArray[0];
	}

	public void setProject1(int newProject1) {
		if(newProject1 >= 0 && newProject1 <= 100)
			projectArray[0] = newProject1;
	}
	
	public int getProject2() {
		return projectArray[1];
	}

	public void setProject2(int newProject2) {
		if(newProject2 >= 0 && newProject2 <= 100)
			projectArray[1] = newProject2;
	}
	
	public int getProject3() {
		return projectArray[2];
	}

	public void setProject3(int newProject3) {
		if(newProject3 >= 0 && newProject3 <= 100)
			projectArray[2] = newProject3;
	}
	
	public int getProject4() {
		return projectArray[3];
	}

	public void setProject4(int newProject4) {
		if(newProject4 >= 0 && newProject4 <= 100)
			projectArray[3] = newProject4;
	}
	
	public int getProject5() {
		return projectArray[4];
	}

	public void setProject5(int newProject5) {
		if(newProject5 >= 0 && newProject5 <= 100)
			projectArray[4] = newProject5;
	}
	
	public int getProject6() {
		return projectArray[5];
	}

	public void setProject6(int newProject6) {
		if(newProject6 >= 0 && newProject6 <= 100)
			projectArray[5] = newProject6;
	}
	
	public int getProject7() {
		return projectArray[6];
	}

	public void setProject7(int newProject7) {
		if(newProject7 >= 0 && newProject7 <= 100)
			projectArray[6] = newProject7;
	}
	
	public int getProject8() {
		return projectArray[7];
	}

	public void setProject8(int newProject8) {
		if(newProject8 >= 0 && newProject8 <= 100)
			projectArray[7] = newProject8;
	}
	
	public int getConceptFinal() {
		return conceptArray[2];
	}

	public void setConceptFinal(int newConceptFinal) {
		if(newConceptFinal >= 0 && newConceptFinal <= 100)
			conceptArray[2] = newConceptFinal;
	}

	public int getProgrammingFinal() {
		return programmingArray[2];
	}

	public void setProgrammingFinal(int newProgrammingFinal) {
		if(newProgrammingFinal >= 0 && newProgrammingFinal <= 100)
			programmingArray[2] = newProgrammingFinal;
	}
	
}

	