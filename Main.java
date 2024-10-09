public class Main
{
    public static void main(String[] args)
    {
        String info;
        Scoreboard game = new Scoreboard("Red","Blue");
        //test cases
        info = game.getScore();     //Start game
        System.out.println(info);

        game.recordPlay(1);     //Red earns point
        info = game.getScore();
        System.out.println(info);

        game.recordPlay(0);     //Red fails, switch team
        info = game.getScore();
        System.out.println(info);

        game.recordPlay(3);     //Blue earns 3 points
        info = game.getScore();
        System.out.println(info);
        
        game.recordPlay(1);     //Blue earns 1 point
        info = game.getScore();
        System.out.println(info);

        game.recordPlay(0);     //Blue fails, switches to red
        info = game.getScore();
        System.out.println(info);

        game.recordPlay(0);     //Red fails, switches to blue
        info = game.getScore();
        System.out.println(info);

        game.recordPlay(4);     //Blue scores 4 points
        info = game.getScore();
        System.out.println(info);

        game.recordPlay(0);     //Switches to red
        info = game.getScore();
        System.out.println(info);
    }
}
