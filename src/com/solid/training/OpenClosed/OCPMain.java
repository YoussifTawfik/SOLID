package com.solid.training.OpenClosed;

public class OCPMain {

    /*
    * Open/Closed Principle (OCP)
    * Software entities (Modules, Classes, Functions,etc)
    * should be open for extension, but closed for modification
    * */

    // Singleton instance
    private static final EmployeeFactory employeeFactory=EmployeeFactory.INSTANCE;

    public static void main(String[] args) {
        IEmployee regular=new RegularEmployee(1L,"Youssif",3000.0);

        IEmployee manager=new Manager(2L,"John",3000.0);

        System.out.format("Regular Employee Bonus: %s\n",employeeFactory.getBonus(regular,12.0));
        System.out.format("Manager Bonus: %s\n",employeeFactory.getBonus(manager,12.0));

        /*
        * you can a new type of employee as you need without needing to modify any class
        * just create new class, inherit from Employee, implement IEmployee, then override your method
        * to calculate over time
        * */

        // for example:
        // IEmployee partTimeEmployee=new PartTimeEmployee(.........);
        // IEmployee internship=new Internship(...........);
    }
}
