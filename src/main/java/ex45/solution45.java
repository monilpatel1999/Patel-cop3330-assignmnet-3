package ex45;

import java.io.IOException;
import java.util.Scanner;

public class solution45 {
    package oop.assignment.ex45;
import java.io.*;
import java.util.Scanner;
/*
->Read() object: r
->Write() object: w
->String oldtext, replacedtext, output_file_name
-> get text from file using Read() class method: r.get_old_text()
-> send "use" to r.get_replaced_text()
-> get replacedtext with the word 'use' instead of 'utilize'
-> prompt user for output file's name
-> create and write to output file using Write() class method: w.open_file()
 */

    public class Solution45
    {
        public static void main(String[] args) throws IOException
        {
            Read r = new Read();
            String oldtext = r.get_old_text();
            String replacedtext = r.get_replaced_text("use");


            Scanner input = new Scanner(System.in);
            System.out.print("Enter the name of the output file: ");
            String output_file_name = input.nextLine();

            Write w = new Write();
            w.open_file(output_file_name,replacedtext);

        }

        private static class Write {
        }
    }
}
