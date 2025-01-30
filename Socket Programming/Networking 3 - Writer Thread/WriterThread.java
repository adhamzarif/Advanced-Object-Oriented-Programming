import java.io.ObjectOutputStream;
import java.util.Scanner;

public class WriterThread implements Runnable{

    ObjectOutputStream oos;
    String name;
    Thread t;

    WriterThread(ObjectOutputStream oos, String name)
    {
        this.oos = oos;
        this.name = name;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);

        while(true) {

            String input = sc.nextLine();

            try {

                oos.writeObject(input);
                System.out.println(name + " sent : " + input);

            } catch (Exception e) {
            }
        }

    }
}
