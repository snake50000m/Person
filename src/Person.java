public class Person {
    private String fullName;
    private int age;
    public Person() {
        this.fullName = "Данилл";
        this.age = 20;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move(){
        System.out.println(getFullName() + " движется");
    }
    public void talk(){
        System.out.println(getFullName() + " говорит");
    }

    @Override
    public String toString() {
        return "Полное имя: " + fullName +
                "\nВозраст: " + age +
                "\n--------------------------";
    }
}
