import java.util.*;
import java.lang.Math;

public class Triangle {
    int intBase, intHeight, intHypotenuse;
    double doubleBase, doubleHeight, doubleHypotenuse;

    public Triangle(String base, String height){
        this.intBase = Integer.parseInt(base);/*convert base to int*/
        this.intHeight = Integer.parseInt(height);/*convert height to int*/
        setIntHypotenuse();

        this.doubleBase = Double.parseDouble(base);/*convert base to double*/
        this.doubleHeight = Double.parseDouble(height);/*convert height to double*/
        setDoubleHypotenuse();
    }

    public double getDoubleHypotenuse(){
        return this.doubleHypotenuse;
    }

    private void setDoubleHypotenuse(){
        // use the math library to find the hypotenuse of a right triangle 
        // using the pythagorean formula
        this.doubleHypotenuse = Math.sqrt(Math.pow(this.doubleBase, 2) + Math.pow(this.doubleHeight, 2));
    }

    public int getIntHypotenuse(){
        return this.intHypotenuse;
    }

    private void setIntHypotenuse(){
        // use the math library to find the hypotenuse of a right triangle 
        // using the pythagorean formula

        this.intHypotenuse = (int) Math.sqrt(Math.pow(this.intBase, 2.0) + Math.pow(this.intHeight, 2.0));
    }
    public void areaTriangleInt(){
        // get the hypotenuse
        // calculate area

        int area = (this.intBase * this.intHeight)/2;

        System.out.println("Int Area of Triangle: " + area);
        System.out.println("Int Hypotenuse of Triangle: " + this.intHypotenuse);
    }
    public void areaTriangleDouble(){
        // get the hypotenuse
        // calculate area

        double area = (this.doubleBase * this.doubleHeight)/2;
        
        System.out.println("Double Area of Triangle: " + area);
        System.out.println("Double Hypotenuse of Triangle: " + this.doubleHypotenuse);
    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input the base: ");
        // use the scanner to get a string base
        String base = input.nextLine();
        
        System.out.println("Input the height: ");
        // use the scanner to get a string height
        String height = input.nextLine();
        
        Triangle tri = new Triangle(base, height);
        tri.areaTriangleDouble();
        tri.areaTriangleInt();
    }
}

