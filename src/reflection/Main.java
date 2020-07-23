package reflection;

import java.lang.reflect.Constructor;

public class Main {

    public static void main(String[] args)
    {
        Singleton objOne = Singleton.getInstance();
        Singleton objTwo = null;
        try
        {
            Constructor constructor = Singleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            objTwo = (Singleton) constructor.newInstance();
        }
        catch (Exception ex)
        {
            System.out.println("Exception : SingleTon Object Already Present.");
            objTwo = objOne;
        }

        System.out.println("Hashcode of Object 1 - "+objOne.hashCode());
        System.out.println("Hashcode of Object 2 - "+objTwo.hashCode());
    }
}
