package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Andrés", "Vanegas Henao", "andres@uq.com", "3265824265", "1007109560", (byte) 20);
        System.out.println(estudiante1.getEmail());
        
       
    }
}
