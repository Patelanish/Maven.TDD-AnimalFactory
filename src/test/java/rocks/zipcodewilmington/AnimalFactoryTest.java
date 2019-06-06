package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {

    @Test
    public void createNewDogTest() {
        String name = "Dog 1";
        Date Birthdate = new Date (1994,04,11 );

        Dog dog1 = AnimalFactory.createDog(name, Birthdate);

        String getNameResult = dog1.getName();
        Date getAgeReselt = dog1.getBirthDate();

        Assert.assertEquals(name, getNameResult);
        Assert.assertEquals(Birthdate, getAgeReselt);


    }
    @Test
    public void createNewcatTest() {
        String name = "cat 1";
        Date Birthdate = new Date (2001, 04, 20);

        Cat cat1 = AnimalFactory.createCat(name , Birthdate);

        String getNameResult = cat1.getName();
        Date getAgeReselt = cat1.getBirthDate();

        Assert.assertEquals(name, getNameResult);
        Assert.assertEquals(Birthdate, getAgeReselt);
    }

    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
}
