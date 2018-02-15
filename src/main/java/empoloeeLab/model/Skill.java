package main.java.empoloeeLab.model;

/**
 * All rights reserved
 * <p>
 * Created by Anna_Slizun on 2/14/2018.
 */
public enum Skill {

    JAVA("Can develop new things using Java"),
    TEST("Can test an awful thing"),
    ENGLISH("Can speak"),
    TEAM_PLAYER("Can work with somebody");

    String description;

    Skill(String description) {
        this.description = description;
    }
}
