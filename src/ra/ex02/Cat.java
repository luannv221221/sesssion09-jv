package ra.ex02;

public class Cat extends Pet{

    public Cat() {
    }

    public Cat(String petId, String petName, int petAge) {
        super(petId, petName, petAge);
    }

    @Override
    public void speak() {
        System.out.println("Meo Meo");
    }
}
