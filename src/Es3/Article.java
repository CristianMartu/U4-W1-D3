package Es3;

import java.util.Random;

public class Article {
    private int id;
    private String description;
    private int price;
    private int quatity;

    public Article(int price, String description, int quatity) {
        Random rand = new Random();
        this.id = rand.nextInt(1, 50000);
        this.price = price;
        this.description = description;
        this.quatity = quatity;
    }

    public int getPrice() {
        return price;
    }

    public void printArticle() {
        System.out.println("Article id: " + this.id);
        System.out.println("Description: " + this.description);
        System.out.println("Price: " + this.price);
        System.out.println("Quantity: " + this.quatity);

    }
}
