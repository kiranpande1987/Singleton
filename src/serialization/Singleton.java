package serialization;

public class Singleton {

    private static Singleton instance;

    private Singleton(){}

    static synchronized Singleton getInstance()
    {
        if(instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }
}
