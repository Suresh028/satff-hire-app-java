/**
 * Write a description of class PartTimeStaffHire here.
 *
 * @author (Suresh Budha)
 * @version (0.01)
 */

//importing Java built-in Packages
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.event.*;

public class INGNepal implements ActionListener {
    private JFrame frame;
    private JLabel label;

    private JPanel panel1, panel2;
    // for full  time

    private JLabel vacancyNumber, designation, jobType, salary, workingHour, staffName, joiningDate, qualification, appointedBy;
    private JTextField vacNo, designationInput, jobTypeInput, salaryInput, workingHourInput, staffNameInput, joiningDateInput, qualificationInput, appointedByInput, vacancyNumberInput1;
    private JButton vacFull, appoint;

    // for part time
    private JLabel vacancyNumber1, designation1, jobType1, workingHour1, shift, wagesPerHour, staffName1, joiningDate1, qualification1, tvacancyNumber, appointedBy1;
    private JTextField vacNo1, designationInput1, jobTypeInput1, shift1, wagePerHourInput, workingHourInput1, staffNameInput1, joiningDateInput1, qualificationInput1, appointedByInput1, vacancyNumberInput2, vacancyNumberInput3;
    private JButton vacPart, appoint1, terminate;
    private JButton display, clear;

    // Creating an arraylist
    ArrayList<StaffHire> staffList = new ArrayList<StaffHire>();

    // Starting GUI frame
    public INGNepal() {
        frame = new JFrame("INGNepal");
        frame.setSize(775, 830);
        frame.setVisible(true);
        frame.setLayout(null);

        // panel for full time staff hire
        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBorder(BorderFactory.createTitledBorder(null, "Full Time Staff", TitledBorder.LEFT, TitledBorder.TOP, new Font("Arial", Font.BOLD, 15), Color.RED));
        panel1.setBounds(10, 10, 680, 300);
        panel1.setVisible(true);
        frame.add(panel1);
        // panel for hiring,appointing and terminating Part Time Staff
        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBorder(BorderFactory.createTitledBorder(null, "Part Time Staff", TitledBorder.LEFT, TitledBorder.TOP, new Font("Arial", Font.BOLD, 15), Color.RED));
        panel2.setBounds(10, 325, 680, 365);
        panel2.setVisible(true);
        frame.add(panel2);

        // Add vacancy for Full Time staff
        vacancyNumber = new JLabel("Vacancy No:");
        panel1.add(vacancyNumber);
        vacancyNumber.setBounds(35, 30, 100, 20);

        vacNo = new JTextField();
        panel1.add(vacNo);
        vacNo.setBounds(175, 30, 100, 20);

        designation = new JLabel("Designation:");
        panel1.add(designation);
        designation.setBounds(35, 60, 100, 20);

        designationInput = new JTextField();
        panel1.add(designationInput);
        designationInput.setBounds(175, 60, 100, 20);


        jobType = new JLabel("Job Type:");
        panel1.add(jobType);
        jobType.setBounds(35, 90, 100, 20);

        jobTypeInput = new JTextField();
        panel1.add(jobTypeInput);
        jobTypeInput.setBounds(175, 90, 100, 20);

        //next side

        salary = new JLabel("Salary:");
        panel1.add(salary);
        salary.setBounds(300, 30, 100, 20);

        salaryInput = new JTextField();
        panel1.add(salaryInput);
        salaryInput.setBounds(440, 30, 100, 20);


        workingHour = new JLabel("Working Hour:");
        panel1.add(workingHour);
        workingHour.setBounds(300, 60, 100, 20);

        workingHourInput = new JTextField();
        panel1.add(workingHourInput);
        workingHourInput.setBounds(440, 60, 100, 20);


        // appoint Full Time Staff
        staffName = new JLabel("Staff Name:");
        panel1.add(staffName);
        staffName.setBounds(30, 160, 100, 30);

        staffNameInput = new JTextField();
        panel1.add(staffNameInput);
        staffNameInput.setBounds(175, 160, 100, 20);

        joiningDate = new JLabel("Joining Date:");
        panel1.add(joiningDate);
        joiningDate.setBounds(30, 190, 100, 20);

        joiningDateInput = new JTextField();
        panel1.add(joiningDateInput);
        joiningDateInput.setBounds(175, 190, 100, 20);

        qualification = new JLabel("Qualification:");
        panel1.add(qualification);
        qualification.setBounds(30, 220, 100, 20);

        qualificationInput = new JTextField();
        panel1.add(qualificationInput);
        qualificationInput.setBounds(175, 220, 100, 20);

        //next side
        appointedBy = new JLabel("Appointed By:");
        panel1.add(appointedBy);
        appointedBy.setBounds(300, 160, 100, 20);

        appointedByInput = new JTextField();
        panel1.add(appointedByInput);
        appointedByInput.setBounds(440, 160, 100, 20);

        vacancyNumber = new JLabel("Vacancy Number:");
        panel1.add(vacancyNumber);
        vacancyNumber.setBounds(300, 190, 100, 30);

        vacancyNumberInput1 = new JTextField();
        panel1.add(vacancyNumberInput1);
        vacancyNumberInput1.setBounds(440, 190, 100, 20);

        //buttons For Adding vacacny Number and Appoint Full Time Staff

        vacFull = new JButton("Add Vacancy For Full Time Staff");
        panel1.add(vacFull);
        vacFull.setBounds(300, 90, 250, 30);
        vacFull.setFont(new Font("Arial", Font.BOLD, 16));
        vacFull.addActionListener(this);

        appoint = new JButton("Appoint Full Time Staff");
        panel1.add(appoint);
        appoint.setBounds(300, 225, 250, 30);
        appoint.setFont(new Font("Arial", Font.BOLD, 16));
        appoint.addActionListener(this);

        // for Adding vacancy of Part Time Staff
        vacancyNumber1 = new JLabel("Vacancy No:");
        panel2.add(vacancyNumber1);
        vacancyNumber1.setBounds(35, 30, 100, 20);

        vacNo1 = new JTextField();
        panel2.add(vacNo1);
        vacNo1.setBounds(175, 30, 100, 20);

        designation1 = new JLabel("Designation:");
        panel2.add(designation1);
        designation1.setBounds(35, 60, 100, 20);

        designationInput1 = new JTextField();
        panel2.add(designationInput1);
        designationInput1.setBounds(175, 60, 100, 20);


        jobType1 = new JLabel("Job Type:");
        panel2.add(jobType1);
        jobType1.setBounds(35, 90, 100, 20);

        jobTypeInput1 = new JTextField();
        panel2.add(jobTypeInput1);
        jobTypeInput1.setBounds(175, 90, 100, 20);

        //next side

        shift = new JLabel("Shift:");
        panel2.add(shift);
        shift.setBounds(300, 30, 100, 20);

        shift1 = new JTextField();
        panel2.add(shift1);
        shift1.setBounds(440, 30, 100, 20);


        wagesPerHour = new JLabel("Wages Per Hour:");
        panel2.add(wagesPerHour);
        wagesPerHour.setBounds(300, 60, 100, 20);

        wagePerHourInput = new JTextField();
        panel2.add(wagePerHourInput);
        wagePerHourInput.setBounds(440, 60, 100, 20);

        workingHour1 = new JLabel("Working Hour:");
        panel2.add(workingHour1);
        workingHour1.setBounds(300, 90, 100, 20);

        workingHourInput1 = new JTextField();
        panel2.add(workingHourInput1);
        workingHourInput1.setBounds(440, 90, 100, 20);


        // appoint Part Time Staff
        staffName1 = new JLabel("Staff Name:");
        panel2.add(staffName1);
        staffName1.setBounds(30, 160, 100, 30);

        staffNameInput1 = new JTextField();
        panel2.add(staffNameInput1);
        staffNameInput1.setBounds(175, 160, 100, 20);

        joiningDate1 = new JLabel("Joining Date:");
        panel2.add(joiningDate1);
        joiningDate1.setBounds(30, 190, 100, 20);

        joiningDateInput1 = new JTextField();
        panel2.add(joiningDateInput1);
        joiningDateInput1.setBounds(175, 190, 100, 20);

        qualification1 = new JLabel("Qualification:");
        panel2.add(qualification1);
        qualification1.setBounds(30, 220, 100, 20);

        qualificationInput1 = new JTextField();
        panel2.add(qualificationInput1);
        qualificationInput1.setBounds(175, 220, 100, 20);

        //next side
        appointedBy1 = new JLabel("Appointed By:");
        panel2.add(appointedBy1);
        appointedBy1.setBounds(300, 160, 100, 20);

        appointedByInput1 = new JTextField();
        panel2.add(appointedByInput1);
        appointedByInput1.setBounds(440, 160, 100, 20);

        vacancyNumber1 = new JLabel("Vacancy Number:");
        panel2.add(vacancyNumber1);
        vacancyNumber1.setBounds(300, 190, 100, 30);

        vacancyNumberInput2 = new JTextField();
        panel2.add(vacancyNumberInput2);
        vacancyNumberInput2.setBounds(440, 190, 100, 20);

        //buttons for adding and appoint Partime staff

        vacPart = new JButton("Add Vacancy For Part Time Staff");
        panel2.add(vacPart);
        vacPart.setBounds(300, 110, 250, 30);
        vacPart.setFont(new Font("Arial", Font.BOLD, 16));
        vacPart.addActionListener(this);

        appoint1 = new JButton("Appoint Part Time Staff");
        panel2.add(appoint1);
        appoint1.setBounds(300, 230, 250, 30);
        appoint1.setFont(new Font("Arial", Font.BOLD, 16));
        appoint1.addActionListener(this);

        //termination
        label = new JLabel("Terminate Staff");
        panel2.add(label);
        label.setBounds(60, 265, 150, 30);
        label.setFont(new Font("Arial", Font.BOLD, 20));


        tvacancyNumber = new JLabel("Vacancy Number:");
        panel2.add(tvacancyNumber);
        tvacancyNumber.setBounds(60, 300, 150, 20);

        vacancyNumberInput3 = new JTextField();
        panel2.add(vacancyNumberInput3);
        vacancyNumberInput3.setBounds(200, 300, 150, 20);

        // buttons to terminate hired part time staff
        terminate = new JButton("Terminate");
        panel2.add(terminate);
        terminate.setBounds(60, 330, 200, 30);
        terminate.setFont(new Font("Arial", Font.BOLD, 16));
        terminate.addActionListener(this);

        // Button to clear all the text fields
        clear = new JButton("Clear");
        clear.setBounds(420, 700, 130, 30);
        clear.setForeground(Color.RED);
        clear.setActionCommand("Clear");
        clear.addActionListener(this);
        frame.add(clear);

        //Button to display all the informmation of hired staff
        display = new JButton("Display");
        display.setBounds(290, 700, 120, 30);
        display.setForeground(Color.BLUE);
        display.setActionCommand("Display");
        display.addActionListener(this);
        frame.add(display);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new INGNepal();//calling the method
    }

    // An action perfromed method will perform certain task when buuton are clicked
    @Override
    public void actionPerformed(ActionEvent e) {

        {
            if (e.getSource() == vacFull) {
                //this code will run when vacfull button is clicked
                vacFull();
            }

            if (e.getSource() == appoint) {
                appoint();

            }
            if (e.getSource() == vacPart) {
                vacPart();
            }

            if (e.getSource() == appoint1) {
                appoint1();
            }

            if (e.getSource() == terminate) {
                termination();
            }

            if (e.getSource() == display) {
                display();
            }

            //This will clear alll the text inputed when clear button is clicked
            if (e.getSource() == clear) {
                //full time
                vacNo.setText("");
                designationInput.setText("");
                jobTypeInput.setText("");
                salaryInput.setText("");
                workingHourInput.setText("");
                staffNameInput.setText("");
                joiningDateInput.setText("");
                qualificationInput.setText("");
                appointedByInput.setText("");
                vacancyNumberInput1.setText("");


                // part time
                vacNo1.setText("");
                designationInput1.setText("");
                jobTypeInput1.setText("");
                shift1.setText("");
                wagePerHourInput.setText("");
                workingHourInput1.setText("");
                staffNameInput1.setText("");
                joiningDateInput1.setText("");
                qualificationInput1.setText("");
                appointedByInput1.setText("");
                vacancyNumberInput2.setText("");
                vacancyNumberInput3.setText("");
            }
        }
    }

    //method to add vacancy for full time staff
    private void vacFull(){
        int vacNumber = 0, salary = 0, workingHour = 0;
        String designation = "", jobType = "";
        try {

            if (vacNo.getText().isEmpty() || designationInput.getText().isEmpty() || jobTypeInput.getText().isEmpty() || salaryInput.getText().isEmpty() || workingHourInput.getText().isEmpty()) {
                throw new Exception("Error: TextField Cannot be Empty. Please fill up the data completely!!!");
            }

            vacNumber = Integer.parseInt(vacNo.getText());
            designation = designationInput.getText();
            jobType = jobTypeInput.getText();
            salary = Integer.parseInt(salaryInput.getText());
            workingHour = Integer.parseInt(workingHourInput.getText());


            boolean duplicateVacNumber = false;
            //check if input vacancy is already in list
            for (StaffHire var : staffList) { //iterates within arraylist
                if (var.getvacancyNo() == vacNumber) {
                    duplicateVacNumber = true;
                    break;
                }
            }
            if (duplicateVacNumber == false) {
                FullTimeStaffHire fullTimeStaff = new FullTimeStaffHire(vacNumber, designation, jobType, salary, workingHour);
                staffList.add(fullTimeStaff);
                JOptionPane.showMessageDialog(frame, "Vacancy for Full Time Staff is added Successfully.");
            } else {
                JOptionPane.showMessageDialog(frame, "Input Vacancy No. is already in the list. ");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Invalid Input Detected. Please fill up the data correctly!!!");

        } catch (Exception e1) {
            JOptionPane.showMessageDialog(frame, e1.getMessage());
        }
    }

    //method to appoint Full Time Staff
    private void appoint(){
        int vacNumber = 0;
        String staffName = "", joiningDate = "", qualification = "", appointedBy = "";
        try {

            if (vacancyNumberInput1.getText().isEmpty() || staffNameInput.getText().isEmpty() || joiningDateInput.getText().isEmpty() || qualificationInput.getText().isEmpty() || appointedByInput.getText().isEmpty()) {
                throw new Exception("Error: TextField Cannot be Empty. Please fill up the data completely!!!");
            }

            vacNumber = Integer.parseInt(vacancyNumberInput1.getText());
            staffName = staffNameInput.getText();
            joiningDate = joiningDateInput.getText();
            qualification = qualificationInput.getText();
            appointedBy = appointedByInput.getText();

            boolean vacFound = false;
            for (StaffHire staff : staffList) {
                if (staff instanceof FullTimeStaffHire) // object casting from parent to child
                {
                    FullTimeStaffHire fullTime = (FullTimeStaffHire) staff;

                    if (fullTime.getvacancyNo() == vacNumber && fullTime.getjoined() == true) {
                        JOptionPane.showMessageDialog(frame, "Error: The vacancy number " + vacNumber + " is already assosciated with staff " + fullTime.getstaffName());
                        vacFound = true;
                    } else if (fullTime.getvacancyNo() == vacNumber && fullTime.getjoined() == false) {
                        fullTime.fullTimeHire(staffName, joiningDate, qualification, appointedBy);
                        JOptionPane.showMessageDialog(frame, "Full Time Staff appointed Successfully");
                        vacFound = true;
                    }
                }
            }
            if (!vacFound) {
                JOptionPane.showMessageDialog(frame, "Error:Vacancy Number " + vacNumber + " not registered yet.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Invalid Input Detected. Please fill up the data correctly!!!");

        } catch (Exception e1) {
            JOptionPane.showMessageDialog(frame, e1.getMessage());
        }
    }

    //method to add vacancy for Part Time Staff
    private void vacPart(){
        int vacNumber = 0, workingHour = 0, wagesPerHour = 0;
        String designation = "", jobType = "", shifts = "";
        try {

            if (vacNo1.getText().isEmpty() || designationInput1.getText().isEmpty() || jobTypeInput1.getText().isEmpty() || workingHourInput1.getText().isEmpty() || wagePerHourInput.getText().isEmpty() || shift1.getText().isEmpty()) {
                throw new Exception("Error: TextField Cannot be Empty. Please fill up the data completely!!!");
            }

            vacNumber = Integer.parseInt(vacNo1.getText());
            designation = designationInput1.getText();
            jobType = jobTypeInput1.getText();
            workingHour = Integer.parseInt(workingHourInput1.getText());
            wagesPerHour = Integer.parseInt(wagePerHourInput.getText());
            shifts = shift1.getText();

            boolean duplicateVacNumber = false;
            for (StaffHire var : staffList) {
                if (var.getvacancyNo() == vacNumber) {
                    duplicateVacNumber = true;
                    break;
                }
            }
            if (duplicateVacNumber == false) {
                PartTimeStaffHire partTimeStaff = new PartTimeStaffHire(vacNumber, designation, jobType, workingHour, wagesPerHour, shifts);
                staffList.add(partTimeStaff);
                JOptionPane.showMessageDialog(frame, "Vacancy for Part Time Staff is added Successfully.");
            } else {
                JOptionPane.showMessageDialog(frame, "Input Vacancy No. is already in the list. ");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Invalid Input Detected. Please fill up the data correctly!!!");

        } catch (Exception e1) {
            JOptionPane.showMessageDialog(frame, e1.getMessage());
        }
    }

    //method to appoint Part Time Staff
    private void appoint1(){
        int vacNumber = 0;
        String staffName = "", joiningDate = "", qualification = "", appointedBy = "";
        try {

            if (staffNameInput1.getText().isEmpty() || joiningDateInput1.getText().isEmpty() || qualificationInput1.getText().isEmpty() || appointedByInput1.getText().isEmpty() || vacancyNumberInput2.getText().isEmpty()) {
                throw new Exception("Error: TextField Cannot be Empty. Please fill up the data completely!!!");
            }

            vacNumber = Integer.parseInt(vacancyNumberInput2.getText());
            staffName = staffNameInput1.getText();
            joiningDate = joiningDateInput1.getText();
            qualification = qualificationInput1.getText();
            appointedBy = appointedByInput1.getText();
            boolean vacFound = false;
            for (StaffHire staff : staffList) {
                if (staff instanceof PartTimeStaffHire) // object casting from parent to child
                {
                    PartTimeStaffHire partTime = (PartTimeStaffHire) staff;

                    if (partTime.getvacancyNo() == vacNumber && partTime.getjoined() == true) {
                        JOptionPane.showMessageDialog(frame, "Error: The vacancy number " + vacNumber + " is already associated with staff " + partTime.getstaffName());
                        vacFound = true;
                    } else if (partTime.getvacancyNo() == vacNumber && partTime.getjoined() == false) {
                        partTime.partTimehire(staffName, joiningDate, qualification, appointedBy);
                        JOptionPane.showMessageDialog(frame, "Part Time  Staff appointed Successfully");
                        vacFound = true;
                    }
                }
            }
            if (!vacFound) {
                JOptionPane.showMessageDialog(frame, "Error:Vacancy Number " + vacNumber + " not registered yet.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Invalid Input Detected. Please fill up the data correctly!!!");

        } catch (Exception e1) {
            JOptionPane.showMessageDialog(frame, e1.getMessage());
        }
    }


    //method to terminate the hired staff
    private void termination(){
        try{
            if (vacancyNumberInput3.getText().isEmpty()){
                throw new Exception ("Error Detected! Sorry Text Fields can't left Empty");

            }
            int vacNumber = Integer.parseInt(vacancyNumberInput3.getText());
            boolean vacFound = false;
            boolean join = false;

            for(StaffHire staff:staffList){
                if (staff instanceof PartTimeStaffHire){
                    PartTimeStaffHire partTime = (PartTimeStaffHire)staff;
                    join = partTime.getjoined();

                    if(partTime.getvacancyNo()==vacNumber && partTime.getterminated()==true){
                        JOptionPane.showMessageDialog(frame,"Staff assosciated with vacancy Number : "+vacNumber+" : is already terminated.");
                        vacFound = true;

                    }
                    else if(partTime.getvacancyNo()==vacNumber && partTime.getterminated()==false && join == true){
                       partTime.terminate();
                        JOptionPane.showMessageDialog(frame,"Staff termination successful.");
                        vacFound = true;
                    }
                }
            }
            if(vacFound == false && join ==false){
                JOptionPane.showMessageDialog(frame,"Error:Vacancy Number : "+vacNumber+" : not found.");
            }
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(frame,"Error: Invalid input detected!!!");
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(frame,e.getMessage());
        }
    }
    //method to display Information of staff
    private void display() {
        System.out.println("-----------------------------------------------------------------Records--------------------------------------------------------------------------");
        for( StaffHire staff : staffList){
            if(staff instanceof FullTimeStaffHire){
                FullTimeStaffHire test = (FullTimeStaffHire) staff;
                test.DisplayInfo();     //This will invoke the DisplayInfo method in FullTimeStaffHire class
            }
            if(staff instanceof PartTimeStaffHire){
                PartTimeStaffHire test = (PartTimeStaffHire) staff;
                test.displayInfo() ;  //This will invoke the DisplayInfo method in PartTimeStaffHire class
            }
        }
    }
}





