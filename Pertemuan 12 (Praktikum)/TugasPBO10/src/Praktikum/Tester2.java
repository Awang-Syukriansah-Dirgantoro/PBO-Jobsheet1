package Praktikum;

public class Tester2 {

    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        Employee e;
        e = pEmp;
        System.out.println("" + e.getEmployeeinfo());
        System.out.println("---------------------");
        System.out.println("" + pEmp.getEmployeeInfo());
    }
}
