package OOP;

import java.util.Scanner;

class Abiturient {
String surname;
String name;
int math;
int physics;
int lang;

double average() {
    return (math+physics+lang)/3.0;
}
void print() {
    System.out.println(surname+" "+name+" математика = "+math+" физика = "+physics+" язык = "+lang+" средний балл = "+String.format("%.1f", average()));
}
}
