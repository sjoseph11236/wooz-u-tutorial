package emailapp;
import java.util.*;

public class Email { 
  
  private String firstName; 
  private String lastName;
  private String department;
  private String email; 
  private String alternateEmail;
  private String companySuffix;
  private int defailtPasswordLength = 10;
  private String password; 
  private int mailboxCapcity;

  public Email (String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName; 
    System.out.println("New Hire: " + this.firstName + " " + this.lastName);

    this.department = setDepartment();
    System.out.println("Department: " + this.department);

    this.password = setRandomPassword(this.defailtPasswordLength);
    System.out.println("Your Password: " + this.password);
  }

  // deteremine the department
  private String setDepartment() {
    System.out.println("New worker: " + firstName + "."+ "Department Codes: \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");

    Scanner in = new Scanner(System.in);

    int depChoice = in.nextInt();

    if(depChoice == 1) {
      return "sales";
    }
    else if (depChoice == 2) {
      return "dev";
    }
    else {
      return "";
    }
  }

  // generate a random string for the password
  private String setRandomPassword(int length) {

    final String PASSWORD_SET = "ABCDEFGHIJKLMNOPQSTUVWXYZ,.@#$%^&*";

    char [] password = new char[length];
    
    for(int i = 0; i < length; i++) {
      int random = (int) (Math.random() * PASSWORD_SET.length());

      password[i] = PASSWORD_SET.charAt(random);

    }

    return new String(password);
  }

  // set methods 
  // change passowrd
  public void changePassword(String password) {
    this.password = password;
  }
  // set the mailboxCapacity
  public void setMailBoxCapcity(int capcity) {
    this.mailboxCapcity = capcity; 
  }
  // define an alternative email
  public void setAltEmail(String email) {
    this.alternateEmail = email;
  }

  public String getCompanySuffix() {
    return this.companySuffix;
  }

  public String getAlternateEmail() {
    return this.alternateEmail;
  }

  public int getMailboxCapcity() {
    return this.mailboxCapcity;
  }


  public String getPassword() {
    return this.password;
  }

  // @Override
  // public String toString() {
  //   // TODO Auto-generated method stub
  //   return "New worker: " + firstName + "."+ "Department Codes: \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: "
  // }
}