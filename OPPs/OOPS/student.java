package OOPS;
public class student {
    public int rno;
    public String name;
    public int marks;
    public student(String name,int marks){
        this.name = name;
        this.marks = marks;
        System.out.println("My name is "+name+" and i scored "+marks+" Marks.");
    }
    public student(){

    }
    public void setName(String name){
        this.name = name;
    }

    public void getName(){
        System.out.println(name);
    }
    public class animal{
        public animal(){
            System.out.println("Animal goteed");
        }
    }
}

