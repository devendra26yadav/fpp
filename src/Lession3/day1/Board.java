package Lession3.day1;

// class is template/Blueprint
// public access modifier - Throughout appliaction
// default (No keyword), private , protected
public class Board {
    // data members or properties or attributes or instance field
    // Always keep data as private
    private double height;
    private double width;
    private String color;

    //Default constructor - no parameters
    // Class name & Constructor name are same
    // no return type and return value
    public Board() {
        // default not given int =0 , float = 0.0
        height = 56.34;
        width = 66.68;
        color="White";
        // call of another constructor in only the first line allowed because we have to
        // assigns all properties first then other jobs
        // itself can not be called because it will go on recursive call and never ends execution
        // this(5,8,"Black");
    }
    public Board(double height,double width, String color){
        this.height=height;
        this.width = width;
        this.color = color;
    }
    // always Add behavior as public
    // Modifier return type method_name(arguments)
    public void write(){
        System.out.println(" Writing...");
    }
    public double area(){
        return height*width;
    }
    public double perimeter(){
        return 2*(height+width);
    }
    // getters and setters
    public double getHeight(){
        return this.height;
    }
    public  double getWidth(){
        return width;
    }
    public String getColor(){
        return color;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Board{" +
                "height=" + height +
                ", width=" + width +
                ", color='" + color + '\'' +
                '}';
    }
}
