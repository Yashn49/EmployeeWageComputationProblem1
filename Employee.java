import java.util.*;
public class Employee
{
 public static void main(String[] args)
 {
  System.out.println("Welcome to Employee Wage Computation Problem");
  Employee e=new Employee();
  int ch=e.random;
  switch(ch)
  {
  case 0:
   e.check();
   break;
  case 1:
   e.part();
   break;
  }
 }
  Random r=new Random();
  int random=r.nextInt(2);
  int part=r.nextInt(2);
 public void check()
 {
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
 public void part()
 {
  if(part==1)
  {
   System.out.println("Employee is working parttime");
   System.out.println("Wage/Hr=20 and Parttimehours=8");
   int wage=20*8;
   System.out.println("PARTTIMEWAGE WILL BE="+ wage);
  }
  else
  {
   System.out.println("EMPLOYEE IS NOT DOING PART TIME TODAY");
  }
 }
}

