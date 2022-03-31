package homework_week_7;

/**
 * write a class with the name Person.Class needs three fields(Instance variables) with the firstname,
 * last name,type String and age int.
 * Write the followint methods with instance method.
 * Mehod named getName without any parameters,it needs to return the value of the  firsrname field.
 * Method maned getLastNme without any parameters,it needs to return type the value of the lastname field
 * Method named getAge without any parameter,it needs to return type of the value age field.
 * Method named setLastname with one parameter,it needs to return type of the lastname field
 * Method name setAge with one parameter of type int,it needs to set the value of age field.If the
 * parameter is less than 0 or grater than 100,It needs to set the Agefield value to 0.
 * Method name isTeen without any parameter,it needs to return true if the age field is greater than 12
 * or less than 20,otherwise return false.
 * Mehtod named getFullName without any parameter,it needs to return the Full name of the person
 * In case both first name and last name are empty,String return an empty string.
 * In case fitst name is an empty,return firstname empty.
 * In case last name is an empty,return lastname empty.
 * To check if s String is empty,use the method isEmpty from the String class.For example<p>
 * firstName.isEmpty(),returns true if the String is empty or in other words,when String does not
 * contain any character.
 * TEST EXAMPLE:
 * <p>
 * Test code:(Write below code into main method and check the output)
 * Person person=new Person();
 * Person.setFirstName(&quot;&qupt;)// firstname is set to empty string
 * Person.setLastName(&quot;&quot;)// lastname is set to empty string
 * Person.setAge(10);
 * System.out.println(&quot,fullname= &quot; +Person.getFullName());
 * System.out.println(&quot,teen=&quot; +Person.isTeen());
 * Person.setFirstName(&quot;John;&quot;);//first name is set to John
 * Person.setAge(10);
 * System.out.println(&quot,fullname= &quot; +Person.getFullName());
 * System.out.println(&quot,teen=&quot; +Person.isTeen());
 * Person.setLastName(&quot;Smith&quot; +Perso,.isTeen());//Last name is set to Smith
 * System.out.println(&quot,fullname= &quot; +Person.getFullName());
 * <p>
 * OUTPUT:
 * fullname=
 * teen=false
 * fullname=John
 * teen=true
 * fullname=John Smith
 * NOTE:All mehtods should be defined public NOT public static
 * In total you have to write total 8 methods.
 */
public class Program_14_Person {
    //Instance variables
    String firstName, lastName;
    int age;

    public static void main(String[] args) {
        Program_14_Person person = new Program_14_Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");//first name is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");//last name is set to smith
        System.out.println("fullName= " + person.getFullName());
    }

    //Get firstname method
    public String getFirstName() {
        return firstName;
    }

    //Get lastname method
    public String getLastName() {
        return lastName;
    }

    //get age method
    public int getAge() {
        return age;
    }

    //set Firstname method
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //set Lastname method
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //set age method
    public void setAge(int age) {
        if (age > 0 && age <= 100) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    //check is it Teen or not method
    public boolean isTeen() {
        if (getAge() > 12 && getAge() < 20) {
            return true;
        } else {
            return false;
        }
    }

    //Get fullname mehtod
    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return " ";

        } else if (firstName.isEmpty()) {
            return getLastName();
        } else if (lastName.isEmpty()) {
            return getFirstName();
        } else {
            return getFirstName() + " " + getLastName();
        }
    }
}
