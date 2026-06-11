package employee;

import java.time.LocalDate;

public class Employee {
    private String name;
    private int salary;

    /**
     * Creates an Employee with the given name and salary.
     * 
     * @param name   The full name of the employee.
     * @param salary The employee's yearly salary in dollars.
     */ 
    // ^ WE LIKE THIS
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        // hahaha random comments
        // ^ this is bad
    }

    /**
     * Returns the employee's name
     * 
     * @return The full name of the employee.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the employee's name
     * 
     * @param name The employee's new name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the employee's salary.
     * 
     * @return The employee's yearly salary in dollars.
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Set the employee's salary.
     * 
     * @param salary The employee's yearly salary in dollars.
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "[name=" + name + "][salary=" + salary + "]";
    }

    /*
    Override the equals() method inherited from Object in both classes.
    What key things should the equals() method do?
    How should the type of the input object be checked? How should it be compared to the type of the calling object?
    */
    @Override
    public boolean equals(Object object) {
        // (Employee) null <- error, we must confirm that the object is the same type before trying to cast
        if (this == object) {
            return true;
        } else if (object == null) {
            return false;
        } else if (getClass() != object.getClass()) {
            return false;
        }

        // WE HAVE CONFIRMED THAT OBJECT IS OF THE SAME TYPE
        Employee other = (Employee) object;

        return name.equals(other.getName()) && salary == other.getSalary(); 
    }

    public static void main(String[] args) {
        Employee manager1 = new Manager("tom", 1000);
        Employee manager2 = new Manager("tom", 1000);
        System.out.println(manager1.equals(manager2));
    }
}
