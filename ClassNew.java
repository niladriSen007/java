
class InnerClass {
    private int age;
    private String name;

    InnerClass(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printDetails() {
        System.out.printf("%s is %d years old", this.name, this.age);
    }
}

public class ClassNew {

    public static void main(String[] args) {
        InnerClass i1 = new InnerClass("Niladri", 24);
        int getAge = i1.getAge();
        System.out.println(getAge);
        i1.printDetails();
    }
}
