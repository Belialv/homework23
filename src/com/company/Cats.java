package com.company;

public class Cats {

        public static void main(String[] args) {
            Cat dog1 = new Cat("Markus",7,30, "Bengal");
            Cat dog2 = new Cat("Ferdinand",5,32,"Persian");
            System.out.println(dog1.CompareAge(dog2));
            System.out.println(dog1.CompareWeight(dog2));
        }
    }

