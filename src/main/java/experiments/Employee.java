package experiments;

public class Employee extends Person{
    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Employee(String name, String lastname, String company) {
        super(name, lastname);
        this.company=company;
    }
    public void work()
    {
        System.out.println(getName()+" "+getLastname()+"works in "+" "+getCompany());
        System.out.println("mmm");
    }
}
