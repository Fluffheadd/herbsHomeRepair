import java.util.Scanner;

public class JobPricing {

    public static void main(String[] args) {
        // vars and consts
        String jName;
        double trvRate = 12;
        double trvHrs;
        double mCost;
        double lbrHrs;
        double lbrRate = 35;
        double totalEst;
        // double trvlCost;

        // scanner object for userInput
        Scanner txt = new Scanner(System.in);

        // input phase - start of UI for app
        System.out.println("Enter the name of the job >> ");
        jName = txt.nextLine();

        System.out.println("Enter the cost of materials >> ");
        mCost = txt.nextDouble();

        System.out.print("Please enter the number of hours required to complete this job >> ");
        lbrHrs = txt.nextInt();

        System.out.println("Enter the travel hours required >> ");
        trvHrs = txt.nextDouble();
       
        totalEst = calcEst(mCost, trvRate, trvHrs, lbrRate, lbrHrs);
         //output phase
         System.out.println("To perform the project "+ jName + ", the total estimate is $" + totalEst + ".");
    }

    public static double calcEst(double mc, double tr, double th, double lr, double lh) {
        double total;
        
        total = (mc + (tr * th)) + (lr * lh);
        return total;
    }
        
           

}

// public double trvCost(double hrs, double rate) {
// double tCost;
// tCost = hrs * rate;
// return tCost;
// }

// public double calcEst(double t, double m) {
// estmt = t + m;
// return estmt;
// }
