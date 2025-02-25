/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author KOMPUTER
 */
class Chef extends Employee {
    private double salary;
    
    public Chef(String name, int workHours, double salary) throws InvalidWorkHoursException {
        super(name, workHours);
        this.salary = salary;
    }
    
    public void work() {
        System.out.println(name + " memasak makanan lezat.");
    }

    public double getSalary() {
        return salary + (workHours * 30);
    }
}