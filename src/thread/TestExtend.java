package thread;
public class TestExtend extends Employee {
	public static void main(String[] args) {
		System.out.println("覆盖的方法调用：" + getSalary("王一", 500));
		System.out.println("继承的方法调用：" + getSalary2("王一", 500));
		System.out.println("覆盖的方法调用：" + getSalary("王飞", 10000));
		System.out.println("继承的方法调用：" + getSalary2("王飞				", 10000));
	}

	public static String getSalary(String name, int salary) {
		String str;
		if (salary > 5000)
			str = "main名字: " + name + "    Salary: 大于5000 " + salary;
		else
			str = "main名字: " + name + "    Salary: 低于5000";
		return str;
	}
};

class Employee {
	public String name;// 名字
	public int salary;// 薪水

	public static String getSalary(String name, int salary) {
		String str;
		str = "Employee名字: " + name + "    Salary: " + salary;
		return str;
	}

	public static String getSalary2(String name, int salary) {
		String str;
		str = "Employee名字: " + name + "    Salary: " + salary;
		return str;
	}
	
	private  void getSalary2(String name, int salary, int x) {
		String str;
		str = "Employee名字: " + name + "    Salary: " + salary;
	}
};
