package com.prachi.records;

//class Person{
//    private int age;
//    private String name;
//    public Person(int age , String name){
//        this.age = age;
//        this.name = name;
//    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Person person)) return false;
//        return age == person.age && Objects.equals(name, person.name);
//    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(age, name);
//    }
//    @Override
//    public String toString() {
//        return "Person{" +
//                "age=" + age +
//                ", name='" + name + '\'' +
//                '}';
//    }
//}

// Instead we van create record
// toString(), equals(), hashCode() are already defined in it
// can not call default constructor have to define it
// all the variables are private and final by default
// can not extends any class because it extends record class
// can implements interface
// can not create instance variable inside it, it has to be declared in parenthesise
// can create static variable
//can create any type of methods
record Person (int age, String name){

    public Person(){
        //we need to call the parameterized constructor
        this(0,"");
    }

    //Compact canonical constructor
    public Person {
        if (age == 0) {
            throw new IllegalArgumentException();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(12, "Soham");
        Person p2 = new Person(12, "Soham");
//        Person p3 = new Person();

        // dont have getName() but has obj.name()
        System.out.println(p1.age());
//        System.out.println(p1.equals(p2));
//        System.out.println(p3);
    }
}
