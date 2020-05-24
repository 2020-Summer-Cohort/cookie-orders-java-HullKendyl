package cookies;

public class OrderApp {
    public static void main(String[] args) {

        CookieOrder order1 = new CookieOrder("Thin Mints", 4);
        CookieOrder order2 = new CookieOrder("Thin Mints", 2);
        CookieOrder order3 = new CookieOrder("Tagalong", 5);
        CookieOrder order4 = new CookieOrder("Samoas", 1);

        MasterOrder master = new MasterOrder();

        master.addOrder(order1);
        master.addOrder(order2);
        master.addOrder(order3);
        master.addOrder(order4);

        master.showOrder();

        master.removeVariety("Thin Mints");
        System.out.println(" ");
        System.out.println("After removal:");

        master.showOrder();

        System.out.println("total orders: " +
                master.getOrders().size());
        System.out.println("total boxes: " +
                master.getTotalBoxes());

    }
}
