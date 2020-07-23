package serialization;

import java.io.*;

public class Main {

    public static void main(String[] args)
    {
        try
        {
            Singleton instanceOne = Singleton.getInstance();
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
            out.writeObject(instanceOne);
            out.close();
            ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));
            Singleton instanceTwo = (Singleton) in.readObject();
            in.close();

            System.out.println("HashCode of Object 1 - " + instanceOne.hashCode());
            System.out.println("HashCode of Object 2 - " + instanceTwo.hashCode());
        }
        catch (Exception e)
        {
            System.out.println("Exception : "+e.getLocalizedMessage());
        }
    }
}
