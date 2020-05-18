

public class FinancialDepartment implements Department { 

  private Integer id; 
  private String name; 
  
  public FinancialDepartment(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  public void printDepartmentName() {
    // review here
      System.out.println(getClass().getSimpleName());
  }

  public String getId() {
    return name;
  }

  public void seId(Integer id) {
    this.id = id; 
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name; 
  }

}