import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

    static String answer;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        //create three doctors
        Doctor doc1 = new Doctor("Dr.Brown", 2305);
        Doctor doc2 = new Doctor("Dr.Gabriel", 1005);
        Doctor doc3 = new Doctor("Dr.Cho", 1010);

        Doctor current = new Doctor();

        //create time table for doctor's schedule

        Map<String, Integer> timeTable = new HashMap<>();
        timeTable.put("8:00", 0);
        timeTable.put("8:30", 1);
        timeTable.put("9:00", 2);
        timeTable.put("9:30", 3);
        timeTable.put("10:00", 4);
        timeTable.put("10:30", 5);
        timeTable.put("11:00", 6);
        timeTable.put("11:30", 7);
        timeTable.put("12:00", 8);
        timeTable.put("12:30", 9);
        timeTable.put("1:00", 10);
        timeTable.put("1:30", 11);
        timeTable.put("2:00", 12);
        timeTable.put("2:30", 13);
        timeTable.put("3:00", 14);
        timeTable.put("3:30", 15);
        timeTable.put("4:00", 16);


        //prompt user and get user input
        System.out.println("What would you like to do?");
        System.out.println("A) Schedule Appointment B) Show Doctor's Schedule C) Cancel Appointment");
        System.out.println("*** Enter QUIT to quit ***");
        answer = in.nextLine();


        //loop while the user input isn't quit
        while (!answer.equalsIgnoreCase("QUIT")) {


            if (answer.equalsIgnoreCase("A")) {
                System.out.println();

                //doctor options
                System.out.println("Select a Doctor");
                System.out.println("1) " + doc1.toString() + " 2) " + doc2.toString() + " 3) " + doc3.toString());
                Scanner input = new Scanner(System.in);
                int i = input.nextInt();

                //If user inputs invalid answer, prompt user again
                if(i!=1 && i!=2 && i!=3) {
                    System.out.println("Invalid answer choice. Please enter 1, 2, or 3");
                    i = input.nextInt();
                }



                //select doctor based on the user input
                    if (i == 1)
                        current = doc1;
                    else if (i == 2)
                        current = doc2;
                    else if (i == 3)
                        current = doc3;

                    current.printSchedule();


                    //get user input for patient information
                    Scanner input2 = new Scanner(System.in);
                    System.out.println("Enter Patient Name");
                    String name = input2.nextLine();
                    System.out.println("Enter Patient's reason for visit");
                    String reason = input2.nextLine();
                    System.out.println("Enter Patient DOB (MMDDYY)");
                    int DOB = input2.nextInt();
                    System.out.println("Enter Appointment Time");
                    Scanner input3 = new Scanner(System.in);

                    //Get Appointment time input for user, check for time range and format errors
                    while (!input3.hasNext("([12389]|10|11|12):(00|30)")) {
                        System.out.println("Please enter a time from 8:00 to 3:30");
                        input3.next();
                    }
                    String time = input3.next();
                    input3.nextLine();

                    //make sure the time selected is available, else request time again
                    while (!(current.getSchedule().get(timeTable.get(time)).getPatientName().equals("Available"))) {
                        System.out.println("That time is not available, Please select an available time slot");
                        while (!input3.hasNext("([12389]|10|11|12):(00|30)")) {
                            System.out.println("Please enter a time from 8:00 to 3:30");
                            input3.next();
                        }
                        time = input3.next();
                        input3.nextLine();
                    }

                    //create a new patient with user input
                    Patient p1 = new Patient(name, reason, DOB, time);

                    //add patient to current dr schedule
                    current.addPatient(timeTable.get(time), p1);
                    System.out.println(); //Spacer
                    current.printSchedule();


            } else if (answer.equalsIgnoreCase("B")) {
                System.out.println();

                //doctor options
                System.out.println("Select a Doctor");
                System.out.println("1) " + doc1.toString() + " 2) " + doc2.toString() + " 3) " + doc3.toString());
                Scanner input4 = new Scanner(System.in);
                int i = input4.nextInt();

                //If user inputs invalid answer, prompt user again
                if(i!=1 && i!=2 && i!=3) {
                    System.out.println("Invalid answer choice. Please enter 1, 2, or 3");
                    i = input4.nextInt();
                }

                //select doctor based on the user input
                if (i == 1)
                    current = doc1;
                else if (i == 2)
                    current = doc2;
                else if (i == 3)
                    current = doc3;


                //show selected doctor's schedule
                current.printSchedule();


            } else if (answer.equalsIgnoreCase("C")) {
                System.out.println();
                System.out.println("Select a Doctor");
                System.out.println("1) " + doc1.toString() + " 2) " + doc2.toString() + " 3) " + doc3.toString());
                Scanner input6 = new Scanner(System.in);
                int i = input6.nextInt();

                //If user inputs invalid answer, prompt user again
                if(i!=1 && i!=2 && i!=3) {
                    System.out.println("Invalid answer choice. Please enter 1, 2, or 3");
                    i = input6.nextInt();
                }

                if (i == 1)
                    current = doc1;
                else if (i == 2)
                    current = doc2;
                else if (i == 3)
                    current = doc3;

                System.out.println();

                current.printSchedule();

                //get user input for time selection
                System.out.println("Enter Appointment Time To Cancel");
                Scanner input7 = new Scanner(System.in);
                String removeTime = input7.nextLine();
                System.out.println();

                //remove patient
                current.removePatient(timeTable.get(removeTime));
                current.printSchedule();
                System.out.println();

            }

            //if the user input isn't A,B, or C prompt user again
            else
            {
                System.out.println("Invalid answer choice. Please enter A, B, C or QUIT");
                System.out.println(); //Spacer
            }

            //prompting user for input to either start or stop the loop
            answer = "";
            System.out.println("What would you like to do?");
            System.out.println("A) Schedule Appointment B) Show Doctor's Schedule C) Cancel Appointment");
            System.out.println("*** Enter QUIT to quit ***");
            answer = in.nextLine();

        }
    }
}