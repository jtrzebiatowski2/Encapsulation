package lab1;

import java.util.Date;

    
/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the four other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private Date birthDate;
    private boolean metWithHumanResourceDepartment;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedInOffice;
    private String cubeId;
    private final String DEPT_STAFF_ERROR_MESSAGE = "Sorry, you cannot meet with department staff until you have met with HR";
    private final String REVIEW_DEPT_POLICIES_ERROR_MESSAGE = "Sorry, you cannot review "
                    + " department policies until you have first met with HR "
                    + "and then with department staff.";
    private final String MOVE_INTO_CUBICLE_ERROR_MESSAGE = "Sorry, you cannot move in to a "
                    + "cubicle until you have first met with HR "
                    + "and then with department staff, and then reviewed"
                    + "department policies.";
    
    private final int MIN_LENGTH = 1;
    private final int SSN_LENGTH = 11;
    
    public Employee() {

    }
    //This method combines 4 methods in the hiring process and may be called to reduce confusion. 
    //The methods also become encapsulated with this one method.
    public void hireEmployee(String cubeId){
        meetWithHrForBenefitAndSalryInfo();
        meetDepartmentStaff();
        reviewDeptPolicies();
        moveIntoCubicle(cubeId);
    }

    // Assume this must be performed first
    private void meetWithHrForBenefitAndSalryInfo() {
        metWithHumanResourceDepartment = true;
    }

    // Assume this is must be performed second
    public void meetDepartmentStaff() {
        if(metWithHumanResourceDepartment) {
            metDeptStaff = true;
        } else {
            throw new IllegalStateException(DEPT_STAFF_ERROR_MESSAGE);
        }
    }

    // Assume this must be performed third
    private void reviewDeptPolicies() {
        if(metWithHumanResourceDepartment && metDeptStaff) {
            reviewedDeptPolicies = true;
        } else {
            throw new IllegalStateException(REVIEW_DEPT_POLICIES_ERROR_MESSAGE);
        }
    }

    // Assume this must be performed 4th
    private void moveIntoCubicle(String cubeId) {
        if(metWithHumanResourceDepartment && metDeptStaff && reviewedDeptPolicies) {
            this.cubeId = cubeId;
            this.movedInOffice = true;
        } else {
            throw new IllegalStateException(MOVE_INTO_CUBICLE_ERROR_MESSAGE);
        }
    }

    public String getEmployeeStatus() {
        if(metWithHumanResourceDepartment && metDeptStaff
           && reviewedDeptPolicies && movedInOffice) {
            return "Orientation is complete\nEmployee cube number is: " + cubeId;
            
        } else {
            return "Orientation in progress...";
        }
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setCubeId(String cubeId) {
        this.cubeId = cubeId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        if(firstName == null || firstName.length() < MIN_LENGTH){
            throw new IllegalArgumentException();
        }
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        if(lastName == null || lastName.length() < MIN_LENGTH){
            throw new IllegalArgumentException();
        }
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {    
        this.socialSecurityNumber = socialSecurityNumber;
        if(socialSecurityNumber.length() != SSN_LENGTH){
            throw new IllegalArgumentException();
        }
    }

    public Date getBirthDate() {
        return birthDate;
        //Birthdate Validation Code goes here
    }

    public String getCubeId() {
        return cubeId;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    
    }
    
    
    

