package org.jointheleague.enums;

import java.util.HashMap;
import java.util.Map;

public enum Coin {
    // 1. There are 4 coins: PENNY, NICKEL, DIME, QUARTER. Add them to this enum.

    // 2. Each coin has a value of type int, which never changes; 1 for PENNY, 5 for NICKEL, etc. 
    // Create a constructor takes the value of the coin as argument. Apply this constructor in 
    // Step 1.

    public int getValue() {
	JOptionPane.
	// 3. Fill in. This method should return the value of the coin.
    }
    
    
    public static Map<Coin, Integer> getChange(int money) {
	Map<Coin, Integer> change = new HashMap<>();
	// 4. Fill in. The returned value is a map that tells you how many of each coin should be 
	// returned in exchange for money. As few coins as possible should be returned. 
	// For example, if money == 15, then 1 DIME and 1 NICKEL should be 
	// returned rather than 2 NICKEL(s) and 5 PENNY(s). 

	return change;
    }

}
