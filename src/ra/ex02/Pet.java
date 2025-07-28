package ra.ex02;

import java.util.Scanner;
import java.util.regex.Pattern;

public abstract class Pet {
    private String petId;
    private String petName;
    private int petAge;

    public Pet() {
    }

    public Pet(String petId, String petName, int petAge) {
        this.petId = petId;
        this.petName = petName;
        this.petAge = petAge;
    }

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public void inputData(Scanner scanner){
        System.out.println("NHap vao thong tin thu cung ");
        String petIdRegex = "[CD]\\d{3}";
        System.out.println("Nhap vao ma thu cung ");
        do {
            String petId = scanner.nextLine();

            if(Pattern.matches(petIdRegex,petId)){
                // kiem tra xem da ton tai hay chua
                boolean isExist = false;
                for (Pet pet : PetManagement.petList) {
                    if(pet.getPetId().equals(petId)){
                        isExist = true;
                        break;
                    }
                }
                if(isExist){
                    System.err.println("Ma thu cung da ton tai vui long nhap lai");
                } else {
                    this.petId = petId;
                    break;
                }
            } else {
                System.err.println("ma thu cung phai 4 ky tubat dau C | D , 3 ky tu sau le sô ");
            }
        }while (true);


        //System.out.println("Nhap thong tin tiep theo .... ");
    }
    public void displayData(){
        System.out.printf("Ma thu cung: %s ",this.petId);
    }

    public abstract void speak();
}
