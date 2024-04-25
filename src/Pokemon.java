import java.util.ArrayList;

public class Pokemon {
    //Instance Variables
    private String name;
    private int hp;
    // ArrayList with the type 'Move'
    private ArrayList<Move> moveArrayList = new ArrayList<>();

    //Constructor
    // used to initialize the values
    public Pokemon(String name, int hp){
        this.name = name;
        this.hp = hp;
    }
    // Methods
    //getters for the Name, HitPoint and ArrayList
    public String getName(){

        return name;
    }
    public int getHp(){

        return hp;
    }

    // Return arraylist moves.
    public ArrayList<Move> getMoveArrayList(){

        return moveArrayList;
    }

    // Using the Built-in .add() method from arrayList to
    // add the moves into the arrayList
    public void addMove(Move move){
        moveArrayList.add(move);
    }
    // Using the Built-in .remove() method from arrayList to
    // remove the move out of the arrayList
    public void removeMove(Move move){
        moveArrayList.remove(move);
    }

    // Searches the moveArrayList for the Move object
    // which matches the name and returns it.
    // if no match move name is found it returns null.
    // This method is for getting the specific moves of a Pokemon by name.
    public Move getMove(String moveName){
        Move foundMove = null;
        //enhanced for loop
        for(Move move: moveArrayList){
            if(move.getMoveName().equals(moveName)){
                foundMove = move;
                break;
            }
        }
        return foundMove;
    }

    //one form of polymorphism
    @Override
    public String toString(){

        return String.format("Name: %s\nHP: %d\n",name,hp);
    }

}
