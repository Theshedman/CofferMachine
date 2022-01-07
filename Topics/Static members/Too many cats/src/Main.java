
class Cat {

    String name;
    int age;
    static int counter = 0;

    public Cat(String name, int age) {
        this.age = age;
        this.name = name;

        final int maxCounter = 5;
        counter++;

        if (counter > maxCounter) {
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        return counter;
    }
}
