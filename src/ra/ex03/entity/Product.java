package ra.ex03.entity;

import ra.ex03.itf.IShop;

import java.util.List;
import java.util.Scanner;

public class Product implements IShop {
    private String productId;
    private  String productName;
    private float price;
    private String description;
    private int catalogId;
    private Boolean productStatus;

    public Product() {
    }

    public Product(String productId, String productName, float price, String description, int catalogId, Boolean productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.catalogId = catalogId;
        this.productStatus = productStatus;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        catalogId = catalogId;
    }

    public Boolean getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Boolean productStatus) {
        this.productStatus = productStatus;
    }

    public void inputData(Scanner scanner, List<Product> products,List<Category> categories){
        System.out.println("Nhap vao ma san pham");
        this.productId = scanner.nextLine();
        System.out.println("Nhap vao ten san pham");
        this.productName = scanner.nextLine();
        System.out.println("Nhap vao gia san pham");
        this.price = Float.parseFloat(scanner.nextLine());
        System.out.println("Danh muc san pham ");
        for (Category category : categories) {
            category.displayData();
        }
        do {
            System.out.println("Lua chon ma danh muc ");
            int catalogId = Integer.parseInt(scanner.nextLine());
            if(getCategoryById(categories,catalogId) != null){
                this.catalogId = catalogId;
                break;
            }
            System.err.println("Khong ton tai ma danh muc vui long chon lai");
        } while (true);

        System.out.println("Trang thai san pham ");
        this.productStatus = Boolean.parseBoolean(scanner.nextLine());
    }

    // get danh muc theo id
    public Category getCategoryById(List<Category> categories,int catalogId){
        for (Category category : categories) {
            if(category.getCatalogId() == catalogId){
                return category;
            }
        }
        return null;
    }
    @Override
    public void displayData() {
        System.out.printf("ID: %s Name: %s Price: %f ",this.productId,this.productName,this.price);

    }
}
