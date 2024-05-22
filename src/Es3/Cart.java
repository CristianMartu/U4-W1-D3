package Es3;

public class Cart {
    private Customer customer;
    private Article[] articles;
    private int total;

    public Cart(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void getArticles() {
        for (Article article : articles) {
            article.printArticle();
        }
    }

    public void setArticles(Article[] articles) {
        this.articles = articles;
    }

    public int getTotal() {
        for (Article article : articles) {
            this.total += article.getPrice();
        }
        return total;
    }

}

