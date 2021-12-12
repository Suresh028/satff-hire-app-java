
/**
 * Write a description of class StaffHire here.
 *
 * @author (Suresh Budha)
 * @version (0.01)
 */
   
public class StaffHire{

    private int vacancyNo;
    private String Designation;
    private String JobType;
    public StaffHire( int vacancyNo,String Designation ,String JobType){
        this.vacancyNo= vacancyNo;
        this.Designation= Designation;
        this.JobType= JobType;
    }
    public int getvacancyNo(){
        return vacancyNo;
    }
    public void setvacancyNo(int  vacancyNo){
        this.vacancyNo= vacancyNo;
    }
    public String getDesignation(){
        return Designation;
    }
    public void setDesignation(String Designation){
        this.Designation=Designation;
    }
    public String getJobType(){
        return JobType;
    }
    public void setJobType(String JobType){
        this.JobType=JobType;
    }
    public void displayInfo(){
        System.out.println("vacancyNo= "+getvacancyNo());
        System.out.println("Designation= "+getDesignation());
        System.out.println("JobType= "+getJobType());
    }
}







