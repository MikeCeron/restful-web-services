package com.in28minutes.rest.webservices.restfulwebservices.versioning;

public class PersonaV2 {

    private Name name;

    public PersonaV2() {}

    public PersonaV2(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
