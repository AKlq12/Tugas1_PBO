/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

/**
 *
 * @author KOMPUTER
 */
public class Main {
    public static void main(String[] args) {
        try {
            Employee doctor = new Doctor("Dr. Smith", 40, 3000000);
            Employee chef = new Chef("Chef Ramsey", 35, 2000000);
            Employee teacher = new Teacher("Mr. Johnson", 30, 1000000);

            doctor.work();
            doctor.displayInfo();
            System.out.println("Salary: Rp " + doctor.getSalary());
            ((Certified) doctor).showCertification();
            System.out.println();

            chef.work();
            chef.displayInfo();
            System.out.println("Salary: Rp " + chef.getSalary());
            System.out.println();

            teacher.work();
            teacher.displayInfo();
            System.out.println("Salary: Rp " + teacher.getSalary());
            ((Certified) teacher).showCertification();

        } catch (InvalidWorkHoursException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
