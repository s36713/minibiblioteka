public class Main {
    public static void main(String[] args) {
        Ksiazka Dzuma = new Ksiazka("Dzuma", "Albert Camus", 312, true);
        Ksiazka Hobbit = new Ksiazka("Hobbit", "J.R.R. Tolkien", 456, true);
        Ksiazka HarryPotter = new Ksiazka("Harry Potter.", " J.K.Rowling", 320, true);

        System.out.println("Informacje");
        Dzuma.wypiszInfo();
        Hobbit.wypiszInfo();
        HarryPotter.wypiszInfo();

    }

}