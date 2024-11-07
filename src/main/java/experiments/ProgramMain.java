package experiments;

public class ProgramMain {
    public static void main(String[] args) {
       Person tom=new Person("Tom","Wais") ;
       tom.display();
       Employee sam=new Employee("Sam","Good","MMM");
       sam.display();
       sam.work();
       
        Person nick = new Employee (  "Nick",  "Bor",
                 "Oracle");
        nick. display();
    }
}
