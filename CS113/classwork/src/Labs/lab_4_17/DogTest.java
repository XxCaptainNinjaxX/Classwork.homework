// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//
// ****************************************************************
public class DogTest {

    public static void main(String[] args) {
        // Dog dog = new Dog("Spike"); // abstracted classes cannot be institaited
        //System.out.println(dog.getName() + " says " + dog.speak());

        Labrador d = new Labrador("Cherry", "Green");

        System.out.println(d.getName() + " says " + d.speak());
        System.out.println("Avg Breed Weight: " + Labrador.avgBreedWeight());

        Yorkshire y = new Yorkshire("Harper");
        System.out.println(y.getName() + " says: " + y.speak());
    }
}
