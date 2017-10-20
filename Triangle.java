import java.util.*;
import java.lang.Math;

public class Triangle {
    int intB, intA, intH;
    double doubleB, doubleA, doubleH;

    public Triangle(String a, String b){
        this.intB = /*convert b to int*/;
        this.intA = /*convert a to int*/;
        this.doubleB = /*convert b to double*/;
        this.doubleA = /*convert a to double*/;
    }
    public double stringToDouble(String str){
        // parse string to double
    }
    public int stringToInt(String str){
        // parse string to int
    }
    public double pythagoreanDouble(){
        // use the math library to find the height of a right triangle 
	// using the pythagorean formula
    }
    public int pythagoreanInt(){
        // use the math library to find the height of a right triangle 
	// using the pythagorean formula
    }
    public void areaTriangleInt(){
        // get the height
        // calculate area

        System.out.println("Int Area of Triangle: " + area);
        System.out.println("Int Height of Triangle: " + this.intH);
    }
    public void areaTriangleDouble(){
        // get the height
        // calculate area

        System.out.println("Double Area of Triangle: " + area);
        System.out.println("Double Height of Triangle: " + this.doubleH);
    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Input the length: ");
        // use the scanner to get a string a

        System.out.println("Input the base: ");
        // use the scanner to get a string b

        Triangle tri = new Triangle(a,b);
        tri.areaTriangleDouble();
        tri.areaTriangleInt();
    }
}

