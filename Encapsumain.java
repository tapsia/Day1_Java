package oops;

public class Encapsumain{
    public static void main(String args[]){
         Encapsulation1 obj = new Encapsulation1();
         obj.setEmpName("Taps");
         obj.setEmpAge(26);
         obj.setBFName("Hero");
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee Age: " + obj.getEmpAge());
         System.out.println("Bf name is: " + obj.getBFName());
    } 
}
