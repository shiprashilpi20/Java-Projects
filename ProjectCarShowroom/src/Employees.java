import java.util.Scanner;
import java.util.UUID;

public class Employees extends Showroom implements utility{

int emp_id;
String emp_name;
int emp_age;
String emp_dpt;

    @Override
    public void get_details() {
        System.out.println("ID: "+emp_id);
        System.out.println("Name: "+emp_name);
        System.out.println("Age: "+emp_age);
        System.out.println("Department: "+emp_dpt);
        System.out.println("Showroom Name: "+showroon_name);

    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        emp_id = Integer.parseInt(String.valueOf(uuid));
        System.out.println("======= *** ENTER EMPLOYEE DETAILS *** ==========");
        System.out.println();
        System.out.println("EMPLOYEE NAME: "+ emp_name);
        emp_name = sc.nextLine();
        System.out.println("EMPLOYEE AGE: "+ emp_age);
        emp_age = sc.nextInt();
        System.out.println("EMPLOYEE_DPT: "+ emp_dpt);
        emp_dpt = sc.nextLine();
        System.out.println("SHOWROOM NAME: "+ showroon_name);
        showroon_name = sc.nextLine();

    }
}
