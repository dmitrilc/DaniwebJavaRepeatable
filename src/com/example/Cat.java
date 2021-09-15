package com.example;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface CatAttribute { //1
    String value(); //2
}

@CatAttribute("Cute") //3
public class Cat { } //Single custom Annotation