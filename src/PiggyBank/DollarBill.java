package piggybank;

public class DollarBill extends AbstractMoney {

    public DollarBill() {
        super(1.00, 1, "Dollar");
    }

    public DollarBill(int inventory) {
        setInventory(inventory);
        setDenomination(1.00);
        if (inventory > 1)
            setName("Dollars");
    }

    @Override
    public String toString() {
        return "$" + getInventory();
    }
}