package com.company;
import java.lang.String;
import java.util.*;
class Contact
{
    String name;
    String email;
    char gender;
    Contact(String name,String email,char gender)
    {
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    @Override
    public String toString(){
        return "Contact{"+
                "name='"+name+'\''+
                ",email='"+email+'\''+
                ",gender="+ gender +
                '}';
    }
}
class number
{
    long phno;
    number(long phno){this.phno=phno;}
    @Override
    public String toString() {
        return "number{" +
                "phno=" + phno +
                '}';
    }
}
class Sortbyphno implements Comparator
{
    public int compare(Object str1,Object str2)
    {
        String i1=str1.toString();
        String i2=str2.toString();
        return i2.compareTo(i1);
    }
}
public class TreeMap {
    public static void main(String[]args) {
        long phno;
        number n1 = new number(phno:6875409329);
        number n2 = new number(phno:6875408904);
        number n3 = new number(phno:6875409354);
        Contact c1 = new Contact(name:"aasri", email:"aasrigmail.com", gender:'female');
        Contact c2 = new Contact(name:"siva", email:"sivagmail.com", gender:'male');
        Contact c3 = new Contact(name:"kavya", email:"kavyagmail.com", gender:'female');
        TreeMap<number,Contact> t1 = new TreeMap<~>(new Sortbyphno());
        t1.put(n1, c1);
        t1.put(n2, c2);
        t1.put(n3, c3);
        System.out.println(t1);
        Set s1 = t1.keySet();
        System.out.println(s1);
        Collection s2 = t1.values();
        System.out.println(s2);
        Set s3 = t1.entrySet();
        System.out.println(s3);
    }
}




