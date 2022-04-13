public class Dog extends Animal { // extends means inherit

    // fields relevant to the Dog class
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        // super refers to the parent class, we need to always call the constructor of the base-class
        // remember, each derived class has inherited class as a part of it.
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    private void chew() {
        System.out.println("Dog chew method called");
    }

    private void moveLegs(int speed) {
        System.out.println("Dog movelegs method called");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat method called");
        this.chew();
        super.eat(); // calling the method of the super(parent class) this is not mandatory, but often we would want
        // to do that if some base value needs to be initialized or it we want to run basic method in the base class
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog move method was called");
        moveLegs(speed);
        super.move(speed);
    }

    public void walk() {
        System.out.println("Dog walk method called");
        move(5); // what's the difference between move and super.move()? move() will first look for
        // @Overriden method in the derived class before looking for it in the base class. super.move() will call the
        // base class move method directly and not look for the method in the derived class
    }

    public void run() {
        System.out.println("Dog run method called");
        move(10);
    }

}
