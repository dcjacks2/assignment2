import javax.swing.text.AttributeSet;
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

    public static String zipDigitvalidation(String Zip){
        String correctZip = Zip;
        int length = Zip.length();
        for(int i = 0; i< length; i++){
            if((Character.isDigit(Zip.charAt(i)))){
                continue;
            }
            else{
                System.out.println("ERROR --- Please enter a digit-only zip code (#########). Re-enter Zip here: ");
                correctZip = scan.nextLine();
                Zip = correctZip;
                length = Zip.length();
                i = 0;
            }
        }
        return correctZip;
    }

    public static String zipLengthvalidation(String zip){
        String correctZip = zip;
        int length = zip.length();

        for(int i = 0; i< length; i++){
            if(length > 9 || length < 9){
                System.out.println("ERROR --- Please enter a 9 digit-long zip code. Re-enter Zip here: ");
                correctZip = scan.nextLine();
                zip = correctZip;
                length = zip.length();
                i = 0;
            }
            else{
                continue;
            }
        }

        return correctZip;

    }

    public static String emailValidation(String email){

        String correctEmail = email;
        int length = email.length();

        for(int i = 0; i < length; i++){
            if(email.contains("@") && email.contains(".org")){
                continue;
            }
            if(email.contains("@") && email.contains(".edu")){
                continue;
            }
            if(email.contains("@") && email.contains(".com")){
                continue;
            }
            else {
                System.out.println("ERROR --- Please enter a valid email in the form <username>@<domain>.<edu,com,org> : ");
                correctEmail = scan.nextLine();
                email = correctEmail;
                length = email.length();
                i = 0;
            }
        }
        return correctEmail;
    }

    public static String addressValidation(String address){
        String correctAddress = address;

        String[] addressParse = address.split(" ");
        int length = addressParse[0].length();

        for(int i = 0; i < length; i++){
            if((Character.isDigit(addressParse[0].charAt(i)))){
                continue;
            }
            else {
                System.out.println("ERROR --- Please enter a valid address in the following format (1234 Main Street):");
                correctAddress = scan.nextLine();
                address = correctAddress;
                length = address.length();
                i = 0;
            }
        }

        return correctAddress;
    }

    public static String standingValidation(String standing){
        String correctStanding = standing;

        for(int i = 0; i < 2; i++){
            if(standing.equalsIgnoreCase("Freshman") || standing.equalsIgnoreCase("Sophomore") || standing.equalsIgnoreCase("Junior") || standing.equalsIgnoreCase("Senior")){
                continue;
            }
            else{
                System.out.println("ERROR --- Please enter either 'freshman', 'sophomore', 'junior', or 'senior'.:");
                correctStanding = scan.nextLine();
                standing = correctStanding;
                i = 0;
            }
        }
        return correctStanding;
    }
    public static String stateValidation(String state){
        String correctState = state;

        for(int i = 0; i < 2; i++){
            if(state.equalsIgnoreCase("AK") || state.equalsIgnoreCase("AL") || state.equalsIgnoreCase("AR") || state.equalsIgnoreCase("AZ") || state.equalsIgnoreCase("CA") || state.equalsIgnoreCase("CO") || state.equalsIgnoreCase("CT") || state.equalsIgnoreCase("DC") || state.equalsIgnoreCase("DE") || state.equalsIgnoreCase("FL")
            || state.equalsIgnoreCase("GA") || state.equalsIgnoreCase("HI") || state.equalsIgnoreCase("IA") || state.equalsIgnoreCase("ID") || state.equalsIgnoreCase("IL") || state.equalsIgnoreCase("IN") || state.equalsIgnoreCase("KS") || state.equalsIgnoreCase("KY") || state.equalsIgnoreCase("LA") || state.equalsIgnoreCase("MA")
            || state.equalsIgnoreCase("MD") || state.equalsIgnoreCase("ME") || state.equalsIgnoreCase("MI") || state.equalsIgnoreCase("MN") || state.equalsIgnoreCase("MO") || state.equalsIgnoreCase("MS") || state.equalsIgnoreCase("MT") || state.equalsIgnoreCase("NC") || state.equalsIgnoreCase("ND") || state.equalsIgnoreCase("NE")
            || state.equalsIgnoreCase("NH") || state.equalsIgnoreCase("NJ") || state.equalsIgnoreCase("NM") || state.equalsIgnoreCase("NV") || state.equalsIgnoreCase("NY") || state.equalsIgnoreCase("OH") || state.equalsIgnoreCase("OK") || state.equalsIgnoreCase("OR") || state.equalsIgnoreCase("PA") || state.equalsIgnoreCase("RI")
            || state.equalsIgnoreCase("SC") || state.equalsIgnoreCase("SD") || state.equalsIgnoreCase("TN") || state.equalsIgnoreCase("TX") || state.equalsIgnoreCase("UT") || state.equalsIgnoreCase("VA") || state.equalsIgnoreCase("VT") || state.equalsIgnoreCase("WA") || state.equalsIgnoreCase("WI") || state.equalsIgnoreCase("WV")
            || state.equalsIgnoreCase("WY")){
                continue;
            }
            else{
                System.out.println("ERROR --- Please enter your state in the following format of 'TX, GA, AL, etc.': ");
                correctState = scan.nextLine();
                state = correctState;
                i = 0;
            }
        }


        return correctState;
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
        System.out.println("\tEmail: "+ email);
        System.out.println("\tAddress: "+ address);
        System.out.println("\tCity: "+ city);
        System.out.println("\tState: "+ state);
        System.out.println("\tZip: "+ zip);

    }
    public static int incrementCount(){
        count = count+1;
        return(count);
    }




}
