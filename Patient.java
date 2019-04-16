public class Patient {


    private String PatientName;
    private String visitReason;
    private int PatientDOB;
    private int apptTime;

    public Patient()
    {
        this.PatientName = null;
        this.visitReason = null;
        this.PatientDOB = 0;
        this.apptTime = 0;
    }

    public Patient(String PatientName, String visitReason, int PatientDOB, int apptTime){
        this.PatientName = PatientName;
        this.visitReason = visitReason;
        this.PatientDOB = PatientDOB;
        this.apptTime = apptTime;
    }

    public String toString()
    {
        return "Patient Name: " + PatientName + ", Reason for visit: " + visitReason + ", DOB: " + PatientDOB + ", Appointment Time: " + apptTime+ "\n" ;
    }




}


