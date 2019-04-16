import java.util.LinkedList;

public class Doctor {


    private String DocName;
    private int DocID;
    private static final int scheduleSize = 16;

    LinkedList<Patient> schedule = new LinkedList<Patient>();


    public Doctor()
    {
        this.DocName = "";
        this.DocID = 0;
    }

    public Doctor(String DocName, int DocID)
    {
        this.DocName = DocName;
        this.DocID = DocID;
    }

    public String toString()
    {
        return DocName + " " + DocID;
    }

    public void addPatient(Patient p1, int index)
    {

        schedule.add(index,p1);

    }

    public void addPatient(Patient p1){
        schedule.add(p1);

    }

    public void removePatient(int time)
    {
        //int index = table(time);
        //schedule.remove(index);
    }





}
