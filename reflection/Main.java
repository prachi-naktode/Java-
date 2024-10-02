package com.prachi.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person p = new Person(20, "Meena");
        Class c = p.getClass();

        System.out.println(c.getName());

//        System.out.println(Arrays.toString(c.getDeclaredFields()));
        System.out.println("Fields are : ");
        Field fields[] = c.getDeclaredFields();
        for(Field f : fields){
            //change the private field of object
            if(f.getName().equals("name")){
                f.setAccessible(true); // if we don't write this it will throw error
                try {
                    f.set(p,"Seema");
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(f.getName());
        }
        p.show();

//        System.out.println(Arrays.toString(c.getDeclaredMethods()));
        Method methods[] = c.getDeclaredMethods();
        System.out.println("Methods are : ");
        for(Method m: methods){
            System.out.println(m.getName());

            //execute a particular method
            System.out.println("Invoking Method show ");
            if(m.getName().equals("show")){
                try {
                    m.invoke(p);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
            if(m.getName().equals("thisIsStaticMethod")){
                try {
                    m.invoke(null);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        //getting name of parent class
        Class superClass = c.getSuperclass();
        System.out.println("Super class is: "+ superClass.getName());

        //getting constructore
        Constructor constructors[] = c.getDeclaredConstructors();
        System.out.println("Constructors are: ");
        for(Constructor cons: constructors){
            System.out.println(Arrays.toString(cons.getTypeParameters()));
        }
    }
}
