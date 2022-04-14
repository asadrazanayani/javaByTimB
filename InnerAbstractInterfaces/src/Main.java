public class Main {
    public static void main(String[] args) {

        ITelephone timsPhone;
//        DeskPhone timsPhone; is also valid and sometimes, we might need to do that.
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        Animal dog = new Dog("Golden Retriever", "Jim");

        dog.breathe();
        dog.eat();





    }
}
