import java.util.List;
import java.util.Scanner;

public class CompanyMenagement {
    public static void main (String[]args){
        //
        EmployeeDAOlmpl dao = EmployeeDAOlmpl.getInstance();
//
        displayAllEmployee(dao);
        //
//addNewEmployee(dao);
//
        finalEmployeeByID(dao);
updateEmployeebyID(dao);
deletEmployeebyID(dao);


    }

    private static void deletEmployeebyID(EmployeeDAOlmpl dao) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter an employee ID that you want to delete:");
    int id = Integer.parseInt(sc.nextLine().trim());
    dao.deleteEmp(id);

    }

    private static void updateEmployeebyID(EmployeeDAOlmpl dao) {

Scanner sc = new Scanner(System.in);
System.out.println("Enter an employee ID:");
int id = Integer.parseInt(sc.nextLine().trim());
Empioyee emp= dao.findEmp(id);
if (emp != null){
    System.out.println(emp.toString());
}
System.out.println("Empter new salary for employee ID"+emp.getEmpID()+":");
double ns = Double.parseDouble(sc.nextLine().trim());
emp.setSalary(ns);
dao.updateEmp(emp);
    }

    private static void finalEmployeeByID(EmployeeDAOlmpl dao) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an employee ID ");
        int id = Integer.parseInt(sc.nextLine().trim());
        Empioyee emp = dao.findEmp(id);
        if (emp != null) {
            System.out.println(emp.toString());

        }


    }

    private static void addNewEmployee(EmployeeDAOlmpl dao) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter emloyee id:");
        int id = Integer.parseInt(sc.nextLine().trim());
        System.out.println("Enter employee name:");
        String name = sc.nextLine();
        System.out.println("Enter employee position:");
        String position = sc.nextLine();
        System.out.println("Enter employee saloyee salary:");
        double salary = Double.parseDouble(sc.nextLine().trim());

        dao.addEmp(new Empioyee(id,name,position,salary));

    }

    private static void displayAllEmployee(EmployeeDAOlmpl dao) {
        List<Empioyee> emp = dao.getAllEmp();
        for (Empioyee e:emp){
            System.out.println(e.toString());



        }
    }
}
