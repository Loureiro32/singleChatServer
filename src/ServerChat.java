import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerChat {
    public void serverReceive() throws IOException {

        try {
            while (true) {
                ServerSocket serverSocket = new ServerSocket(6000);
                Socket clientSocket = serverSocket.accept();

                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));


                String ClientData = in.readLine();
                System.out.println("Client Message : " + ClientData);


                String processMessage = "Server Receive : ";
                out.println(processMessage + ClientData);


                clientSocket.close();
                serverSocket.close();
            }
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
