
public class Main {

    public static void main(String[] args)
    {
        Singleton instanceOne = Singleton.getInstance();
        Singleton instanceTwo = Singleton.getInstance();

        System.out.println("Hashcode of One : "+instanceOne.hashCode());
        System.out.println("Hashcode of Two : "+instanceTwo.hashCode());

    }
}
