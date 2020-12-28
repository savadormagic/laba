
public class Drugs {

    private String name;
    private String supplier;
    private String manufacturer;
    private String shelfLife;
    private int amount;

    public Drugs(String name, String supplier, String manufacturer, String shelfLife, int amount) {
        this.name = name;
        this.supplier = supplier;
        this.manufacturer = manufacturer;
        this.shelfLife = shelfLife;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public String getSupplier() {
        return supplier;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getShelfLife() {
        return shelfLife;
    }

    public int getAmount() {
        return amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setShelfLife(String shelfLife) {
        this.shelfLife = shelfLife;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return name + " "
                + supplier + " "
                + manufacturer + " "
                + shelfLife + " "
                + amount;
    }
}
