package org.jointheleague.enums;

public enum Direction {

    // 1. There are 4 directions: NORTH, EAST, SOUTH, and WEST. List them in this order.
    
    // 4. Imagine you are moving on a rectangular grid. When moving one step NORTH on the grid,
    // the row number will decrease by 1 (i.e., deltaRow = -1) and the column number will
    // increase by 0 (i.e, deltaColumn = 0). Write a constructor that takes the row delta
    // and column delta as arguments. Update the listing of the four Direction instances from
    // Step 1 by making use of this constructor.

    // 5. Write instance methods getDeltaRow() and getDeltaCol() that return the
    // the row and column deltas respectively when moving in the direction of this instance.

    // 2. If you make a right turn while heading NORTH, you'll be heading EAST.
    // Write a method getRight() that returns the direction after making a right turn.
    // When writing this method, use the fact that the directions are listed in the order
    // prescribed in Step 1. Hint: use the static method Directions.values() and
    // the instance method ordinal().

    // 3. If you make a left turn while heading NORTH, you'll be heading WEST.
    // Write a method getLeft() that returns the direction after making a left turn.
    // When writing this method, use the fact that the directions are listed in the order
    // prescribed in Step 1.

    // Optional: Create an app that shows a maze on a rectangular grid, and traces a "robot"
    // that moves like a right wall hugger.

}
