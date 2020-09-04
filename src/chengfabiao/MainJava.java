package chengfabiao;



public class MainJava {
	public static void main(String []args) throws Exception
	{
		MainJava mainJava =  new MainJava();
//		mainJava.chengfabiao_for();
//		mainJava.chengfabiao_while();
		mainJava.chengfabiao_for();
	}

	
	public void chengfabiao()
	{
		for (int i = 1; i <= 2; i++) {
			System.out.println("===i==="+i);
			for (int j = 1; j <= 2; j++) {
				System.out.println("===j==="+j);
			}
		}

	}
	public void chengfabiao_for()
	{
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i >= j) {
					//System.out.print(i + "*" + j + "=" + (i * j) + "  ");
					System.out.print((i * j) + "  ");
				}
			}
			System.out.println();
		}

	}
	
	public void chengfabiao_while()
	{
		int i = 9;

		while (i >= 1) {
			int j = i;
			while ((j <= i) && (j > 0)) {
				System.out.print(i + "*" + j + "=" + j * j + " ");
				j--;
			}

			System.out.println(" ");
			i--;

		}

	}
	
	public void qiufan()
	{
		int a=42;
		int b=~a;
		System.out.println("b="+b);
		int c = 36;
		int d = 2;
		System.out.println("b="+(c>>>d));
	}
}
