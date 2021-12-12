/**
 * Write a description of class PartTimeStaffHire here.
 *
 * @author (Suresh Budha)
 * @version (0.01)
 */

public class PartTimeStaffHire extends StaffHire
{
    private int workHour;
    private int wagePerHour;
    private String staffName;
    private String joinDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;
    //creating a constructor for PartTimeStaffHire
    public PartTimeStaffHire(int vacancyNo, String designation, String jobType,int workHour, int wagePerHour, String shifts)
    {
        super(vacancyNo, designation, jobType);
        this.workHour=workHour;
        this.wagePerHour=wagePerHour;
        this.shifts=shifts;
        staffName="";
        joinDate="";
        qualification="";
        appointedBy="";
        joined= false;
        terminated=false;
    }
    //creating accessor methods for each attribute
    public int getworkHour(){
        return workHour;
    }
    public int getwagePerHour(){
        return wagePerHour;
    }
    public String getstaffName(){
        return staffName;
    }
    public String getjoinDate(){
        return joinDate;
    }
    public String getqualification(){
        return qualification;
    }
    public String getappointedBy(){
        return appointedBy;
    }
    public String getshifts(){
        return shifts;
    }
    public Boolean getjoined(){
        return joined;
    }
    public Boolean getterminated(){
        return terminated;
    }
    //creating a method to change the shift of a staff if shifts is equal to 'Hire'
    public void setshifts( String shifts ){
        if(!shifts.equals("Hire")){
            this.shifts=shifts;
        }
    }
    /*creating a method to hire a staff
     * if a staff has not been hired the input values will be inserted
     * otherwise a message will be displayed.
     */
    public void partTimehire( String staffName, String joinDate, String qualification, String appointedBy){
        if(joined==false){
            this.staffName=staffName;
            this.joinDate=joinDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            joined=true;
            terminated=false;
        }
        else{
            System.out.println( staffName + " has already been hired");
        }
    }
    //creating a method to terminate a hired staff
    public void terminate(){
        if( terminated==true){
            System.out.println("The Staff's record has been terminated");
        }
        else{
            System.out.println( staffName + " has been terminated");
            staffName="";
            joinDate="";
            qualification="";
            joined=false;
            terminated=true;
        }
    }
    //creating a method to display info about a staff
    public void displayInfo(){
        super.displayInfo();
        if(joined==true){
            System.out.println("----------------------------------------");

            System.out.println("Staff Name = " + staffName);
            System.out.println("Joined Date = " + joinDate);
            System.out.println("Qualification = " + qualification );
            System.out.println("Appointed By = " + appointedBy);
            System.out.println("----------------------------------------");
        }
        else{
            System.out.println("Staff has not been hired");
        }
    }
}













