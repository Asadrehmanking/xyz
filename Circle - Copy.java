import java.util.*;
public class Circle {

    double radius;

    Circle(double radius){
        this.radius=radius;
    }

    public double area(){
        double ans = Math.PI * radius *radius;
        return ans;
    }

    public double circumference(){
        double ans = 2 * (Math.PI * radius);
        return ans;
    }

    public void display(){
        System.out.println("The Area Of Circle Is : "+area());
        System.out.println("The Circumference of Circle Is : "+circumference());

    }

    public static void main(String[] args){
        Circle c = new Circle(5);

        c.display();
    }
}

