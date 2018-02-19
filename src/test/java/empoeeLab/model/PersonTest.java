package java.empoeeLab.model;

import main.java.empoloeeLab.model.Person;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * All rights reserved
 * <p>
 * Created by Anna_Slizun on 2/14/2018.
 */
public class PersonTest {

    @Test
    public void toStringShouldReturnNameAndSurname(){
        Person person = new Person("John", "Doe");
        assertEquals("John Doe", person.toString());
    }

}
