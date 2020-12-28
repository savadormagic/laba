import java.util.ArrayList;
import java.util.List;

public class Shop{

    List<Drugs> pharmacy = new ArrayList<>();

    public void addOne(String n, String sup, String man, String shL, int am){
        Drugs d = new Drugs(n, sup, man, shL,am);
        pharmacy.add(d);
    }



    public String showCertain(int i){
        return ("Name: " + pharmacy.get(i).getName() + "\n"
                + "Supplier: " + pharmacy.get(i).getSupplier() + "\n"
                + "Manufacturer: " + pharmacy.get(i).getManufacturer() + "\n"
                + "ShelfLife: " + pharmacy.get(i).getShelfLife() + "\n"
                + "Amount: " + pharmacy.get(i).getAmount() + "\n\n");
    }

    public String showAll(){
        String allDr = "";
        for (int j = 0; j < pharmacy.size(); j++) {
            allDr += showCertain(j);
        }
        return allDr;
    }

    public void menu(){
        System.out.println("1 - add one\n" +
                "2 - show certain\n" +
                "3 - sell certain\n" +
                "4 - show all\n" +
                "0 - exit");
    }
}
