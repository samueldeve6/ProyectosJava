package areas;
abstract class Shape {
    int width;
    abstract void area();
}

public class Square extends Shape {
    Square(int width){
        this.width = width;
    }
    @Override
    public void area(){
        int area;
        area = width*width;
        System.out.println(area);
    }
}

