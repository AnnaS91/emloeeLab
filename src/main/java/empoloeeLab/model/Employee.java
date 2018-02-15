package main.java.empoloeeLab.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * All rights reserved
 * <p>
 * Created by Anna_Slizun on 2/14/2018.
 */
public class Employee extends Person {

    Map<Skill, Integer> skills;

    public Employee(String name, String surname) {
        super(name, surname);
        skills = new HashMap<>();
    }

    public Employee(String name, String surname, Date dateOfBirth) {
        super(name, surname, dateOfBirth);
        skills = new HashMap<>();
    }

    public Employee(String name, String surname, Date dateOfBirth, Map<Skill, Integer> skills) {
        super(name, surname, dateOfBirth);
        this.skills = skills;
    }
}
