package com.company;

class Cat <string> {
    private string name;
    private int age;
    private double weight;
    private string type;
    static int counter = 0;


    public Cat(string name, int age, double weight, string type) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.type = type;
        counter++;
    }

    public String toString() {
        return "Name: " + name + ", age: " + age + ", weight: " + weight + ", type: " + type;
    }

    public String getName() {
        return (String) name;
    }
    public int getAge() {
        return age;
    }
    public double  getWeight() {
        return weight;
    }

    public String getType() {
        return (String) type;
    }

    public string CompareWeight(Cat cat)
    {
        if (this.weight < cat.weight)
            return (string) "<";
        else if (this.weight == cat.weight)
            return (string) "=";
        else return (string) ">";
    }
    public string CompareAge(Cat cat)
    {
        if (this.age < cat.age)
            return (string) "<";
        else if (this.age == cat.age)
            return (string) "=";
        else return (string) ">";
    }
    public static int getNumOfInstances() {
        return counter;
    }
}
