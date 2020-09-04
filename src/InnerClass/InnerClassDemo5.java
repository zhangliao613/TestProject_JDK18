package InnerClass;

class Outer5 {
	int score = 95;

	void inst(final int s) {
		final int temp = 20;
		int temp2 = 20;
		class Inner {
			void display() {
				System.out.println("成绩: score = " + (score + s + temp));
				System.out.println("成绩: score = " + (score + s + temp2));
			}
		}
		Inner in = new Inner();
		in.display();
	}
}

public class InnerClassDemo5 {
	public static void main(String[] args) {
		Outer5 outer = new Outer5();
		outer.inst(5);
	}
}