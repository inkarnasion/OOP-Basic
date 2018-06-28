package inheritance_exercises.bookShop_02;



public class Book {
    private String title;
    private String author;
    private double price;

    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public double getPrice() {
        return this.price;
    }
    public Book(String author, String title, double price) {
        this.setAuthor(author);
        this.setTitle(title);
        this.setPrice(price);
    }

    protected void setAuthor(String author) {
        String[] splitted = author.split(" ");
        if(splitted.length==2){
            char[] secondNameChar = splitted[1].toCharArray();
            if (secondNameChar[0] == '0' ||
                    secondNameChar[0] == '1' ||
                    secondNameChar[0] == '2' ||
                    secondNameChar[0] == '3' ||
                    secondNameChar[0] == '4' ||
                    secondNameChar[0] == '5' ||
                    secondNameChar[0] == '6' ||
                    secondNameChar[0] == '7' ||
                    secondNameChar[0] == '8' ||
                    secondNameChar[0] == '9') {
                throw new IllegalArgumentException("Author not valid!");
            } else {
                this.author = author;
            }
        }else{
            this.author = author;
        }
    }

    protected void setTitle(String title) {
        if (title.length() <= 2) {
            throw new IllegalArgumentException("Title not valid!");
        } else {
            this.title = title;
        }
    }

    protected void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price not valid!");
        } else {
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return String.format("Type: Book\nTitle: %s\nAuthor: %s\nPrice: %.1f\n",
                getTitle(),getAuthor(),getPrice());
    }
}
