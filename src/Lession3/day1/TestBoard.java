package Lession3.day1;

import java.util.Arrays;

public class TestBoard {
    public static void main(String[] args) {
        // ClassName Object name = new constructor(); default
        // one object can create one constructor
        Board ob1 = new Board();
        System.out.println(ob1);
        // creating parameterized Board object
        Board ob2 = new Board(4.5,5.6,"Red");
        System.out.println(ob2);
        // invoke the behavior
        // objectName.methodName
        double area, perimeter;
        area= ob1.area();;
        perimeter = ob1.perimeter();
        System.out.println("Area : "+area+" Perimeter "+perimeter);
        System.out.printf("\nArea : %.2f \nPerimeter : %.2f\n",area,perimeter);
        area= ob2.area();;
        perimeter = ob2.perimeter();
        System.out.println("Area : "+area+" Perimeter "+perimeter);

        // getting value
        double height, with;
        String color;

        // for object ob1
        height= ob1.getHeight();
        with = ob1.getWidth();
        color = ob1.getColor();
        System.out.printf("\nHeight : %.2f",height);
        System.out.printf("\nHeight : %.2f",with);
        System.out.printf("\nHeight : %s\n",color);

        // setters
        ob1.setColor("Blue");
        System.out.println("Updated color : "+ob1.getColor());
        Board ob3 = new Board(7.5,9.7,"White");
        Board ob4 = new Board(70.5,77.7,"Black");
        Board[] boards = new Board[5];
        boards[0]= ob1;
        boards[1]= ob2;
        boards[2]= ob3;
        boards[3]= ob4;
        boards[4]= new Board();

        // declaration and Initialization
        Board[] coll1 = {ob1,ob2,ob3,ob4, new Board()};

        // prints the boards
        System.out.println("array of board objects");
        for(Board b:boards){
            if(b.getColor().equalsIgnoreCase("White")){
                System.out.println(b);
            }
        }
        System.out.println(Arrays.toString(greaterPerimeter(boards)));
        System.out.println(greaterPerimeter(boards).length);

    }
    public static double computeArea(Board[] b){

        double sum=0.0;
        double avg = 0.0;
        // validate the arguments
        if(b==null || b.length==0){
            return  0.0;
        }
        for (Board ob :b){
            sum+=ob.area();
        }
        avg = sum/b.length;
        return avg;
    }
    public static Board[] greaterPerimeter(Board[] b){
        if(b==null || b.length==0){
            return  null;
        }
        int count=0;
        for (Board ob :b) {
            if (ob.perimeter() > 75) {
                count++;
            }
        }
        Board[] nb = new Board[count];
        int i=0;
        for (Board ob :b) {
            if (ob.perimeter() > 75) {
                nb[i] = ob;
                i++;
            }
        }
        return  nb;
    }
}
