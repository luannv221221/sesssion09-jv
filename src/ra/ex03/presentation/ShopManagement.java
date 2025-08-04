package ra.ex03.presentation;

import ra.ex03.entity.Category;
import ra.ex03.entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopManagement {
    private static final List<Category> categories = new ArrayList<>();
    private static final List<Product> products = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n******************SHOP MENU*******************\n" +
                    "\n" +
                    "1 .Quản lý danh mục sản phẩm\n" +
                    "\n" +
                    "2. Quản lý sản phẩm\n" +
                    "\n" +
                    "3. Thoát");
            System.out.println("moi ban lua chon 1 - 3 ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    boolean back = true;
                    do {
                        System.out.println("\n********************CATEGORIES MENU***********\n" +
                                "\n" +
                                "1. Nhập thông tin các danh mục\n" +
                                "\n" +
                                "2. Hiển thị thông tin các danh mục\n" +
                                "\n" +
                                "3. Cập nhật thông tin danh mục\n" +
                                "\n" +
                                "4. Xóa danh mục\n" +
                                "\n" +
                                "5. Cập nhật trạng thái danh mục\n" +
                                "\n" +
                                "6. Thoát");
                        System.out.println("Moi chon 1-6");
                        int choiceCategoryMenu = Integer.parseInt(scanner.nextLine());
                        switch (choiceCategoryMenu){
                            case 1:
                                createCategory(scanner);
                                break;
                            case 2:
                                displayCategories();
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                back = false;
                                break;
                            default:
                                System.out.println("chon la 1 -6 ");
                        }
                    }while (back);
                    break;
                case 2:
                    showMenuProduct(scanner);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.err.println("Vui long chon 1-3");

            }
        } while (true);
    }

    // phuong thuc tao danh muc
    public static void createCategory(Scanner scanner){
        System.out.println("Ban muon them moi bao nhieu danh muc");
        int numberCategory = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberCategory; i++) {
            Category category = new Category();
            category.inputData(scanner,categories);
            categories.add(category);
        }
    }
    public static void displayCategories(){
        System.out.println("Danh sach danh muc ");
        for (Category category : categories) {
            category.displayData();
            System.out.println(" ");
        }
    }

    // phuong thuc show menu product
    public static void showMenuProduct(Scanner scanner){
        boolean checkExitMenu = true;

        do {
            System.out.println("\n *******************PRODUCT MANAGEMENT*****************\n" +
                    "\n" +
                    "1. Nhập thông tin các sản phẩm\n" +
                    "\n" +
                    "2. Hiển thị thông tin các sản phẩm\n" +
                    "\n" +
                    "3. Sắp xếp các sản phẩm theo giá\n" +
                    "\n" +
                    "4. Cập nhật thông tin sản phẩm theo mã sản phẩm\n" +
                    "\n" +
                    "5. Xóa sản phẩm theo mã sản phẩm\n" +
                    "\n" +
                    "6. Tìm kiếm các sản phẩm theo tên sản phẩm\n" +
                    "\n" +
                    "7. Tìm kiếm sản phẩm trong khoảng giá a – b (a,b nhập từ bàn phím)\n" +
                    "\n" +
                    "8. Thoát");
            System.out.println("Moi ban nhap vao lua chon (1-8)");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    createProducts(scanner);
                    break;
                case 2:
                    displayProducts();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    checkExitMenu = false;
                    break;
                default:
                    System.err.println("Vui long chon lai ");
            }
        } while (checkExitMenu);
    }

    // phuong thuc them moi san pham
    public static void createProducts(Scanner scanner){
        System.out.println("Ban muon them moi bao nhieu san pham : ");
        int numberProduct = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberProduct; i++) {
            Product product = new Product();
            product.inputData(scanner,products,categories);
            products.add(product);
        }
    }
    // phuong thuc in danh sach san pham
    public static void displayProducts(){
        System.out.println("Danh sach san pham ");
        for (Product product : products) {
            product.displayData(); System.out.println("Ten danh muc: "+product.getCategoryById(categories,product.getCatalogId()).getCatalogName());;
        }
    }
}
