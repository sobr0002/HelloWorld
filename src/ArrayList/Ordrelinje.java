package ArrayList;

public class Ordrelinje {
//hitter pris og varenavn
    private Item vare;
    private int amount;


    public Ordrelinje(Item vare, int amount) { //constructor initialiserer instansvariablerne
        this.amount = amount;
        this.vare = vare;

    }
    //beregner samlet pris for ordrelinjen
    public double totalPrice() {
        return vare.getPrice() * amount;

    }
    @Override
    public String toString() {
        return "Du har " + amount + "x " + vare.getName() + " til hver " + vare.getPrice() +" kr. \n"+
                "Du har i alt købt for " + totalPrice() + " kr.";


    }
}
