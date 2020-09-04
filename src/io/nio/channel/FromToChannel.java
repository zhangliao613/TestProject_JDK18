package io.nio.channel;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FromToChannel {

	 public static void main(String[] args) {
		
	 }
	 
	 public static void from(){
		 RandomAccessFile fromFile;
		try {
			fromFile = new RandomAccessFile("fromFile.txt", "rw");
			FileChannel      fromChannel = fromFile.getChannel();
			
			RandomAccessFile toFile = new RandomAccessFile("toFile.txt", "rw");
			FileChannel      toChannel = toFile.getChannel();
			long position = 0;
			long count = fromChannel.size();
	
			toChannel.transferFrom(fromChannel, count, position);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }

	 
	 
	 public static void to(){
		 RandomAccessFile fromFile;
		try {
			fromFile = new RandomAccessFile("fromFile.txt", "rw");
			FileChannel      fromChannel = fromFile.getChannel();

			RandomAccessFile toFile = new RandomAccessFile("toFile.txt", "rw");
			FileChannel      toChannel = toFile.getChannel();

			long position = 0;
			long count = fromChannel.size();

			fromChannel.transferTo(position, count, toChannel);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }

}