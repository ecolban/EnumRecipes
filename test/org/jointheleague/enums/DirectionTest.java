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
    public void testGetRowIncrement() {
	assertEquals(-1, Direction.NORTH.getRowIncrement());
	assertEquals(0, Direction.EAST.getRowIncrement());
	assertEquals(1, Direction.SOUTH.getRowIncrement());
	assertEquals(0, Direction.WEST.getRowIncrement());

    }

    @Test
    public void testGetColumnIncrement() {
	assertEquals(0, Direction.NORTH.getColumnIncrement());
	assertEquals(1, Direction.EAST.getColumnIncrement());
	assertEquals(0, Direction.SOUTH.getColumnIncrement());
	assertEquals(-1, Direction.WEST.getColumnIncrement());

    }
}
