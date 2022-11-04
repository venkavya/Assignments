package com.company;
import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.lang.String;
import java.util.*;

class Treeset {

    int id;
    String name;
    String department;
    int Salary;

    Treeset(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.Salary = salary;
    }

    @Override
    public String toString() {
        return "Treeset { " +
                "id:" + id +
                "name:" + name +
                "department:" + department +
                "Salary:" + Salary +
                '}';
    }
    class Sortbyid  implements Comparator<Treeset> {
        public int Compare(Treeset num1,Treeset num2 ) {
            return num1.id -num2.id;
        }

        class Sortbysalary implements Comparator<Treeset> {
            public int Compare(Treeset num1,Treeset num2 ) {
                return num1.Salary -num2.Salary;
            }
        class sortbyname implements Comparator {
                public int compare(Object str1, Object str2) {
                    String i1 = str1.toString();
                    String i2 = str2.toString();
                    return i2.compareTo(i1);
                }
        }

            class sortbydepartment implements Comparator {
                public int compare(Object str1, Object str2) {
                    String i1 = str1.toString();
                    String i2 = str2.toString();
                    return i2.compareTo(i2);
                }
            }
        public class Treesetexample {
                public void main (String[] args)
                {
                Scanner s= new Scanner(System.in);
                Treeset t1= new Treeset(id: 1 , name: "john", department: "chemistry", Salary: 10000);
                Treeset t2= new Treeset(id: 2 , name: "jeeny", department: "physics", Salary: 20000);
                Treeset t3= new Treeset(id: 3 , name: "priya", department: "social", Salary: 25000);
                Treeset t4= new Treeset(id: 4 , name: "arjun", department: "maths", Salary: 30000);
                Treeset t5= new Treeset(id: 5 , name: "ravi", department: "commerce", Salary: 80000);
                Treeset t6= new Treeset(id: 6 , name: "madhuri", department: "statistics", Salary: 55000);}
                Treeset t7= new Treeset(id: 7 , name: "yash", department: "science", Salary: 90000);
            Treeset t8= new Treeset(id: 8 , name: "arjun", department: "telugu", Salary: 35000);
            Treeset t9= new Treeset(id: 9 , name: "charan", department: "hindi", Salary: 40000);
            Treeset t10= new Treeset(id: 10 , name: "rama", department: "english", Salary: 66000);
            System.out.println ("choose 1 for name/n choose 2 for department/n choose 3 for salary/n choose 4 for id");
            int choose = s .nextint();
            switch (choose)
            {
                case 1:
                    Treeset<Treeset> s1 =new Treeset<> (new Sortbyid());
                    s1.add(t1);
                    s1.add(t2);
                    s1.add(t3);
                    s1.add(t4);
                    s1.add(t5);
                    s1.add(t6);
                    s1.add(t7);
                    s1.add(t8);
                    s1.add(t9);
                    s1.add(t10);
            System.out.println(s1);
            break;
            case 2;
                Treeset<Treeset> s2 =new Treeset<> (new Sortbyid());
                s2.add(t1);
                s2.add(t2);
                s2.add(t3);
                s2.add(t4);
                s2.add(t5);
                s2.add(t6);
                s2.add(t7);
                s2.add(t8);
                s2.add(t9);
                s2.add(t10);
                System.out.println(s2);
                break;
            case 3;
                Treeset<Treeset> s3 =new Treeset<> (new Sortbyid());
                s3.add(t1);
                s3.add(t2);
                s3.add(t3);
                s3.add(t4);
                s3.add(t5);
                s3.add(t6);
                s3.add(t7);
                s3.add(t8);
                s3.add(t9);
                s3.add(t10);
                System.out.println(s3);
                break;
                case 4;
                    Treeset<Treeset> s4 =new Treeset<> (new Sortbyid());
                    s4.add(t1);
                    s4.add(t2);
                    s4.add(t3);
                    s4.add(t4);
                    s4.add(t5);
                    s4.add(t6);
                    s4.add(t7);
                    s4.add(t8);
                    s4.add(t9);
                    s4.add(t10);
                    Systemstem.out.println(s1);
                    break;
            }
            }

        }
    }

    {

    }
}
