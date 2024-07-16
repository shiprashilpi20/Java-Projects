import java.util.Scanner;

public class Showroom implements utility{

    String showroon_name;
    String showroom_address;
    String manager_name;
    int total_cars_in_stock;
    int total_employee;

    @Override
    public void get_details() {
        System.out.println("Showroom Name: "+showroon_name);
        System.out.println("Showroom Address: "+showroom_address);
        System.out.println("Manager Name: "+manager_name);
        System.out.println("Total Cars in Stock Available: "+total_cars_in_stock);
        System.out.println("Total Number Of Employees: "+total_employee);

    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("============= *** ENTER SHOWROOM DETAILS *** ================");
        System.out.println();
        System.out.println("SHOWROOM NAME: ");
        showroon_name=sc.nextLine();
        System.out.println("SHOWROOM ADDRESS: ");
        showroom_address=sc.nextLine();
        System.out.println("MANAGER ADDRESS: ");
        manager_name=sc.nextLine();
        System.out.println("TOTAL CARS IN STOCK: ");
       total_cars_in_stock=sc.nextInt();
        System.out.println("TOTAL NUMBER OF EMPLOYEES: ");
        total_employee=sc.nextInt();
    }
}
