package ProductManagement.sources.app;

import java.math.BigDecimal;
import ProductManagement.sources.data.Product;
import ProductManagement.sources.data.Rating;

public class Shop {
  public static void main(String[] args) {
    Product p1 = new Product(100, "Coffee", BigDecimal.valueOf(0.56));
    Product p2 = new Product(101, "Tea", BigDecimal.valueOf(1.99), Rating.THREE_STAR);
    Product p3 = new Product(102, "Cake", BigDecimal.valueOf(3.73), Rating.FIVE_STAR);
    Product p4 = new Product();
    Product p5 = p3.applyRating(Rating.TWO_STAR);

    System.out.println(p1.getId() + " " + p1.getName() + " " + p1.getPrice() + " " + p1.getDiscount() + " "
        + p1.getRating().getStars());
    System.out.println(p2.getId() + " " + p2.getName() + " " + p2.getPrice() + " " + p2.getDiscount() + " "
        + p2.getRating().getStars());
    System.out.println(p3.getId() + " " + p3.getName() + " " + p3.getPrice() + " " + p3.getDiscount() + " "
        + p3.getRating().getStars());
    System.out.println(p4.getId() + " " + p4.getName() + " " + p4.getPrice() + " " + p4.getDiscount() + " "
        + p4.getRating().getStars());
    System.out.println(p5.getId() + " " + p5.getName() + " " + p5.getPrice() + " " + p5.getDiscount() + " "
        + p5.getRating().getStars());
  }
}
