import java.util.Scanner;

public class Student { //initializers
    private String ID;
    private String standing;
    private String zip;
    private String state;
    private String city;
    private String address;
    private String fName;
    private String lName;
    private String email;
    private static int count;
    public static Scanner scan = new Scanner(System.in);

    public static String stringValidation(String name) {


        String correctString = name;
        int length = name.length();


        for(int i = 0; i < length; i++){
            if((Character.isLetter(name.charAt(i)))){
                continue;
            }
            else {
                System.out.println("ERROR --- Please enter only letters. Re-enter string here: ");
                correctString = scan.nextLine();
                name = correctString;
                length = name.length();
                i = 0;
            }
        }

        return correctString;

    }

    public static String IDValidation(String ID){
        String correctInt = ID;
        int length = ID.length();

        for(int i = 0; i < length; i++){
            if((Character.isDigit(ID.charAt(i))) && length <= 7){
                continue;
            }
            else {
                System.out.println("ERROR --- Please enter only a 7 digit ID. Re-enter ID here: ");
                correctInt = scan.nextLine();
                ID = correctInt;
                length = ID.length();
                i = 0;
            }
        }

        return correctInt;

    }






    public void setValues(String i1, String s7, String i3, String s1, String s2, String s3, String s4, String s5, String s6 ){
        ID = i1;
        standing = s7;
        zip = i3;
        state = s1;
        city = s2;
        address = s3;
        fName = s4;
        lName = s5;
        email = s6;
    }
    public void displayInfo(){

        System.out.println("\tFirst Name: "+ fName);
        System.out.println("\tLast Name: "+ lName);
        System.out.println("\tID: " + ID);
        System.out.println("\tStanding: "+ standing);
        System.out.println("\tZip: "+ zip);
        System.out.println("\tState: "+ state);
        System.out.println("\tCity: "+ city);
        System.out.println("\tAddress: "+ address);
        System.out.println("\tEmail: "+ email);
    }
    public static int incrementCount(){
        count = count+1;
        return(count);
    }




}
