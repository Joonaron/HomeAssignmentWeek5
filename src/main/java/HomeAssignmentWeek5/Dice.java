

package HomeAssignmentWeek5;

public class Dice {
    public int die1;
    public int die2;
    public int timesRolled;

    public Dice(int die1, int die2, int timesRolled){
        this.die1 = die1;
        this.die2 = die2;
        this.timesRolled = timesRolled;
    }
    public void roll(){
        die1 = (int) (Math.random() * 6) + 1;
        die2 = (int) (Math.random() * 6) + 1;
    }
    public boolean isDouble(){
        return die1 == die2;
    }

    public void rollUntilDouble(){
        do {
            roll();
            System.out.println("Dice 1: " + getDie1() +" "+ "Dice 2: " + getDie2());
            timesRolled++;
        } while (!isDouble());
        System.out.println("You rolled a double!");
        System.out.println("You rolled the dice " + getTimesRolled() + " times until you got a double!");
    }
    public int getDie1(){
        return die1;
    }
    public int getDie2(){
        return die2;
    }
    public int getTimesRolled(){
        return timesRolled;
    }
}





