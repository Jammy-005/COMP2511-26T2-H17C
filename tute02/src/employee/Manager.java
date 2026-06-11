package employee;

import java.time.LocalDate;

/*
Create a Manager subclass of Employee, that includes hire date.
What constructors are appropriate?
Is it appropriate to have a getter for the hire date? What about a setter?
Why might adding certain getters and setters be bad design?
*/
public class Manager extends Employee {
    private LocalDate hireDate;

    /**
     * Constructor for Manager 
     * 
     * @param name The full name of the manager.
     * @param salary The manager's yearly salary in dollars.
     * @param hireDate The manager's date of hire.
     */
    public Manager(String name, int salary, LocalDate hireDate) {
        super(name, salary);
        this.hireDate = hireDate;
    }

    /**
     * Constructor for Manager that assumes the date of entry is the hire date
     * 
     * @param name The full name of the manager.
     * @param salary The manager's yearly salary in dollars.
     */
    public Manager(String name, int salary) {
        this(name, salary, LocalDate.now());
    }

    /**
     * Returns manager's date of hire
     * 
     * @return The manager's date of hire.
     */
    private LocalDate getHireDate() {
        return hireDate;
    }

    // Because hiring dates do not change unless you get fired and rehired, we won't add a setter for hireDate
    @Override
    public String toString() {
        return super.toString() + "[hireDate=" + hireDate + "]";
    }

    // How can the method in Manager utilise code in Employee to avoid repetition?
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        } else if (!super.equals(object)) {
            return false;
        }

        Manager other = (Manager) object;
        return hireDate.equals(other.getHireDate());
    }
}
