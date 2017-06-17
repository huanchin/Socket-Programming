import java.io.*;
import java.nio.*;
import java.net.*;

class UDPClient{
	public static void main(String args[]) throws Exception {
		DatagramSocket clientSocket = new DatagramSocket();
		
		InetAddress serverIP = InetAddress.getByName("127.0.0.1");
		for (int i = 0; i < 10000; ++i){
			String sentence = "Hello";
			byte[] bytes = sentence.getBytes();
			
			DatagramPacket sendPkt = new DatagramPacket( bytes, bytes.length, serverIP, 9090);
			clientSocket.send(sendPkt);
			
			Thread.sleep(1);
			
		}
		
		clientSocket.close();
		
	}
	
}
