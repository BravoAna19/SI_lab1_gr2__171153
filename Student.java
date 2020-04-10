class Student {
	String index;
	String firstName;
	String lastName;
	int *grades;

	//TODO constructor

	Student(String index, String firstName, String lastName, int numberGrades, int *grades){
		this.index=index;
		this.firstName=firstName;
		this.lastName=lastName;
		this.numberGrades=numberGrades;
		for (int i=0; i<numberGrades; i++){
			this.grades[i]=grades[i];
		}
	}

	//TODO seters & getters
	String getIndex(){
		return index;
	}

	void setIndex(index){
		this.index=index;
	}

	String getFirstName(){
		return firstName;
	}
        void setFirstName(firstName){
                this.firstName=firstName;
        }

	String getLastName(){
		return lastName;
	}
        void setLastName(lastName){
                this.lastName=firstName;
        }

	void setNumberGrades(numberGrades){
		this.numberGrades=numberGrades;
	}

	public double getAverage() {
		//TODO
	}

	public int ECTSCredits() {
		//TODO
	}
}

