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
  Employee e=new Employee();
  e.check();
 }
 public void check()
 {
  Random r=new Random();
  int random=r.nextInt(2);
  if(random==1)
  {
   System.out.println("Employe is present");
   System.out.println("Wage/Hr=20 and Fulldayhours=8");
   int wage=20*8;
   System.out.println("Wage =" + wage);
  }
  else
  {
   System.out.println("Employee is absent");
  }
 }
}
