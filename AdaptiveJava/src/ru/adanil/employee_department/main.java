package ru.adanil.employee_department;

import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(
                new Employee("A",20000),
                new Employee("B",10000)
        );

        List<Employee> emps2 = Arrays.asList(
                new Employee("C",50000),
                new Employee("D",30000)
        );

        List<Department> dp = Arrays.asList(
                new Department("dept-1","111-1",emps),
                new Department("dept-2","222-1",emps2)
        );

        System.out.println(calcNumberOfEmployees(dp,10_000));
    }

    public static long calcNumberOfEmployees(List<Department> departments, long threshold) {
        long num=0;
        for (Department d:departments) {
            if (d.getCode().contains("111-"))
                for (Employee e : d.getEmployees()) {
                    if (e.getSalary() >= threshold)
                        num++;
                }
        }
        return num;
    }
}
