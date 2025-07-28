package ra.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetManagement {
    public static List<Pet> petList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("*********************QUẢN LÝ THÚ CƯNG********************\n" +
                    "\n" +
                    "Hiển thị danh sách thú cưng\n" +
                    "\n" +
                    "Thêm thú cưng\n" +
                    "\n" +
                    "Gọi tiếng kêu\n" +
                    "\n" +
                    "Xóa thú cưng\n" +
                    "\n" +
                    "Tìm thú cưng theo tên\n" +
                    "\n" +
                    "Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    displayListPet();
                    break;
                case 2:
                    createPet(scanner);
                    break;
                case 3:
                    petSpeak();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.err.println("Vu long chon 1- 6");
            }
        }while (true);
    }

    public static void displayListPet(){
        for (Pet pet : petList) {
            pet.displayData();
        }
    }

    public static void createPet(Scanner scanner){
        System.out.println("Chon loai thu cung muon them  (1-Dog|2-Cat)");
        int choice = Integer.parseInt(scanner.nextLine());
        Pet pet;
        if(choice == 1){
            pet = new Dog();
            pet.inputData(scanner);
        } else {
            pet = new Cat();
            pet.inputData(scanner);
        }
        petList.add(pet);
    }

    public static void  petSpeak(){
        for (Pet pet : petList) {
            pet.speak();
        }
    }

}
