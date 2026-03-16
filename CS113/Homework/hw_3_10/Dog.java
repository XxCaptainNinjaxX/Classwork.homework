package CS113.Homework.hw_3_10;

public class Dog {

    private int DogAge;
    private String DogBreed;

    public Dog(int age, String breed) {
        DogAge = age;
        DogBreed = breed;
    }

    public int GetAge() {
        return DogAge;
    }

    public String GetBreed() {
        return DogBreed;
    }

    public String toString() {
        return "Breed: " + DogBreed + "," + " Age: " + DogAge;
    }

    public boolean isEquals(Dog other) {
        return DogBreed.equals(other.DogBreed);
    }

    public int compareTo(Dog other) {
        if (DogAge > other.GetAge()) {
            return 1;
        } else if (DogAge < other.GetAge()) {
            return -1;
        } else return 0;
    }
}
