package ra.example.abstraction;

public class Samsung implements IPhone,ISPhone{
    @Override
    public void call() {
        System.out.println("Sam sung trien khai nghe ");
    }

    @Override
    public void cam() {
        System.out.println("Trinh chup anh cua samsung ");
    }
}
