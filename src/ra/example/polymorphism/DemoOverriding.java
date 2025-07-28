package ra.example.polymorphism;

public class DemoOverriding extends SuperClass {
    @Override
    public int add(int num1, int num2) {
        return super.add(num1, num2) * 2;
    }
}
