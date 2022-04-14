public class DeskPhone implements ITelephone{
    //
    public int myNumber;
    public boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("The ethernet cable is connected and adopter is plugged in");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Calling number " + phoneNumber + " using the number pad on the phone's body");

    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("The receiver needs to be picked up to answer.");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Ring Ring");
        } else {
            isRinging = false;
        }

        return isRinging;

    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    public int getMyNumber() {
        return myNumber;
    }

    public void setMyNumber(int myNumber) {
        this.myNumber = myNumber;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }
}
