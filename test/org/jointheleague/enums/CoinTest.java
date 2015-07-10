package org.jointheleague.enums;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.jointheleague.enums.Coin;
import org.junit.Test;

public class CoinTest {

    @Test
    public void testNames() {
	assertEquals("PENNY", Coin.values()[0].toString());
	assertEquals("NICKEL", Coin.values()[1].toString());
	assertEquals("DIME", Coin.values()[2].toString());
	assertEquals("QUARTER", Coin.values()[3].toString());
	assertEquals(4, Coin.values().length);
    }

    @Test
    public void testValues() {
	assertEquals(1, Coin.PENNY.getValue());
	assertEquals(5, Coin.NICKEL.getValue());
	assertEquals(10, Coin.DIME.getValue());
	assertEquals(25, Coin.QUARTER.getValue());
    }

    @Test
    public void testSortable() {
	Random rng = new Random();
	List<Coin> coins = new ArrayList<>();
	for (int i = 0; i < 1000; i++) {
	    coins.add(Coin.values()[rng.nextInt(4)]);
	}
	Collections.sort(coins);
	for (int i = 0, j = 1; j < 1000; i++, j++) {
	    assertTrue(coins.get(i).compareTo(coins.get(j)) <= 0);
	}

    }

    @Test
    public void testGetChangeRandom() {
	Random rng = new Random();
	for (int n = 0; n <= 20; n++) {
	    int money =rng.nextInt(100) + 1;
	    Map<Coin, Integer> change = Coin.getChange(money);
	    int total = 0;
	    for (Coin c : Coin.values()) {
		total += change.get(c).intValue() * c.getValue();
	    }
	    assertEquals(money, total);
	}
    }

    @Test
    public void testGetChange() {
	Map<Coin, Integer> change = Coin.getChange(93);
	assertEquals(Integer.valueOf(3), change.get(Coin.QUARTER));
	assertEquals(Integer.valueOf(1), change.get(Coin.DIME));
	assertEquals(Integer.valueOf(1), change.get(Coin.NICKEL));
	assertEquals(Integer.valueOf(3), change.get(Coin.PENNY));
    }

}
