package SimpleFactory;

public class Printer implements Output {
	private String[] printData=new String[MAX_CACHE_LINE];
	//用以记录当前需打印的作业数
	private int dataNum=0;

	@Override
	public void getData(String str) {
		if(dataNum>=MAX_CACHE_LINE){
			System.out.println("输出队列一满，添加失败");
		}else{
			printData[dataNum++]=str;
		}

	}

	@Override
	public void out() {
		while(dataNum>0){
			System.out.println("打印机打印："+printData[0]);
			//把作业整体前移一位，并将剩下的作业数减一
			System.arraycopy(printData, 1, printData, 0, --dataNum);
		}

	}

}
