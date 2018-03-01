package main.java.empoloeeLab.exception;

/**
 * All rights reserved
 * <p>
 * Created by Anna_Slizun on 2/26/2018.
 */
public class ValidationException extends Exception {

    public ValidationException(){
        super("Salary is not acceptable");
    }

    public ValidationException(String detailedMessage){
        super(detailedMessage);
    }
}
