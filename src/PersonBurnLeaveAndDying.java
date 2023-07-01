
public class PersonBurnLeaveAndDying {
    public static void main(String[] args) throws InterruptedException {
        Person mishel = new Person("Michel", 88);
        mishel.burn();
        mishel.isRising();
        mishel.dead();
    }
}
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void burn() throws InterruptedException {
        System.out.println(name + " burns");
        Thread.sleep(200);
    }
    void isRising() throws InterruptedException {
        for (int i = 0; i <= age; i++) {
            System.out.println(name + " now is " + i + " years old.");
            Thread.sleep(200);
        }
    }
    void dead() {
        System.out.println(name + " is dead at " + age + " year old.");
    }
}