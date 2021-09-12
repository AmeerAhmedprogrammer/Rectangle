//Ameer Ahmed 

class Rectangle {

    double width = 1.0;
    double length = 1.0;
    double width1;
    double length1;

    Rectangle() { 
        
    }

    Rectangle(double width1, double length1) { 
        this.width1 = width1;
        this.length1 = length1;

    }

    double getArea() { 

        double area = length * width;
        return area;
    }

    double getPerimeter() { 

        double addition = length1 + width1; 
        double perimeter = addition * 2;
        return perimeter;
    }

    public static void main(String [] args) { 

        Rectangle rectangle1 = new Rectangle();

        Rectangle rectangle2 = new Rectangle(40.0,4.0);

        System.out.println("The 1st rectangle's area is: " 
            + rectangle1.getArea());

        System.out.println("The 2nd rectangle's perimeter is: " 
            + rectangle2.getPerimeter());
    }
}