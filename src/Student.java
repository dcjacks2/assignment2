public class Student { //initializers
    private int ID;
    private String standing;
    private int zip;
    private String state;
    private String city;
    private String address;
    private String fName;
    private String lName;
    private String email;
    private static int count;

    public void setValues(int i1, String s7, int i3, String s1, String s2, String s3, String s4, String s5, String s6 ){
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

        System.out.println("First Name: "+ fName);
        System.out.println("Last Name: "+ lName);
        System.out.println("ID: " + ID);
        System.out.println("Standing: "+ standing);
        System.out.println("Zip: "+ zip);
        System.out.println("State: "+ state);
        System.out.println("City: "+ city);
        System.out.println("Address: "+ address);
        System.out.println("Email: "+ email);
    }
    public static int incrementCount(){
        count = count+1;
        return(count);
    }




}
