public class EmployeeWage {
    public static void main(String[] args) {

        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROBLEM...");
        int wagePerHour=20,fullDayHour=8, wagePerDay,partTimeHour=4;
        int rand = (int) (Math.random() * 3);
        System.out.println(rand);
        if (rand == 1) {
            System.out.println("employee is present");
            wagePerDay=wagePerHour*fullDayHour;
            System.out.println("wage for day=> "+wagePerDay);
        }else if(rand == 2 ){
            System.out.println("Employee working as part time ");
            wagePerDay=wagePerHour*partTimeHour;
            System.out.println("wage for day=> "+wagePerDay);
        }
        else {
            System.out.println("employee is absent");
        }
    }
}
