abstract class Shape5 {
    abstract public String draw();
}

class Rectangle5 extends Shape5 {
    @Override
    public String draw() {
    	return "Drawing Rectangle5";
    }
}

class Line5 extends Shape5{
    @Override
    public String draw() {
    	return "Drawing Line5";
    }
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {
    	return "Drawing Cube5";
    }
}

public class Assignment2Q5{
    public static void main(String[] args) {
    	Line5 l=new Line5();
    	System.out.println(l.draw());
    }
}