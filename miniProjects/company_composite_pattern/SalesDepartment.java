public class SalesDepartment implements Department { 

  private Integer id; 
  private String name; 

  public SalesDepartment(Integer id, String name) {
    this.id = id;
    this.name = name; 
  }
  
  public void printDepartmentName() {
    // getSimpleName is from the java.lang.class and is used to get the simple name of the class. If calss is anonymous the method returns and empty string
      System.out.println(getClass().getSimpleName());
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id; 
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name; 
  }


}