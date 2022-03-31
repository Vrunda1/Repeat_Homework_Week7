package homework_week_7;

/**
 * Wall Area
 * Write a class name with Wall,The class needs to have two field(Instance variable)with name
 * <p>
 * width and height of type double
 * The class needs to have two constructors.The first constructor does not have any parameters(no arg)
 * The second constructor has parameter width and height of type of double and it needs to initilize the
 * fields.In case the width is less than 0 then the width field value is 0,in case of height parameter
 * is less than 0 than field height is set to 0.
 * write the following methods(Instance methods)
 * Method name getWidth without any parameters,it needs to return the value of width field.
 * Method name getHeight without any parameter,it returns the value of heighr field.
 * Method name setWidth with one  parameter of type double,it needs to set the value of width field.
 * If the parameter is less than 0 it needs to set the width value to 0
 * Method name setHeight with one  parameter of type double,it needs to set the value of height field.
 * If the parameter is less than 0 it needs to set the height value to 0
 * Method named getArea without any parameters,it needs to return the Area of the wall.
 * Test Example:
 * Test code:(write below code in main method and run and compare result with output)
 * Wall wall=new Wall(5,4);
 * System.out.println(&quot;area = &quot; +wall.getArea());
 * wall.setHeight(-1,5);
 * System.out.println(&quot;width = &quot; +wall.getWidth());
 * System.out.println(&quot;height = &quot; +wall.getHeight());
 * System.out.println(&quot;area = &quot; +wall.getArea());
 * OUTPUT:
 * area=20.0
 * width=5.0
 * height=0.0
 * area=0.0
 * NOTE: All methods should be defined as public not public static
 * <p>
 * In total, you have to write 5 methods and two constructors.
 */
public class Program_15_Wall {
    //Instance variable
    double width;
    double height;

    //default constructor
    public Program_15_Wall() {

    }

    //Parameterized constructor
    public Program_15_Wall(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;

        }
    }

    //Get width method
    public double getWidth() {
        return width;
    }

    //Get height method
    public double getHeight() {
        return height;
    }

    //Set width method
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    //Set height method
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    //Get Area method
    public double getArea() {
        return (getHeight() * getWidth());
    }

    //Main method
    public static void main(String[] args) {
        Program_15_Wall wall = new Program_15_Wall(5, 4);
        System.out.println("area=" + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width=" + wall.getWidth());
        System.out.println("height=" + wall.getHeight());
        System.out.println("area=" + wall.getArea());
    }
}
