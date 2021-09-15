package com.example;

import java.lang.annotation.Annotation;

public class Entry {
    public static void main(String[] args){
        Annotation[] catAnnotations = Cat.class.getAnnotations(); //1 getting cat annotations via reflection
        for (Annotation annotation : catAnnotations) {
            System.out.println(annotation);
        }

        Annotation[] bananaAnnotations = Banana.class.getAnnotations(); //2 getting banana annotations via reflection
        for (Annotation annotation : bananaAnnotations){
            System.out.println(annotation);
        }

        Annotation[] bikeAnnotations = Bike.class.getAnnotations(); //3 getting bike annotations via reflection
        for (Annotation annotation : bikeAnnotations){
            System.out.println(annotation);
        }
    }
}
