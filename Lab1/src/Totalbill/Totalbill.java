package Totalbill;
import java.util.Scanner;
public class Totalbill {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    float bill;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the bill amount ");
    bill = sc.nextFloat();
    double discount1, discount2, newbill;
    if(bill > 1000) {
      discount1 = (0.10 * bill);
      newbill = (bill - discount1);
    }else {
      discount2 = (0.05 * bill);
      newbill = (bill - discount2);
    }
    double GST = (0.11 * bill);
    double MC = (0.9 * bill);
    double TotalBill = (newbill + GST + MC);
    System.out.println("Bill " + bill);
    System.out.println("GST " + GST);
    System.out.println("Maintenance Charge " + MC);
    System.out.println("Total Bill is " + TotalBill);
  }

}
