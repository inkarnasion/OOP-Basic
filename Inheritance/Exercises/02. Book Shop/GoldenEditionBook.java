package inheritance_exercises.bookShop_02;



class GoldenEditionBook extends Book{
    public GoldenEditionBook(String author, String title, double price) {
        super(author, title, price * 1.30);
    }
    @Override
    public String toString() {
        return String.format("Type: GoldenEditionBook\nTitle: %s\nAuthor: %s\nPrice: %.1f",
                getTitle(),getAuthor(),getPrice());
    }

}
