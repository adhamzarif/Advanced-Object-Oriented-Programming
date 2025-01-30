import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {
        System.out.println("Client Started");
        Socket socket = new Socket("127.0.0.1",22222);
        System.out.println("Client Connected");

        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());


        try
        {
            ReaderThread reader = new ReaderThread(ois,"Client");
            WriterThread writer = new WriterThread(oos,"Client");
        }
        catch(Exception e)
        {

        }

    }

}
