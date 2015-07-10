package org.jointheleague.enums;

import static org.junit.Assert.*;

import org.junit.Test;

public class DirectionTest {

    @Test
    public void testNames() {
	assertEquals("NORTH", Direction.values()[0].toString());
	assertEquals("EAST", Direction.values()[1].toString());
	assertEquals("SOUTH", Direction.values()[2].toString());
	assertEquals("WEST", Direction.values()[3].toString());
	assertEquals(4, Direction.values().length);
    }
    
    @Test
    public void testGetLeft() {
	assertEquals(Direction.WEST, Direction.NORTH.getLeft());
	assertEquals(Direction.NORTH, Direction.EAST.getLeft());
	assertEquals(Direction.EAST, Direction.SOUTH.getLeft());
	assertEquals(Direction.SOUTH, Direction.WEST.getLeft());
    }
    
    @Test
    public void testGetRight() {
	assertEquals(Direction.EAST, Direction.NORTH.getRight());
	assertEquals(Direction.SOUTH, Direction.EAST.getRight());
	assertEquals(Direction.WEST, Direction.SOUTH.getRight());
	assertEquals(Direction.NORTH, Direction.WEST.getRight());
    }
    
    
    @Test
    public void testGetDeltaRow() {
	assertEquals(-1, Direction.NORTH.getDeltaRow());
	assertEquals(0, Direction.EAST.getDeltaRow());
	assertEquals(1, Direction.SOUTH.getDeltaRow());
	assertEquals(0, Direction.WEST.getDeltaRow());

    }

    @Test
    public void testGetDeltaCol() {
	assertEquals(0, Direction.NORTH.getDeltaCol());
	assertEquals(1, Direction.EAST.getDeltaCol());
	assertEquals(0, Direction.SOUTH.getDeltaCol());
	assertEquals(-1, Direction.WEST.getDeltaCol());

    }
}
