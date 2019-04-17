import java.util.Scanner;


public class Main {

    static String answer;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Doctor doc1 = new Doctor("Dr.Brown", 2305);
        Doctor doc2 = new Doctor("Dr.Gabriel", 1005);
        Doctor doc3 = new Doctor("Dr.Cho", 1010);

        Doctor current = new Doctor();

        for (int i = 0; i < 16; i++) {
            doc1.addPatient(new Patient());
            doc2.addPatient(new Patient());
            doc3.addPatient(new Patient());
        }


        System.out.println("What would you like to do? A) Enter a patient B) Show Doctor's Schedule C)Remove a Patient");
        System.out.println("Enter STOP to stop");
        answer = in.nextLine();

        while (!answer.equalsIgnoreCase("STOP")) {


            if (answer.equalsIgnoreCase("A")) {
                System.out.println("1) " + doc1.toString() + " 2) " + doc2.toString() + " 3) " + doc3.toString());
                System.out.println("Pick a doctor");
                Scanner input = new Scanner(System.in);
                int i = input.nextInt();

                if (i == 1)
                    current = doc1;
                else if (i == 2)
                    current = doc2;
                else if (i == 3)
                    current = doc3;
                else
                    System.out.println("Invalid answer choice. Please enter 1, 2, or 3");

                System.out.println(current.toString());


                Scanner input2 = new Scanner(System.in);
                System.out.println("Enter Patient name");
                String name = input2.nextLine();
                System.out.println("Enter Patient's reason for visit");
                String reason = input2.nextLine();
                System.out.println("Enter Patient DOB");
                int DOB = input2.nextInt();
                System.out.println("Enter appointment time");
                int time = input2.nextInt();

                Patient p1 = new Patient(name, reason, DOB, time);
                current.addPatient(p1);

            } else if (answer.equalsIgnoreCase("B")) {
                System.out.println("1) " + doc1.toString() + " 2) " + doc2.toString() + " 3) " + doc3.toString());
                System.out.println("Pick a doctor");
                Scanner input4 = new Scanner(System.in);
                int i = input4.nextInt();

                if (i == 1)
                    current = doc1;
                else if (i == 2)
                    current = doc2;
                else if (i == 3)
                    current = doc3;
                else
                    System.out.println("Invalid answer choice. Please enter 1, 2, or 3");

                System.out.println(current.schedule);


            } else if (answer.equalsIgnoreCase("C")) {
                System.out.println("1) " + doc1.toString() + " 2) " + doc2.toString() + " 3) " + doc3.toString());
                System.out.println("Pick a doctor");
                Scanner input6 = new Scanner(System.in);
                int i = input6.nextInt();

                if (i == 1)
                    current = doc1;
                else if (i == 2)
                    current = doc2;
                else if (i == 3)
                    current = doc3;
                else
                    System.out.println("Invalid answer choice. Please enter 1, 2, or 3");

                System.out.println("Enter Patient appointment time");
                Scanner input7 = new Scanner(System.in);
                int removeTime = input7.nextInt();
                //current.removePatient(removeTime);


            }

            answer = "";
            System.out.println("What would you like to do? A) Enter a patient B) Show Doctor Schedule C)Remove Patient");
            System.out.println("Enter STOP to stop");
            answer = in.nextLine();


        }

    }
}
