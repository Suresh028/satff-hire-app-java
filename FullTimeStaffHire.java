
/**
 * Write a description of class FullTimeStaffHire here.
 *
 * @author (Suresh Budha)
 * @version (0.01)
 */
  public class FullTimeStaffHire extends StaffHire
{ 
       // instance variables
     private int salary;
     private int workHour;
     private String staffName;
     private String joinedDate;
     private String qualification;
     private String appointedBy;
     private boolean joined;
        //creating a constructor for FullTimeStaffHire
       public FullTimeStaffHire( int vacancyNo, String designation, String jobType,int salary,int workHour){
        super(vacancyNo, designation, jobType);
        this.salary=salary;
        this.workHour=workHour;
        staffName="";
        joinedDate="";
        qualification="";
        appointedBy="";
        joined=false;
     }
      // creating accessor method for each attribute
     public int getsalary(){
          return salary;
     }
     public int getworkHour(){
          return workHour;
     }
     public String getstaffName(){
            return staffName;
     }
     public String getjoinedDate(){
            return joinedDate;
     }
     public String getqualification(){
            return qualification;
     }
        
     public String getappointedBy(){
            return appointedBy;
     }
     public boolean getjoined(){
             return joined;
     }
        // creating a method to set salaray
     public void setsalary(int salary){
            if(joined==false){
            this.salary=salary;
        }
        else{
             System.out.println("The salary of hired staff cannot be changed ");
          }
     }
      // creating method to set workHour 
     public void setworkHour(int workHour){
            this.workHour=workHour;
       } 
      //creating a method to hire a fulltimestaff
     public void fullTimeHire( String staffName,String joinedDate,String qualification,String appointedBy){
        if(joined==false){
            this.staffName=staffName;
            this.joinedDate=joinedDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            System.out.println("Staff has been hired");
            joined=true;
        }
        else{
            System.out.println(staffName +"has already been hired"); 
         }
     }
     //creating a method to display information
     
     public void DisplayInfo(){
         super.displayInfo();
        if(joined==true){
            System.out.println("------------------------------");
            
            System.out.println("Staff Name =" + getstaffName());
            System.out.println("Join Date =" + getjoinedDate());
            System.out.println("Qualification =" + getqualification());
            System.out.println("Appointed By =" + getappointedBy());
            System.out.println("------------------------------");
        }
        else{
            System.out.println("staff has not Hired");
        }
        
      }
    } 
  