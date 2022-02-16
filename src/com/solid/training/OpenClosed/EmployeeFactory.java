package com.solid.training.OpenClosed;

public enum EmployeeFactory {

    INSTANCE;

    public Double getBonus(IEmployee employee, Double hours){
        return employee.calculateOvertime(hours);
    }
}
