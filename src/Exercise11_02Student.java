public class Exercise11_02Student {
    public static void main(String[] args) {
        // Each line: DECLARED type on the left, ACTUAL type after "new"
        Person person = new Person("Ava", "1 Elm St", "317-555-5050", "ava@mail.com");
        Person student = new Student("Ben", "2 Oak St", "317-555-1012", "ben@mail.com", Student.SOPHOMORE); //Using a constant through the class name
        Person employee = new Employee("Cal", "3 Pine St", "317-555-1013", "cal@mail.com", "B-101", 50000, new MyDate(2020, 3, 15));
        Person faculty  = new Faculty("Dee", "4 Ash St", "317-555-1014", "dee@mail.com", "C-202", 72000, new MyDate(2018, 8, 20), "MWF 10-12", "Professor");
        Person staff = new Staff("Eli", "5 Birch St", "317-555-1015", "eli@mail.com", "A-005", 41000, new MyDate(2022, 1, 10), "Advisor");


        //println calls each object's toString() automatically.
        // DYMANIC BINDING from the book: the ACTUAL type decides which toString() runs.
        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);


    }
}

// ===== SUPERCLASS the most general type =====
class Person {
    // Protected fields: visible to subclasses (family access)
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String email;

    //Constructor: same name as the class, no return type
    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {return name;}     // GETTER

    @Override
    public String toString() {
        return "Person: " + name;
    }
}

// Subclass of Person: "a Student IS a Person"
class Student extends Person {
    public static final String FRESHMAN = "freshman";
    public static final String SOPHOMORE = "sophomore";
    public static final String JUNIOR = "junior";
    public static final String SENIOR = "senior";

    private String status; //instance variable

    public Student(String name, String address, String phoneNumber, String email, String status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    @Override
    public String toString(){
        return "Student: " + name;     // name is inherited (Protected)
    }
}
// ====== SUBCLASS of Person, and SUPERCLASS of Faculty and Staff ======
class Employee extends Person {
    protected String office;
    protected double salary;
    protected MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee: " + name;
    }
}

// === SUBCLASS of Employee: a Faculty is an employee and also is a Person ===
class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty: " + name;
    }
}

// ===== SUBCLASS OF EMPLOYEE =====
class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String email, String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff: " + name;
    }
}

// Helper class
class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }
}

















