import java.util.Scanner;

interface utility{
    public void get_details();
    public void set_details();
}


public class Main {
    static void main_menu(){
        System.out.println();
        System.out.println("======= **** WELCOME TO SHOWROOM **** ========");
        System.out.println();
        System.out.println("*** ENTER YOUR CHOICE ***");
        System.out.println();
        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS");
        System.out.println();
        System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET CARS");
        System.out.println();
        System.out.println("ENTER 0 TO EXIT");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom showroom[] = new Showroom[5];
        Cars cars[] = new Cars[100];
        Employees emp[] = new Employees[100];
        int car_counter=0;
        int showroom_counter=0;
        int employees_counter=0;
        int choice = 100;
        while(choice!=0){
            main_menu();
            choice = sc.nextInt();
            while(choice!=9 && choice!=0){
                switch (choice){
                    case 1:
                        showroom[showroom_counter]= new Showroom();
                        showroom[showroom_counter].set_details();
                        showroom_counter++;
                        System.out.println();
                        System.out.println("1].ADD NEW SHOWROOM");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice=sc.nextInt();
                        break;
                    case 2:
                        cars[car_counter]= new Cars();
                        cars[car_counter].set_details();
                        car_counter++;
                        System.out.println();
                        System.out.println("1].ADD NEW CAR");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice=sc.nextInt();
                        break;
                    case 3:
                        emp[employees_counter]= new Employees();
                        emp[employees_counter].set_details();
                        employees_counter++;
                        System.out.println();
                        System.out.println("1].ADD NEW EMPLOYEE");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice=sc.nextInt();
                        break;

                }
            }
        }

        System.out.println("");
    }
}