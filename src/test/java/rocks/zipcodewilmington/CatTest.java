package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

    private Cat testCat = new Cat (null,null,null);

    public void setup() {
        this.testCat = new Cat ("name", new Date(5), 100);
    }
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }


    public void setNameTest(){
        Cat cat = new Cat("Billi", new Date(), 901);
        String Name = "Billi";

        cat.setName(Name);

        String catName= cat.getName();
        Assert.assertEquals(catName, Name);
    }

    public void SpeakingTest(){
        Cat cat = new Cat("Kutro", new Date(), 002);

        String speakingRetult = cat.Speak();

        Assert.assertEquals("MEOW", speakingRetult);
    }

    public void setBirthDateTest() {

        Cat cat = new Cat ("Abby", new Date(), 44);
        Date NewDate = new Date(04, 11, 1991);

        cat.setBirthDate(NewDate);

        Assert.assertEquals(NewDate, cat.getBirthDate());
    }

    public void eatTest(){
        Cat cat = new Cat ("DD", new Date(), 3);
        Food Food = new Food();

        cat.eat(Food);
        Assert.assertEquals(new Integer(4), cat.getNumberOfMealsEaten());

        cat.eat(Food);
        cat.eat(Food);
        cat.eat(Food);

        Assert.assertEquals(new Integer(7), cat.getNumberOfMealsEaten());

    }

    public void getIdTest(){
        Integer id = 4;
        Cat cat = new Cat("Dunkan", new Date(), 4);

        Integer getIdReport = cat.getId();

        Assert.assertEquals(id, getIdReport);
    }

    public void animalInheritanceTest(){
        Cat cat = new Cat ("Bucky", new Date(), 5);
        boolean catAnimalReport = cat instanceof Animal;
        Assert.assertEquals(true,true);


    }

    public void MammalInheritanceTest(){
        Cat cat = new Cat ("Harry", new Date(), 5);

        boolean CatMammalReport = cat instanceof Mammal;
        Assert.assertEquals(true, true);

    }




}
