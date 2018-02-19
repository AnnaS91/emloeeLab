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

    public int hasSkill(String skillName) {
        if (skillName == null) {
            return -1;
        }
        Skill skill = Skill.checkedValue(skillName);
        return skill == null || skills.get(skill) == null? -1 : skills.get(skill);
    }

    /**
     * @param skill - {@code Skill} new skill
     * @param level
     * @return boolean true if skill was added
     */
    public boolean addNewSkill(Skill skill, int level) {
        int value = hasSkill(skill.name());
        if (value != -1) {
            System.out.println(String.format("This skill already exists with %d value", value));
            return false;
        }
        skills.put(skill, level);
        return true;
    }
}
