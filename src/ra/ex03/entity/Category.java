package ra.ex03.entity;

import ra.ex03.itf.IShop;

import java.util.List;
import java.util.Scanner;

public class Category implements IShop {
    private int catalogId;
    private String catalogName;
    private String description;
    private Boolean catalogStatus;

    public Category() {
    }

    public Category(int catalogId, String catalogName, String description, Boolean catalogStatus) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.description = description;
        this.catalogStatus = catalogStatus;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(Boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }

    public void inputData(Scanner scanner, List<Category> categories){
        // nhap catelogId
        // tu tang (Khong can nhap va tu dong them 1)
        // lay ve do kich thuoc cua list danh muc
        int sizeCategories = categories.size();
        this.catalogId = sizeCategories + 1;

        // nhap du lieu cho catalogName
        System.out.println("Nhap vao ten danh muc");
        this.catalogName = scanner.nextLine();
        System.out.println("Nhap vao mo ta");
        this.description = scanner.nextLine();
        System.out.println("Nhap vao trang thai danh muc");
        this.catalogStatus = Boolean.parseBoolean(scanner.nextLine());

    }
    @Override
    public void displayData() {
        System.out.printf("\n ID: %d Name: %s Dess: %s status: %s \n",
                this.catalogId,this.catalogName,this.description, this.catalogStatus ? "active":"Inactive");

    }
}
