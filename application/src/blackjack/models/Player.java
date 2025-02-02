package blackjack.models;

/**
 * Player class representing each player and stats
 * @author Tor Falkenberg
 * @Version 1.3
 */
public class Player {

    //Variables
    private String name;
    private double money;

    //Constructors
    public Player() {
        money = 1000;
    }
    public Player(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public double getBalance() { return money; }
    public void changeBalance(double change) { this.money += change; }
    public String getName() { return name; }

}
