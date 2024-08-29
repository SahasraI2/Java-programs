class person{
    public void getFirstName(){
        System.out.println("Sahasra");
    }
    public void getLastName(){
        System.out.println("Gundu");
    }
class Employee extends person{
    public void EmployeeID(){
        System.out.println("23wh1a05i2");
    }
    public void getLastName(){
        System.out.println("Job Title:HOD");
    }
}
    public static void main(String[] args){
        person p1 = new person();
        Employee e1 = p1.new Employee();
        e1.EmployeeID();
        e1.getLastName();
    }

}
