package io.nio.channel;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelDemo {

	 public static void main(String[] args) {
		 RandomAccessFile aFile;
		try {
			aFile = new RandomAccessFile("D:/test.txt", "rw");

			 FileChannel inChannel = aFile.getChannel();
			 
			 ByteBuffer buf = ByteBuffer.allocate(48);
			 
			 int bytesRead = inChannel.read(buf);
			 System.out.println("buf.capacity() " + buf.capacity());
			 while (bytesRead != -1) {
				 
				 System.out.println("Read " + bytesRead);
				 buf.flip();
				 
				 while(buf.hasRemaining()){
					 System.out.print((char) buf.get());
				 }
				 System.out.println("");
				 System.out.println("buf.capacity() " + buf.capacity());
				 
				 buf.clear();
				 bytesRead = inChannel.read(buf);
			 }
			 aFile.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }


}