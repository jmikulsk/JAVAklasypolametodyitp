package test;

public class MarsRobot {
    String status;
    int speed;
    int power;


    MarsRobot(String status,int speed,int power )
    {
        this.power = power;
        this.speed =speed;
        this.status =status;
    }



    public static void main(String[] args) {
        MarsRobot marsRobot = new MarsRobot("eksploracja",3,20);
        System.out.println(marsRobot.power);

    }
}
