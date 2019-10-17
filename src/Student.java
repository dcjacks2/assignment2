public class Student { //initializers
    private int ID;
    private int standing;
    private int zip;
    private String state;
    private String city;
    private String address;
    private String fName;
    private String lName;
    private String email;
    private static int scount;

    public void setValues(int i1, int i2, int i3, String s1, String s2, String s3, String s4, String s5, String s6 ){
        ID = i1;
        standing = i2;
        zip = i3;
        state = s1;
        city = s2;
        address = s3;
        fName = s4;
        lName = s5;
        email = s6;
    }
    public void getValues(){
        System.out.println("ID: ");
        System.out.println("Standing: ");
        System.out.println("Zip: ");
        System.out.println("State: ");
        System.out.println("City: ");
        System.out.println("Address: ");
        System.out.println("First Name: ");
        System.out.println("Last Name: ");
        System.out.println("Email: ");
    }




}
