package piggybank;

public class Quarter extends AbstractMoney {

    public Quarter() {
        super(0.25, 1, "Quarter");
    }

    public Quarter(int inventory) {
        setInventory(inventory);
        setDenomination(0.25);
        if (inventory > 1)
            setName("Quarters");
    }
}