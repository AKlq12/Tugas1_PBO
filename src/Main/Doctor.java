/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author KOMPUTER
 */
class Doctor extends Employee implements Certified {
    private double salary;
    
    public Doctor(String name, int workHours, double salary) throws InvalidWorkHoursException {
        super(name, workHours);
        this.salary = salary;
    }
    
    public void work() {
        System.out.println(name + " merawat pasien.");
    }

    public double getSalary() {
        return salary + (workHours * 50);
    }

    public void showCertification() {
        System.out.println(name + " dokter yang bersertifikat.");
    }
}
