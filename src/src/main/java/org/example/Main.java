package org.example;

import org.shreya.Student;
import org.shreya.practisePrograms.PractisePrograms;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  static void main() {
    Student s1 = new Student("Shreya", 22, "abc@gmail.com");
    PractisePrograms practisePrograms = new PractisePrograms();

    /*System.out.println(s1.name);
    System.out.println(s1.age);
    */
    practisePrograms.rightAngleTriangle(5);

  }
}
