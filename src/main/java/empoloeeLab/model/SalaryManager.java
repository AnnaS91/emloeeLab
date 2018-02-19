package main.java.empoloeeLab.model;

/**
 * All rights reserved
 * <p>
 * Created by Anna_Slizun on 2/19/2018.
 */
@FunctionalInterface
public interface SalaryManager {
    long changeSalary(long oldSalary, boolean isRaise);
}
