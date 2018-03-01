package main.java.empoloeeLab;

import main.java.empoloeeLab.exception.ValidationException;
import main.java.empoloeeLab.model.Employee;

/**
 * All rights reserved
 * <p>
 * Created by Anna_Slizun on 2/28/2018.
 */
public class Service {

    public Employee register(String name, String surname, String email) throws ValidationException {
        if (checkString(name)) {
            throw new ValidationException("Name should be a not an empty string");
        }
        if (checkString(surname)){
            throw new ValidationException("Surname should be a not an empty string");
        }
        return new Employee(name, surname);
    }

    private boolean checkString(String value){
        return value == null || "".equals(value.trim());
    }
}
