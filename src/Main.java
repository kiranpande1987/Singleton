
public class Main {

    public static void main(String[] args)
    {
        Singleton instanceOne = new Singleton();
        Singleton instanceTwo = new Singleton();

        System.out.println("Hashcode of One : "+instanceOne.hashCode());
        System.out.println("Hashcode of Two : "+instanceTwo.hashCode());

    }
}
