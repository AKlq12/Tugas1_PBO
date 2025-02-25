/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author KOMPUTER
 */
abstract class Employee {
    protected String name;
    protected int workHours;

    public Employee(String name, int workHours) throws InvalidWorkHoursException {
        if (workHours < 0) {
            throw new InvalidWorkHoursException("Jam kerja tidak boleh negatif!");
        }
        this.name = name;
        this.workHours = workHours;
    }
    
    public abstract void work();
    public abstract double getSalary();
    
    public void displayInfo() {
        System.out.println("Employee: " + name + ", Jam Kerja: " + workHours);
    }
}
