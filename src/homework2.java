import java.util.Scanner;
public class homework2 {



    public static void main(String[] args){
        int N;
        Scanner input = new Scanner(System.in);
        System.out.println("How many students Data will be entered?: ");
        N = input.nextInt();
        Student[] s=new Student[N];

        for (int j=0; j<N; j++){
            System.out.println("Enter student "+ (j+1)+ " details: ");

            s[j] = new Student();

            input.nextLine();
            System.out.println("\n    Enter First Name: ");
            String fname = input.nextLine();
            fname = s[j].stringValidation(fname);

            System.out.println("    Enter Last Name: ");
            String lname = input.nextLine();
            lname = s[j].stringValidation(lname);

            System.out.println("    Enter ID: ");
            String id = input.nextLine();
            id = s[j].IDValidation(id);

            System.out.println("    Enter Standing: ");
            String standing = input.nextLine();

            System.out.println("    Enter Email: ");
            String email = input.nextLine();
            email = s[j].emailValidation(email);

            System.out.println("    Enter Address: ");
            String address= input.nextLine();

            System.out.println("    Enter City: ");
            String city = input.nextLine();
            city = s[j].stringValidation(city);

            System.out.println("    Enter State: ");
            String state = input.nextLine();

            System.out.println("    Enter Zip: ");
            String zip = input.nextLine();

            s[j].setValues(id, standing, zip, state, city, address, fname, lname, email);

        }
        System.out.println("Students Details, Department of ILT");
        for (int j=0; j<N; j++){
            System.out.println("\n--------------------------------\n");
            System.out.println("    Student #" + Student.incrementCount() + "\n");
            s[j].displayInfo();
        }
        System.out.println("Number of students: "+ N);

    }
}


