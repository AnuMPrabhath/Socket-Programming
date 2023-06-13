import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
            //create a server socket.
            ServerSocket serverSocket = new ServerSocket(6666);

            //access request and move to new socket
            Socket socket = serverSocket.accept();

            //java application used inputStream to read the data
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

            String s = dataInputStream.readUTF();
            System.out.println("Client : " + s);

            socket.close();

    }
}