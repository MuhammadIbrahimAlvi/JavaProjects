package Week3Spring;

public class DependencyInjection {
    public static void main(String[] args)
    {
        Drawing drawing = new Drawing();
        Triangle triangle =  new Triangle();

        drawing.setShape(triangle);
        drawing.drawShape();
    }
}

class Shape{
    void draw(){
        System.out.println("Draw Method Called");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("OverWritten by Circle Class method.");
    }
}


class Triangle extends Shape{
    void draw(){
        System.out.println("OverWritten by Triangle Class method.");
    }
}

