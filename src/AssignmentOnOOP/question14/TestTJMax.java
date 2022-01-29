package AssignmentOnOOP.question14;

public class TestTJMax {

    public static void main(String[] args) {

        TJMaxx tjMaxx = new TJMaxx();
        OnSaleItem shoes = new OnSaleItem("shoes" , 12, 002, 23.99, 10);
        Item sneakers = new Item("Nike Jordan", 11, 8999, 99.99);
        Item joggers = new Item("Adidas", 10, 007, 29.99);

        tjMaxx.addOnSaleItem(shoes);
        tjMaxx.addRegularItem(sneakers);
        tjMaxx.addRegularItem(joggers);

        System.out.println(tjMaxx.getAllItemNames());

        tjMaxx.buyItem(8999);

        System.out.println(tjMaxx.getAllItemNames());

        tjMaxx.removeItem(007);

        System.out.println(tjMaxx.getAllItemNames());


        System.out.println(tjMaxx.getOnSaleItem("shoes"));

        System.out.println(tjMaxx.getItemPrice(8999));



    }
}
