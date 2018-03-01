package test.java.empoeeLab;

import main.java.empoloeeLab.Service;
import main.java.empoloeeLab.exception.ValidationException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * All rights reserved
 * <p>
 * Created by Anna_Slizun on 2/28/2018.
 */
public class ServiceTest {

    Service service;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp(){
        service = new Service();
    }

    @Test(expected = ValidationException.class)
    public void shouldThrowValidationExceptionForNullName() throws ValidationException {
        service.register(null, "Abc", "a@c.com");
    }

    @Test
    public void shouldThrowValidationExceptionForEmptySurname() throws ValidationException {
        thrown.expect(ValidationException.class);
        thrown.expectMessage("Surname should be a not an empty string");

        service.register("Alex", "", "a@b.com");
    }

}
