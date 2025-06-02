public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ean Craig", 11);
        Person person2 = new Person("Evan Ross", 12);

        person1.greet();
        person2.greet();

        person1.setAge(14);
        person2.setName("Lewis Jordan");
        person2.setAge(12);

        System.out.println("\nSet new age and name:");
        person1.greet();
        person2.greet();
    }
}
