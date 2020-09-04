package InnerClass;

class Outer3 {
	int score = 95;

	void inst()

	{
		Inner in = new Inner();
		in.display();
	}

	public class Inner {
		void display() {
			System.out.println("成绩: score = " + score);
		}
	}
}

public class InnerClassDemo3 {
	public static void main(String[] args) {
		Outer3 outer = new Outer3();
		Outer3.Inner inner = outer.new Inner();
		inner.display();
	}
}