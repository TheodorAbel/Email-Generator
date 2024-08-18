package EmailPackage;

import java.util.Scanner;

public class Email {
    private String firstname;
    private String lastname;
    private String email;
    private String department;
    private int mailboxCapacity=500;
    private int defaultpasswordlength=8;
    private String alternateEmail;
    private String password;
    private String CompanySuffix="company.com";

    public Email(String firstname,String lastname){
        this.firstname=firstname;
        this.lastname=lastname;
       // System.out.println("This is "+firstname+" "+lastname);
        this.department=setDepartment();
        //System.out.println("Department "+this.department);
        this.password=generatepassword(defaultpasswordlength);
        System.out.println("Your password is "+this.password);
        email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+CompanySuffix;
        //System.out.println("Your email is "+email);

    }
    //Ask for the department
    private String setDepartment() {
        System.out.print("Department Code\n1.For Sales\n2.For Development\n3.For Accounting\n0.None\nEnter Department Code: ");
        Scanner in = new Scanner(System.in);
        int Depcode = in.nextInt();
        if (Depcode == 1) {
            return "sales";
        } else if (Depcode == 2) {
            return "Dev";
        } else if (Depcode == 3) {
            return "Acc";
        } else {
            return "";
        }
    }
    //Generate random password
    private String generatepassword(int length){
        String passwordset="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password=new char[length];
        for (int i=0;i<length;i++){
            int rand=(int)(Math.random()*passwordset.length());
            password[i]=passwordset.charAt(rand);
        }
        return new String(password);
    }
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity=capacity;
    }
    public void setAlternateEmail(String altemail){
        alternateEmail=altemail;
    }
    public void changepassword(String password){
        this.password=password;
    }

    public int getMailboxCapacity(){
        return mailboxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getPassword(){
        return password;
    }
    public String showInfo(){
        return "NAME: "+firstname+" "+lastname+"\nCOMPANY EMAIL: "+email+"\nMAILBOX CAPACITY: "+mailboxCapacity+"md";
    }

    }