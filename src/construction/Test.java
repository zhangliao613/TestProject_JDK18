package construction;

class Test {
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