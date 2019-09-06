package piggybank;

public abstract class AbstractMoney {
    private double denomination;
    private int inventory;
    private String name;

    public AbstractMoney(double denomination, int inventory, String name) {
        this.denomination = denomination;
        this.inventory = inventory;
        this.name = name;
    }

    //constructor
    public AbstractMoney() {
        inventory = 1;
    }

    //Getters
    public double getDenomniation() {
        return denomination;
    }

    public int getInventory() {
        return inventory;
    }

    public String getName() {
        return name;
    }

    //Setters

    public void setDenomination(double denomination) {
        this.denomination = denomination;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
      }
    
      public void setName(String name) {
        this.name = name;
      }

      //methods
      public double getSum() {
          return inventory * denomination;
      }

      @Override
      public String toString() {
          return inventory + " " + name;
      }
}