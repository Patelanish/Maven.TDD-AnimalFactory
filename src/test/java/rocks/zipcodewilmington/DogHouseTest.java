package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

import static com.sun.tools.internal.xjc.reader.Ring.add;
import static rocks.zipcodewilmington.animals.animal_storage.CatHouse.clear;
import static rocks.zipcodewilmington.animals.animal_storage.DogHouse.*;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    public void addDogTest () {

        Dog dog = new Dog("Alex", new Date(), 6);

        DogHouse.add(dog);

        Assert.assertEquals(dog, getDogById(6));
    }

    public void RemoveADog() {
        Dog dog = new Dog ("Baku", new Date(), 7);

        add(dog);

        remove(dog);

        Assert.assertEquals(null, DogHouse.getDogById(7));
    }

    public void RemoveDogWithID(){
        Dog dog = new Dog ("criss", new Date(), 8);

        add(dog);

        DogHouse.remove(8);

        Assert.assertEquals(null, getDogById(8));
    }
    public void GetNumberOfDogsTest() {
        Dog dog = new Dog("Shree", new Date(), 9);
        clear();

        Integer numberOfDogs = getNumberOfDogs();

        Assert.assertEquals(new Integer(0), getNumberOfDogs());
    }
}
