package Exam1Review;

public abstract class Animal
{
    private int speed;
    private final int staminaCapacity;
    private int stamina;
    private int distance;
    final int LOSE_FIVE_STAMINA = 5;

    public Animal(int speed, int staminaCapacity)
    {
        this.speed = speed;
        this.staminaCapacity = staminaCapacity;
        this.distance = 0;
        this.stamina = staminaCapacity;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;

    }

    public void setStamina(int stamina)
    {
        this.stamina = stamina;
    }

    public int getStamina() {
        return this.stamina;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getDistance()
    {
        return this.distance;
    }

    public int run()
    {
        //not enough speed so need to wait
        //one unit of time to recover the 1/2 the stamina
//       if(this.stamina < this.speed){
//           this.stamina = this.staminaCapacity/2;
//           return  0; //the animal didnt move so the distance remains the same
//       }
        if(stamina<=0) {
            this.stamina = this.staminaCapacity/2;
            return 0;
        }

       this.stamina-=this.LOSE_FIVE_STAMINA;
       this.distance+=this.speed;
       return speed;
    }





}
