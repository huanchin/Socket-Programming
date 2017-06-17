import java.io.*;
import java.nio.*;
import java.net.*;

class UDPServer{
	public static void main(String args[]) throws Exception {
		DatagramSocket serverSocket = new DatagramSocket(9091);
		System.out.println("Server Ready..");
		
		DatagramPacket rcvPacket = new DatagramPacket( new byte[128] , 128);
		int count = 0;
		while(true){
			serverSocket.receive(rcvPacket);
			String sentence = new String(rcvPacket.getData());
			count++;
			System.out.println(sentence);
			System.out.println(count);
		}
	}
	
}
