package Exam1Review;

public abstract class Animal
{
    private int speed;
    private final int staminaCapacity;
    private int stamina;
    private int distance;
    final int LOSE_FIVE_STAMINA = 5;
    private String log;

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

    public boolean hasEnoughStamina()
    {
        return this.stamina > 0 && (this.stamina-LOSE_FIVE_STAMINA) >=0;
    }

    public int run()
    {
        String name = this.getClass().getName(); //we can get the animal name by getting the class's name

        //not enough speed so need to wait a unit a time to recharge to half the capability
        if(!this.hasEnoughStamina()){
            
            int notEnough = this.stamina;
            this.stamina = this.staminaCapacity / 2;
            this.log = String.format("%s doesnt have enough stamina(%s). %s will wait for the stamina to recharge to %s", name,notEnough, name, stamina);
            
            //the animal doesnt move
            return 0;
        }

       this.stamina-=this.LOSE_FIVE_STAMINA;
       this.distance+=this.speed;

       this.log = String.format("%s move %s and %s stamina remains. The total distance ran: %s", name,this.speed,this.stamina,this.distance);
       return this.speed;
    }

    @Override
    public String toString()
    {
        return this.log;
    }





}
