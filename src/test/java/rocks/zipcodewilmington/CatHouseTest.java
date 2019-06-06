package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

import static rocks.zipcodewilmington.animals.animal_storage.CatHouse.getNumberOfCats;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {

    private Cat testcat = new Cat(null , null,null );


    @Test
    public void addCatTest(){
        Cat cat = new Cat ("Katrina", new Date(), 21 );

        CatHouse.add(cat);

        Assert.assertEquals(cat, CatHouse.getCatById(21));
    }


    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeCatTest(){
        Cat cat = new Cat ("Molly", new Date(), 10 );
        CatHouse.add(cat);

        CatHouse.remove(cat);

        Assert.assertEquals(null, CatHouse.getCatById(10));
}
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCat(){
        Cat cat = new Cat("Roshni", new Date(), 3);
        CatHouse.add(cat);

        CatHouse.remove(cat);

        Assert.assertEquals(null, CatHouse.getCatById(3));



    }
    // TODO - Create tests for `Cat getCatById(Integer id)`m
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void RemoveCatWithId() {
        //Given
        Cat cat = new Cat("Rutu", new Date(), 19);
        CatHouse.add(cat);

        //When
        CatHouse.remove(19);

        //Then
        Assert.assertEquals(null, CatHouse.getCatById(19));


    }
    @Test
    public void GetNumberOfCats() {
        Cat cat = new Cat("Peeps", new Date(), 99);
        CatHouse.clear();

        Integer CatsNumber = getNumberOfCats();

        Assert.assertEquals(new Integer(0), getNumberOfCats());
    }


}