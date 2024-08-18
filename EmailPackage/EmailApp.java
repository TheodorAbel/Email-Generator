package EmailPackage;

public class EmailApp {
    public static void main(String[] args) {
        Email em1=new Email("Abel","Theodros");
        em1.setAlternateEmail("abeltheodorr@gmail.com");
        System.out.println(em1.showInfo()
        );

    }
}
