package thread;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ThreadLocalDemo {
	public static void main(String args[]) {
	}
}

class DBUtil {
	//创建一个存储数据库连接对象的ThreadLocal线程本地变量
	private static ThreadLocal<Connection> tl = new ThreadLocal<Connection>();
 
	static{
		try {
			//注册驱动
//			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * 获取数据库的连接对象
	 */
	public static Connection getConnected(){
		Connection conn = null;
		conn = tl.get();		//第一步：从ThreadLocal对象当中去获取
		if(conn == null){		//若没有获取到，原始方法获取
			try {
				conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.122.1:1521/xe","store","store_password");
				//获取连接对象以后，都设置为默认手动提交
				conn.setAutoCommit(false);	
				//第二部：将连接对象放入对应的ThreadLocal泛型对象tl当中(进而绑定到使用它的线程对象上)
				tl.set(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
 
	/*
	 * 关闭数据库的连接，并删除对应的ThreadLocal中的对象
	 */
	public static void closeConnection(){
		Connection conn = null;
		conn = tl.get();		//第三步：使用完毕，再次获取对象
		if(conn != null){
			tl.remove();		//第四步：线程操作数据库完毕，移除
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
