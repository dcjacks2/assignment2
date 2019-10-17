import java.util.Scanner;
public class homework2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //int N;
        System.out.println("How many students Data will be entered?: ");
        //N = input.nextInt();
        Student[] s=new Student[2];
        System.out.println("Enter student details: ");
        for (int j=0; j<2; j++){
            s[j] = new Student();
            System.out.println("Enter ID: ");
            int id = input.nextInt();
            System.out.println("Enter Standing: ");
            input.nextLine();
            String standing = input.nextLine();
            System.out.println("Enter Zip: ");
            int zip = input.nextInt();
            System.out.println("Enter State: ");
            input.nextLine();
            String state = input.nextLine();
            System.out.println("Enter City: ");
            String city = input.nextLine();
            System.out.println("Enter Address: ");
            String address= input.nextLine();
            System.out.println("Enter First Name: ");
            String fname = input.nextLine();
            System.out.println("Enter Last Name: ");
            String lname = input.nextLine();
            System.out.println("Enter Email: ");
            String email = input.nextLine();
            s[j].setValues(id, standing, zip, state, city, address, fname, lname, email);

        }
        for (int j=0; j<2; j++){
            s[j].getValues();
        }

    }
}
