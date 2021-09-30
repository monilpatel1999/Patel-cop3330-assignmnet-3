package ex34;
/* Exercise 34
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Monil_Patel
 */

public class App {
    import java.util.ArrayList;
import java.util.Scanner;

    public class ArithemticClac {

        boolean removeName(ArrayList names,String del)
        {

            return names.remove(del);

        }

        public static void main(String []args)
        {

            ArithemticClac obj=new ArithemticClac();

            ArrayList<String> names=new ArrayList();
            names.add("John Smith");
            names.add("Jackie Jackson");
            names.add("Chris Jones");
            names.add("Amanda Cullen");
            names.add("Jeremy Goodwin");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the name to delete");
            String del=sc.nextLine();
            obj.removeName(names,del);
            System.out.println(names);
        }
    }

    public class TestArithemticCalc {

        void TestAddMethod()
        {
            ArrayList<String> names=new ArrayList();
            names.add("John Smith");
            names.add("Jackie Jackson");
            names.add("Chris Jones");
            names.add("Amanda Cullen");
            names.add("Jeremy Goodwin");
            ArithemticClac obj=new ArithemticClac();
            boolean b=obj.removeName(names,"Chris Jones");

            Assertions.assertEquals(true,b);
        }

    }
}
