package InnerClass;

class Outer {
	Outer(){
		System.out.println("===Outer===成绩: score = " + score);
	}
	int score = 95;

	void inst() {
		Inner in = new Inner();
		in.display();
	}

	class Inner {
		Inner()
		{
			System.out.println("===Inner===成绩: score = " + score);
		}
		int innerTest = 95;
		void display() {
			System.out.println("成绩: score = " + score);
			System.out.println("成绩: innerTest = " + innerTest);
		}
		
	}
}

public class InnerClassDemo {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.inst();
	}
}