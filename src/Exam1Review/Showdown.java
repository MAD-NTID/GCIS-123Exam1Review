package Exam1Review;

public class Showdown
{
    Animal[] competitors;
    Animal winner;

    public Showdown(Animal[] competitors)
    {
        this.competitors = competitors;
    }

    public void race()
    {
        System.out.println("The competitors are at the starting line.\nCompetitors:");
        for(Animal competitor: competitors){
            String name = competitor.getClass().getName();
            System.out.println(String.format("%s speed:%s, stamina:%s",name,competitor.getSpeed(), competitor.getStamina()));
        }


        while(!this.hasWinner()){

            for(Animal competitor: competitors)
            {
                String name = competitor.getClass().getName();
                int run = competitor.run();
                int distance = competitor.getDistance();

                System.out.println(String.format("%s move %s. The total distance ran: %s", name,run,distance));
            }
        }

        System.out.print("The winner is:"+ winner.getClass().getName());
    }

    public boolean hasWinner()
    {
        for(Animal competitor: competitors){
            if(competitor.getDistance()>=500){
                winner = competitor;
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args)
    {
        Animal[] competitors = {
                new Turtle(10, 50),
                new Rabbit(30, 10),
                new Boar(15,20)
        };

        Showdown faceOff = new Showdown(competitors);
        faceOff.race();
    }


}
