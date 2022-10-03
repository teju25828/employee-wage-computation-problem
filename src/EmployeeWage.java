public class EmployeeWage {
    public static void main(String[] args) {

        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROBLEM...");
        int wagePerHour = 20, fullDayHour = 8, wagePerDay, partTimeHour = 4, workingDaysPerMonth = 20;
        int rand, wagesForMonth = 0;

        /*if (rand == 1) {
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
        }*/
        int i = 0;
        while (i < workingDaysPerMonth) {
            rand = (int) (Math.random() * 3);
            switch (rand) {
                case 0:
                    System.out.println("Day " + (i + 1) + " employee is Absent");
                    break;
                case 1:
                    System.out.println("Day " + (i + 1) + " employee is present");
                    wagePerDay = wagePerHour * fullDayHour;
                    wagesForMonth = wagesForMonth + wagePerDay;
                    System.out.println("wage for day=> " + wagePerDay);
                    break;
                case 3:
                    System.out.println("Day " + (i + 1) + " Employee working as part time ");
                    wagePerDay = wagePerHour * partTimeHour;
                    wagesForMonth = wagesForMonth + wagePerDay;
                    System.out.println("wage for day=> " + wagePerDay);
                    break;
            }
        }
        System.out.println("The total wage for the month is : "+wagesForMonth);
    }
}
