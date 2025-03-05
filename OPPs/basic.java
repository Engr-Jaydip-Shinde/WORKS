public class basic {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("RED");
        p1.setTip(3);
        System.out.println(p1.penTip);
        System.out.println(p1.color);
        p1.color="BLUE";
        p1.setColor("BLACK");//setters --> to set values
        p1.setTip(10);
        System.out.println(p1.getColor()); //getter --> to get value
        System.out.println(p1.getTip());

    }
}

class Pen{
    int penTip;
    String color;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        penTip = newTip;
    }
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.penTip;
    }
}
