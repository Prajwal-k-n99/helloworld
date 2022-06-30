class Empl{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
public class employee {
    public static void main(String[] args) {
       Empl ab = new Empl();
       ab.setName("prajwal");
       ab.setSalary(15000);
        System.out.println(ab.getName());
        System.out.println(ab.getSalary());
    }
}
