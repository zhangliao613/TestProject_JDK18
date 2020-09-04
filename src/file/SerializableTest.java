package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTest {
	public static void main(String[] args) throws IOException, IOException,
			ClassNotFoundException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				"d:/data.txt"));
		Person p = new Person(25, "China", 180);
		oos.writeObject(p);
		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				"d:/data.txt"));
		Person p1 = (Person) ois.readObject();
		System.out.println("age=" + p1.age + ";address=" + p1.address
				+ ";height=" + p1.height);
		ois.close();
	}
}
