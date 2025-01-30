import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(22222);
        System.out.println("Server Started");
        int count = 1;

        while(true)
        {
            Socket socket = serverSocket.accept();
            System.out.println("Client " + count + " Connected");
            count++;
            new ServerThread(socket);

        }

    }

}

class ServerThread implements Runnable
{
    Socket clientSocket;
    Thread t;

    ServerThread(Socket clientSocket)
    {
        this.clientSocket = clientSocket;
        t = new Thread(this);
        t.start();
    }

    public void run()
    {

        try
        {
            ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
            ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream());
            Object msg = ois.readObject();
            System.out.println("From Client: " + (String) msg);

            String toClientMsg = ((String) msg).toUpperCase();
            oos.writeObject(toClientMsg);
        }
        catch(Exception e){}

    }
}
