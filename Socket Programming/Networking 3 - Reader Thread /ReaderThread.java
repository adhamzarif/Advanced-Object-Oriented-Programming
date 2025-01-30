import java.io.ObjectInputStream;

public class ReaderThread implements Runnable{

    ObjectInputStream ois;
    String name;
    Thread t;

    ReaderThread(ObjectInputStream ois, String name)
    {
        this.ois = ois;
        this.name = name;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {

        while(true)
        {
            try
            {
                Object received = ois.readObject();

                System.out.println(name + " received: " + (String) received);

            }
            catch(Exception e){}
        }

    }


}
