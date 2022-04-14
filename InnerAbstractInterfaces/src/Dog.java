public class Dog extends Animal {

    String breed;
    public Dog(String breed, String name) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println("Dog likes meat");
    }

    @Override
    public void breathe() {
        System.out.println("Dog breaths through nostrils");

    }
}
