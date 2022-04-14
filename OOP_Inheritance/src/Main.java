import CircleCylinder.Circle;
import CircleCylinder.Cylinder;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();
//        dog.walk();
        dog.run();

        String s1 = "cat";
        String s2 = "cat";
        s2 = "dog";

        System.out.println(s2);
        System.out.println(s1);

        Circle myCir = new Circle(3.75);
        System.out.println("circle radius= " + myCir.getRadius());
        System.out.println("circle area= " + myCir.getArea());

        Cylinder myCli = new Cylinder(5.55, 7.25);
        System.out.println("Cylinder.radius = " + myCli.getRadius());
        System.out.println("Cylinder.height = " + myCli.getHeight());
        System.out.println("Cylinder.area = " + myCli.getArea());
        System.out.println("Cylinder.volume = " + myCli.getVolume());

    }

}
