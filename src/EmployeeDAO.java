import java.util.List;

public interface EmployeeDAO {
    //CRUD
    public List<Empioyee> getAllEmp();
    public void addEmp (Empioyee emp);
    public  Empioyee findEmp (int id);
    public  void updateEmp (Empioyee emp);
    public void deleteEmp (int id);

}
