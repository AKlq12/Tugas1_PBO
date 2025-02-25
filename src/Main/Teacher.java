/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author KOMPUTER
 */
class Teacher extends Employee implements Certified {
    private double salary;
    
    public Teacher(String name, int workHours, double salary) throws InvalidWorkHoursException {
        super(name, workHours);
        this.salary = salary;
    }
    
    public void work() {
        System.out.println(name + " mengajar di kelas.");
    }

    public double getSalary() {
        return salary + (workHours * 40);
    }

    public void showCertification() {
        System.out.println(name + " adalah guru yang bersertifikat.");
    }
}