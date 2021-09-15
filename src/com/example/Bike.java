package com.example;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(BikeAttributes.class) //1
@interface BikeAttribute { //2
    String value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface BikeAttributes { //3
    BikeAttribute[] value(); //4
}

@BikeAttribute("Agile") //5
@BikeAttribute("Affordable") //6
public class Bike { } //Repeatable annotation
