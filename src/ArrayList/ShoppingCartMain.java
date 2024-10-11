package ArrayList;

public class ShoppingCartMain {
    public static void main(String[] args) {

        //Opretter nogle varer

        Item mælk = new Item("mælk", 10);
        Item honning = new Item("honning", 30);
        Item kaffe = new Item("kaffe", 49.95);

        //Opretter ordrelinjer

        Ordrelinje number1 = new Ordrelinje(mælk, 4);


        //Opretter indkøbskurv

        ShoppingCart cart = new ShoppingCart();

        // Tilføj ordrelinjer til kurven
        cart.nyOrdrelinje(number1);

        System.out.println(number1);



    }
}
