class Salary
 {
    int budget;
    String dept;
 
      Salary(String dept,int budget)
        {
            this.budget=budget;
            this.dept=dept;
        }
     public void displaySalary()
     {
        System.out.println("Salary"+budget);
        System.out.println("Department"+dept);
     }
 }
 
 
class Company
 {
    String name,city;
    Salary sal;
 
    Company(String name,String city,Salary sal)
    {
        this.name=name;
        this.city=city;
        this.sal=sal;
    }
 
    public void displayCompany()
        {
            System.out.println("Name of the company"+name);
            System.out.println("city"+city);
            sal.displaySalary();
        }
 
 }
 
 class demoStudent
  {
      public static void main(String[] args) {
          Salary a1=new Salary("Learning & Development",87456);
          Company s1=new Company("I-Exceed","Bengaluru",a1);
          s1.displayCompany();
 
      }
  }
 