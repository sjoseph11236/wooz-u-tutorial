import java.util.*;


public class HeadDepartment implements Department { 
  private Integer id; 
  private String name;

  // *
  private List<Department> childDepartments; 

  public HeadDepartment(Integer id, String name) {
    this.id = id; 
    this.name = name; 
    this.childDepartments = new ArrayList<>();  
  }

  public void printDepartmentName() {
    // The double colo operator(::) or method reference operator is used to call a method by refering to it with the help its calss directly.

    // The syntax is (ClassName :: methodName)
    childDepartments.forEach(Department  :: printDepartmentName);
  }

  public void addDepartment(Department department) {
    childDepartments.add(department);
  }

  public void removeDepartment(Department department) {
    childDepartments.remove(department);
  }
}