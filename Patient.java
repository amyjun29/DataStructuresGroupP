public class Patient {


    private String patientName;
	private String visitReason;
    private int patientDOB;
    private String apptTime;

    public Patient(String apptTime)
    {
        this.patientName = "Available";
        this.visitReason = "---";
        this.patientDOB = 0;
        this.apptTime = apptTime;
    }

    public Patient(String patientName, String visitReason, int patientDOB, String apptTime){
        this.patientName = patientName;
        this.visitReason = visitReason;
        this.patientDOB = patientDOB;
        this.apptTime = apptTime;
    }
    
    public String getPatientName() 
    {
		return patientName;
	}

    public String getVisitReason() 
    {
		return visitReason;
	}

	public String getApptTime() 
	{
		return apptTime;
	}

	public String toString()
    {
        return "Patient Name: " + patientName + ", Reason for visit: " + visitReason + ", DOB: " + patientDOB + ", Appointment Time: " + apptTime+ "\n" ;
    }
}


