package main.java.empoloeeLab;

import main.java.empoloeeLab.exception.ValidationException;
import main.java.empoloeeLab.model.Employee;
import main.java.empoloeeLab.model.SalaryManager;

/**
 * All rights reserved
 * <p>
 * Created by Anna_Slizun on 2/19/2018.
 */
public class App {

    public static void main(String[] args){
        Employee employee = new Employee("John", "Doe");
        try {
            employee.setSalary(new SalaryManager() {
                @Override
                public long changeSalary(long oldSalary, boolean isRaise) {
                    return oldSalary * 2;
                }
            });


            employee.setSalary((oldSalary, isRaise) -> {
                if (oldSalary == 0) {
                    return 200;
                }
                if (isRaise) {
                    return oldSalary * 6;
                }
                return oldSalary / 2;
            });
        } catch (ValidationException e) {
            e.printStackTrace();
        }

    }
}
