package com.solid.training.OpenClosed;

public class Manager extends Employee implements IEmployee{


    public Manager(Long id, String name, Double salary) {
        super(id, name, salary);
    }

    @Override
    public Double calculateOvertime(Double hours) {
        return ((getSalary()/30/8)*hours)*2;
    }
}
