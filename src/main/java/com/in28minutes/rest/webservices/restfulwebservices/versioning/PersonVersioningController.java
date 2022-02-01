package com.in28minutes.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {

    @GetMapping("v1/person")
    public PersonaV1 personaV1() {
        return new PersonaV1("Miguel Ceron");
    }

    @GetMapping("v2/person")
    public PersonaV2 personaV2() {
        return new PersonaV2(new Name("Miguel", "Ceron"));
    }

    @GetMapping(value = "/person/param", params = "version = 1")
    public PersonaV1 paramV1() {
        return new PersonaV1("Miguel Ceron");
    }

    @GetMapping(value = "/person/param", params = "version = 2")
    public PersonaV2 paramV2() {
        return new PersonaV2(new Name("Miguel", "Ceron"));
    }

    @GetMapping(value = "/person/header", headers = "X-API-VERSION = 1")
    public PersonaV1 headerV1() {
        return new PersonaV1("Miguel Ceron");
    }

    @GetMapping(value = "/person/header", headers = "X-API-VERSION = 2")
    public PersonaV2 headerV2() {
        return new PersonaV2(new Name("Miguel", "Ceron"));
    }

    @GetMapping(value = "/person/produces", produces = "application/vnd.company.app-v1+json")
    public PersonaV1 producesV1() {
        return new PersonaV1("Miguel Ceron");
    }

    @GetMapping(value = "/person/produces", produces = "application/vnd.company.app-v2+json")
    public PersonaV2 producesV2() {
        return new PersonaV2(new Name("Miguel", "Ceron"));
    }


}