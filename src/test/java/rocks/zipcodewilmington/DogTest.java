package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    public void constructorTest () {
        String givenName ="Long Chris";
        Date givenBirthDate = new Date();
        Integer givenID = 10;

        Dog dog = new Dog (givenName, givenBirthDate, givenID);

        String newName = dog.getName();
        Date newDate = dog.getBirthDate();
        Integer newId = dog.getId();

        Assert.assertEquals(givenName, newName);
        Assert.assertEquals(givenBirthDate, newDate);
        Assert.assertEquals(givenID, newId);

    }

    @Test
    public void speakTest(){
        Dog dog = new Dog("Nick", new Date(), 11);

        String speakResult = dog.Speak();

        Assert.assertEquals("bark!", speakResult);

    }

    @Test
    public void setBirthdateTest(){

        Date date = new Date(1991, 01, 30);
        Dog dog = new Dog ("ed", date, 12);
        Date newDate = new Date(1991, 01,30);

        dog.setBirthDate(newDate);

        Assert.assertEquals(newDate, dog.getBirthDate());
    }

    @Test
    public void eatTest(){

        Dog dog = new Dog("Will", new Date(), 13);
        Food food = new Food();

        dog.eat(food);

        Assert.assertEquals(new Integer(1), dog.getNumberOfMealsEaten());

        dog.eat(food);
        dog.eat(food);
        dog.eat(food);
        dog.eat(food);
        dog.eat(food);

        Assert.assertEquals(new Integer(6), dog.getNumberOfMealsEaten());
    }

    @Test
    public void getIdTest(){

        Integer id = 15;
        Dog newDog = new Dog("Bucky", new Date(), 15);

        Integer getIdResult = newDog.getId();

        Assert.assertEquals(id, getIdResult);

    }

    @Test
    public void animalInheritanceTest(){
        Dog dog = new Dog("Kish", new Date(), 16);

        boolean AnimalFinalResult = dog instanceof Animal;

        Assert.assertEquals(true, AnimalFinalResult);
    }

    @Test
    public void mammalInheritanceTest(){
        Dog dog = new Dog("AJ", new Date(), 17);
        boolean MammalResult = dog instanceof Mammal;

        Assert.assertEquals(true, MammalResult);
    }
}
