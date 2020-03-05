import java.util.List;
import java.util.Scanner;

public class CompanyMenagement {
    public static void main (String[]args){
        //
        EmployeeDAOlmpl dao = EmployeeDAOlmpl.getInstance();

        displayAllEmployee(dao);
addNewEmployee(dao);
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
