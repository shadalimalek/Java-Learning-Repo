package day03_variables;

public class StaticCompany {
    String employeeName;
    static String companyName = "OpenAI";

    public void display() {
        System.out.println("Name: " + employeeName);
        System.out.println("Company: " + companyName);
    }

    public static void main(String[] args) {
        StaticCompany e1 = new StaticCompany();
        e1.employeeName = "Shad";
        e1.display();

        StaticCompany e2 = new StaticCompany();
        e2.employeeName = "HIHI";
        e2.display();
    }
}
