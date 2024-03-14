class Emp{
    int salary;
    String name;
       public int getSalary(){
        return salary;
       }

       Emp(){
            this.salary=500;
            this.name="prasham";
       }
       Emp(Emp old){
            this.salary=old.salary;
       }
}

public class Employee{
    public static void main(String[] args) {
        Emp e = new Emp();
        Emp e1 = new Emp(e);
        System.out.println(e1.salary);
    }


}