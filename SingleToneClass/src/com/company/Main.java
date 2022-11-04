package com.company;

public class SingleToneClass {
    private static SingleToneClass SingleToneClass= new SingleToneClass();
    private SingleToneClass ()  {
    }
    public static SingleToneClass getInstance() {
        return SingleToneClass;
    }
    public static void demoMethod() {
        System.out.println("Demo method for SingleToneClass");
    }
}
