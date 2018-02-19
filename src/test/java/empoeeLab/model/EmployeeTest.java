package test.java.empoeeLab.model;

import main.java.empoloeeLab.model.Employee;
import main.java.empoloeeLab.model.Skill;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * All rights reserved
 * <p>
 * Created by Anna_Slizun on 2/16/2018.
 */
public class EmployeeTest {

    private Employee employee;
    private Employee cleverEmployee;
    private Map<Skill, Integer> skills;

    @Before
    public void setUp() {
        employee = new Employee("John", "Doe");

        Date dateOfBirth = new Date();
        skills = new HashMap<>();
        skills.put(Skill.JAVA, 3);
        skills.put(Skill.TEAM_PLAYER, 2);
        cleverEmployee = new Employee("Sara", "Doe", dateOfBirth, skills);
    }

    @Test
    public void hasSkillShouldReturnMinusOneForMissingSkill() {
        assertEquals(-1, employee.hasSkill("Cooking"));
    }

    @Test
    public void hasSkillShouldReturnMinusOneForNullSkill() {
        assertEquals("hasSkill should return -1 for null", -1, employee.hasSkill(null));
    }

    @Test
    public void hasSkillShouldReturnSkillValue() {
        assertEquals(3, cleverEmployee.hasSkill("JAVA"));
        assertEquals(2, cleverEmployee.hasSkill("TEAM_PLAYER"));
    }

    @Test
    public void hasSkillShouldReturnSkillValueIgnorCase() {
        assertEquals(3, cleverEmployee.hasSkill("java"));
        assertEquals(2, cleverEmployee.hasSkill("Team_Player"));
    }

    @Test
    public void addNewSkillShouldUpdateSkillsMapAndReturnTrue(){
        assertTrue(cleverEmployee.addNewSkill(Skill.ENGLISH, 5));

    }

}
