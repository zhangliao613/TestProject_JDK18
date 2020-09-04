package InnerClass;

class Outer2 {
	static int score = 95;
	int score1 = 95;

	void inst() {
		Inner in = new Inner();
		in.display();
	}

	// 这里用static声明内部类
	static class Inner {
		void display() {
			System.out.println("成绩: score = " + score);
			System.out.println("成绩: score1 = " + score1);
		}
	}
}

public class InnerClassDemo2 {
	public static void main(String[] args) {
		Outer2 outer = new Outer2();
		outer.inst();
	}
}