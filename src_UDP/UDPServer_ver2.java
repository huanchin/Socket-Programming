import java.io.*;
import java.nio.*;
import java.net.*;

class UDPServer{
	public static void main(String args[]) throws Exception {
		DatagramSocket serverSocket = new DatagramSocket(9090);
		System.out.println("Server Ready..");
		serverSocket.setSoTimeout(8000);
		DatagramPacket rcvPacket = new DatagramPacket( new byte[128] , 128);
		int count = 0;
		while(true){
      try{
        serverSocket.receive(rcvPacket);
        String sentence = new String(rcvPacket.getData());
        count++;
        //System.out.println(sentence);
        //System.out.println(count);
      }
      catch(SocketTimeoutException e){
        int  loss = 10000-count;
        System.out.println("Loss: "+Integer.toString(loss));
        count =0;
      }
		}
	}
	
}
