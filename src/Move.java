public class Move {

    //Instance variables
    private String moveName;
    private int movePower;
    private int moveSpeed;

    // Constructor
    // used to initialize the values
    public Move(String moveName, int movePower, int moveSpeed){

        this.moveName = moveName;
        this.movePower = movePower;
        this.moveSpeed = moveSpeed;
    }

    //Methods
    public String getMoveName()
    {
        return moveName;
    }
    public int getMovePower(){
        return movePower;
    }
    public int getMoveSpeed(){
        return moveSpeed;
    }
    //one form of polymorphism
    //returns the string information of the moveName,movePower and moveSpeed
    @Override
    public String toString(){
        /*return String.format("Move: %s\n" +
                "Power: %d\n"+
                "Speed: %d\n", moveName,movePower,moveSpeed);*/

        return String.format("Move: %s\nPower: %d\nSpeed: %d\n", moveName,movePower,moveSpeed);
    }
}
