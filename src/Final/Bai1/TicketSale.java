package Final.Bai1;

public class TicketSale implements PriceStrategy, TaxStrategy {
    private PriceStrategy priceStrategy;
    private TaxStrategy taxStrategy;



    @Override
    public double getAmt() {
        return priceStrategy.getAmt() + taxStrategy.getAmt();
    }

}
