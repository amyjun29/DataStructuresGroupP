import java.util.LinkedList;

public class Doctor {


    //doctor object fields
    private String docName;
    private int docID;
    private static final int scheduleSize = 16;
    private LinkedList<Patient> schedule;

    //create a String array for time options
    private String[] appointmentTimes = {"8:00","8:30","9:00","9:30","10:00","10:30",
            "11:00","11:30","12:00","12:30","1:00","1:30",
            "2:00","2:30","3:00","3:30"};

    public Doctor()
    {
        //default constructor
    }

    public Doctor(String docName, int docID)
    {
        //constructor with parameters

        this.docName = docName;
        this.docID = docID;
        schedule = new LinkedList<Patient>();
        //Initializing Dr Schedule to Available
        for (int i = 0; i < Doctor.scheduleSize; i++)
        {
            schedule.add(new Patient(appointmentTimes[i]));
        }
    }

    public String toString()
    {
        return docName + " " + docID;
    }

    public void addPatient(int index, Patient p1)
    {
        schedule.remove(index);
        schedule.add(index, p1);
    }

    public void addPatient(Patient p1) { //add patient without selected time
        schedule.add(p1);
    }

    public void removePatient(int index)
    {
        schedule.remove(index);
        schedule.add(new Patient(appointmentTimes[index]));
    }

    public LinkedList<Patient> getSchedule() {
        return schedule;
    }

    public void printSchedule()
    {
        //prints doctor's schedule
        System.out.println(this.docName + "'s Schedule");
        System.out.println("Time\t\t\tPatient Name\t\t\tReason For Visit");
        for (Patient p : this.schedule)
        {
            System.out.println(p.getApptTime() + "\t\t\t" +  p.getPatientName() + "\t\t\t\t\t\t" + p.getVisitReason());
        }
        System.out.println();
    }
}