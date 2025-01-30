/* To run multiple instances of the Client:
- Run the Client class once
- Go to Run, select Edit Configuration
- Select Client class, then select Modify Options
- Tick Allow Multiple Instances */
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {
        System.out.println("Client Started");
        Socket socket = new Socket("127.0.0.1",22222);
        System.out.println("Client Connected");

        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        oos.writeObject(msg);

    }

}
