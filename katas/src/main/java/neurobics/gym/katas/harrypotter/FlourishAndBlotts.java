package neurobics.gym.katas.harrypotter;

public class FlourishAndBlotts {

    public double buy(Basket basket) {
//        basket
//        basket.entrySet().size() == HarryPotterBook.values().length

        return ((8*5)-((8*5)*.25))+((8*3)- (8*3)*.1);
    }

    private double discountBy(double amount, double percentage) {
        return amount - amount * percentage;
    }

}
