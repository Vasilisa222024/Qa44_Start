package experiments;

public class Person {
    private String name;
    private  String lastname;

    public Person(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
  public  void display(){
      System.out.println("Name:"+name+" "+"LastName:"+lastname);
  }

}
