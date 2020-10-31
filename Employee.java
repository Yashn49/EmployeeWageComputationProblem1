import java.util.*;
public class Employee
{
 public static void main(String[] args)
 {
  System.out.println("Welcome to Employee Wage Computation Problem");
  Random r=new Random();
  int random=r.nextInt(2);
  System.out.println(random);
  if(random==1)
  {
   System.out.println("Employee is present");
  }
  else
  {
   System.out.println("Employee is absent");
  }
 }
}
