import OOPS.*;
public class Classroom{
    public static void main(String[] args) {
        student s2 = new student("Jaydip",95);
        s2.rno=20101051;
        student s1 = new student();
        s1.setName("Hari");
        s1.rno = 99;
        s1.marks = 75;
        s1.getName();
        System.out.println("My name is "+s1.name+" and i scored "+s1.marks+" Marks.");
    }
}