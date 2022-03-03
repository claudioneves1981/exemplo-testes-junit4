package com.teste;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {

    private String name;
    private String givenName;

    public Person(String name, String givenName){

        this.name = name;
        this.givenName = givenName;

    }

}
