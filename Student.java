
class Student implements Comparable<Student> {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	
	  
	  public int compareTo(Student st){
		  if(rollno==st.rollno)
			  return 0; 
		  else if(rollno>st.rollno) 
			  return 1;
		  else
			  return -1; 
		  }
	 
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}