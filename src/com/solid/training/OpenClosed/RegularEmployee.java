package com.solid.training.OpenClosed;

public class RegularEmployee extends Employee implements IEmployee{


    public RegularEmployee(Long id, String name, Double salary) {
        super(id, name, salary);
    }

    @Override
    public Double calculateOvertime(Double hours) {
        return (getSalary()/30/8)*hours;
    }
}
