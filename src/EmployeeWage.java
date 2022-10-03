public class EmployeeWage {
    public static void main(String[] args) {

        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROBLEM...");
        int wagePerHour=20,fullDayHour=8, wagePerDay;
        int rand = (int) (Math.random() * 2);
        System.out.println(rand);
        if (rand == 1) {
            System.out.println("employee is present");
            wagePerDay=wagePerHour*fullDayHour;
            System.out.println("wage for day=> "+wagePerDay);
        } else {
            System.out.println("employee is absent");
        }



    }
}
