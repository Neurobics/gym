package neurobics.gym.katas.harrypotter;

import org.junit.Assert;
import org.junit.Test;

/**
 To try and encourage more sales of the 5 different Harry
 Potter books they sell, a bookshop has decided to offer
 discounts of multiple-book purchases.

 One copy of any of the five books costs 8 EUR.

 If, however, you buy two different books, you get a 5%
 discount on those two books.

 If you buy 3 different books, you get a 10% discount.

 If you buy 4 different books, you get a 20% discount.

 If you go the whole hog, and buy all 5, you get a huge 25%
 discount.

 Note that if you buy, say, four books, of which 3 are
 different titles, you get a 10% discount on the 3 that
 form part of a set, but the fourth book still costs 8 EUR.

 Your mission is to write a piece of code to calculate the
 price of any conceivable shopping basket (containing only
 Harry Potter books), giving as big a discount as possible.

 For example, how much does this basket of books cost?

 2 copies of the first book
 2 copies of the second book
 2 copies of the third book
 1 copy of the fourth book
 1 copy of the fifth book

 Answer: 51.60 EUR

 */
public class HarryPotterTest {


    @Test
    public void oneBook() {
        Basket basket = new Basket();
        basket.put(HarryPotterBook.CHAMBER_OF_SECRETS, 1);
        double actual = new FlourishAndBlotts().buy(basket);
        double expected = 8;
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void twoBooks() {
        Basket basket = new Basket();
        basket.put(HarryPotterBook.CHAMBER_OF_SECRETS, 1);
        basket.put(HarryPotterBook.GOBLET_OF_FIRE, 1);
        double actual = new FlourishAndBlotts().buy(basket);
        double expected = 15.2;
        Assert.assertEquals(expected, actual, 0.001);
    }


    @Test
    public void allUnique() {
        Basket basket = new Basket();
        basket.put(HarryPotterBook.PHILOSPHERS_STONE, 1);
        basket.put(HarryPotterBook.CHAMBER_OF_SECRETS, 1);
        basket.put(HarryPotterBook.PRISONER_OF_AZKABAN, 1);
        basket.put(HarryPotterBook.GOBLET_OF_FIRE, 1);
        basket.put(HarryPotterBook.ORDER_OF_THE_PHOENIX, 1);
        double actual = new FlourishAndBlotts().buy(basket);
        double expected = 30.0;
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void allUniqueAllUnique() {
        Basket basket = new Basket();
        basket.put(HarryPotterBook.PHILOSPHERS_STONE, 2);
        basket.put(HarryPotterBook.CHAMBER_OF_SECRETS, 2);
        basket.put(HarryPotterBook.PRISONER_OF_AZKABAN, 2);
        basket.put(HarryPotterBook.GOBLET_OF_FIRE, 2);
        basket.put(HarryPotterBook.ORDER_OF_THE_PHOENIX, 2);
        double actual = new FlourishAndBlotts().buy(basket);
        double expected = 60.0;
        Assert.assertEquals(expected, actual, 0.001);
    }



    @Test
    public void testExample() {
        Basket basket = new Basket();
        basket.put(HarryPotterBook.PHILOSPHERS_STONE, 2);
        basket.put(HarryPotterBook.CHAMBER_OF_SECRETS, 2);
        basket.put(HarryPotterBook.PRISONER_OF_AZKABAN, 2);
        basket.put(HarryPotterBook.GOBLET_OF_FIRE, 1);
        basket.put(HarryPotterBook.ORDER_OF_THE_PHOENIX, 1);

        double actual = new FlourishAndBlotts().buy(basket);
        double expected = 51.60;

        Assert.assertEquals(expected, actual, 0.001);
    }

}
