package HomeAssignmentWeek5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @Test
    void testRoll(){
        Dice dice = new Dice(0,0,0);
        dice.roll();
        assertTrue(dice.getDie1() >= 1 && dice.getDie1() <= 6, "Dice 1 is out of range");
        assertTrue(dice.getDie2() >= 1 && dice.getDie2() <= 6, "Dice 2 is out of range");
    }

    @Test
    void testIsDouble(){
        Dice dice = new Dice(3,3,0);
        dice.isDouble();
        assertEquals(3, dice.getDie1());
        assertEquals(3,dice.getDie2());
    }

    @Test
    void testRollUntilDouble(){
        Dice dice = new Dice(0,0,0);
        dice.rollUntilDouble();
        assertTrue(dice.isDouble(),"Dice are not double");
        assertEquals(dice.getDie1(), dice.getDie2(),"dice values are not equal");
    }

}