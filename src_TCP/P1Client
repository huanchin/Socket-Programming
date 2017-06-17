// P1Client.java
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class P1Client {
   private Socket clientSocket = null;
   private BufferedReader inFromServer = null;
   
   public void connectToServer() throws IOException {
      String serverAddress = "140.112.18.178";
      //serverAddress = "140.112.18.178";
      int port = 9090;
      // TODO: clientSocket = ?
	  clientSocket = new Socket(serverAddress,port);
	  System.out.println("Connect to server at " + serverAddress + "..");
      // TODO: inFromServer = ?
	  
   }

   public void start() throws Exception {
      // TODO: handle messages recv from and send to server
	  
	  while(true){
	  inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
	  String modifiedSentence = inFromServer.readLine();
	  System.out.println(modifiedSentence);
	  DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
	  BufferedReader msg = new BufferedReader(new InputStreamReader(System.in));
	  String clientmsg = msg.readLine()+'\n';
	  outToServer.writeBytes(clientmsg);
	  }
	  
   }


   /**
    * Runs the client application.
    */
   public static void main(String[] args) throws Exception {
      P1Client client = new P1Client();
      client.connectToServer();
      client.start();
      client.clientSocket.close();
   }
}
