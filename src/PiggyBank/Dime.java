package piggybank;

public class Dime extends AbstractMoney {

  public Dime() {
    super(0.10, 1, "Dime");
  }

  public Dime(int inventory) {
    setInventory(inventory);
    setDenomination(0.10);
    if (inventory > 1)
      setName("Dimes");
  }
}