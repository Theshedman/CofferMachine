
class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        // swap two Person objects
        Person temp = new Person();
        temp.name = p1.name;
        temp.age = p1.age;

        p1.name = p2.name;
        p1.age = p2.age;

        p2.name = temp.name;
        p2.age = temp.age;
    }
}
