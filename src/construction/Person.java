package construction;

class Person {
	public String name = "";
	private int age = 0;

	public Person() {
		System.out.println("person无参数构造函数===name==="+name+"===age==="+age);
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("person 2 参数的构造函数===name==="+name+"===age==="+age);
	}
}