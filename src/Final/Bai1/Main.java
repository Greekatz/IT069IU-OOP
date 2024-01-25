package Final.Bai1;

public class Main {
    private static PriceStrategy priceStrategy;
    private static TaxStrategy taxStrategy;
    public static void main(String[] args) {
        Adult adult = new Adult();
        TicketSale ticketSale = new TicketSale();
        System.out.println(adult.getAmt());

    }
}
