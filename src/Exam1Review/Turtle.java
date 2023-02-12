package Exam1Review;
import java.util.Random;

public class Turtle extends Animal
{
    final int FIFTY_PERCENT_CHANCE = 50;
    final int LOSE_ALL_STAMINA = 0;
    public Turtle(int speed, int staminaCapacity) {
        super(speed, staminaCapacity);
    }

    /**
     * @return 
     */
    @Override
    public int run()
    {
        //Every me it runs, there’s a 50% chance that it will lose
        //all its stamina.
        if(this.isChance(FIFTY_PERCENT_CHANCE)){
            System.out.println("Ah bummer, this is a 50% chance and the turtle lose all its stamina");
            super.setStamina(LOSE_ALL_STAMINA);
        }

        return super.run();
    }

    public boolean isChance(int chance)
    {
        Random random = new Random();
        //converting the chance in the format of 0.50 instead of50
        double chanceFraction = chance / 100.0;

        return random.nextDouble() < chanceFraction;
    }
}
