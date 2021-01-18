package pl.krysinski;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Animal petTest = new Animal("Unknown", 10.0);
        petTest.feed(3);
        Human me = new Human("Marcin", "Krysiński", petTest,new Car("pr", "ss"));

        System.out.println(me);
    }
}
