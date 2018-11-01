package ru.adanil.employee_department;

import java.util.List;

public class Department {
    private List<Employee> employees;
    private String code;
    private String name;

    public Department(String name,String code, List<Employee> employees) {
        this.employees = employees;
        this.code = code;
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
