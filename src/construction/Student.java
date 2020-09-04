package construction;

class Student extends Person {
	private String school;
	private String grade;

	public Student() {
		System.out.println("student 无参数的构造函数");
	}

	public Student(String name, int age, String school) {
		System.out.println("student 2 参数的构造函数===name==="+name+"===age==="+age+"===school==="+school);
	}

	public Student(String name, int age, String school, String grade) {
		super(name, age);
		this.name= name;
		this.school = school;
		this.grade = grade;
		System.out.println("student 3 参数的构造函数，super().===name==="+name+"===age==="+age+"===school==="+school+"===grade==="+grade);
	}
	
	public void test(){
	}
	
	public static void main(String[] args) {
		System.out.println("st1:");
		Student st2 = new Student();
		System.out.println("---------------------------");

		System.out.println("st2:");
		Student st = new Student("zhangshan", 76, "武大");
		System.out.println("---------------------------");

		System.out.println("st3:");
		Student st3 = new Student("lisi", 24, "武大", "研究生");

	}
}