import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GUIT t = new GUIT();
        t.setVisible(true);
       /* new Main().done();*/
    }
    public void done(){
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        shop.menu();
        int choice = scanner.nextInt();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    System.out.println("well, input by this instruction:\n" +
                            "name of drug\n" +
                            "supplier\n" +
                            "manufacturer\n" +
                            "shelf life on drug\n" +
                            "amount");
                    /*shop.addOne();*/
                    shop.menu();
                    choice = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("which?");
                    int c = scanner2.nextInt();
                    shop.showCertain(c);
                    shop.menu();
                    choice = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("which one?");
                    c = scanner2.nextInt();
                    /*shop.sell(c);*/
                    shop.menu();
                    choice = scanner.nextInt();
                    break;
                case 4:
                    /*shop.showAll();*/
                    shop.menu();
                    choice = scanner.nextInt();
                    break;
            }
        }
    }
}
