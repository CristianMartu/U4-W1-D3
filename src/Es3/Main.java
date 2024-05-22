package Es3;

public class Main {
    public static void main(String[] args) {
        Customer profile = new Customer("myprofile@gmail.com", "Poretti", "Giacomo");
        Article book = new Article(30, "Game Of Thrones", 1);
        Article book2 = new Article(20, "The Witcher", 1);
        Article[] articles = {book, book2};
        Cart cart = new Cart(profile);
        cart.setArticles(articles);

        System.out.println("Total: " + cart.getTotal() + " €");
        cart.getCustomer().printCustomer();
        cart.getArticles();
    }
}
