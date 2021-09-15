package com.example;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@interface Benefit { //1
    String value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Benefits { //2
    Benefit[] value(); //3
}

@Benefits({ //4
        @Benefit("Nutritious"), //5
        @Benefit("Healthy") //6
})
public class Banana { } //The old way to doing repeatable annotation