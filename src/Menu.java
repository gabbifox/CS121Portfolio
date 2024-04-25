import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private Pokedex pokedex = new Pokedex();

    public void displayMenu(){
        while(true){
            String selection;
            System.out.printf("\n%s MENU %s\n", "*".repeat(9), "*".repeat(9));
            System.out.print("Please make a selection: \n" +
                    "1) Add a Pokemon\n" +
                    "2) Remove a Pokemon\n" +
                    "3) Display a Pokemon Info\n" +
                    "4) Display All Pokemon Info\n" +
                    "5) Exit\n"+
                    ">> " );

            selection  = scanner.nextLine();

            if(selection.equals("1")){
                createPokemon();
            }
            else if(selection.equals("2")){
                deletePokemon();
            }
            else if(selection.equals("3")){
                displayPokemon();
            }
            else if(selection.equals("4")){
                displayAllPokemon();
            }
            else if(selection.equals("5")){
                System.out.println("Exiting..........");
                break;
            }
            else{
                System.out.println("Invalid Entry");
            }
        }
    }

    private void createPokemon(){
        //asks name and hp of pokemon
        String name;
        int hp;
        Pokemon pokemon;
        String moveName;
        int movePower,moveSpeed;
        Move move;

        System.out.print("Enter Pokemon name:");
        name = scanner.nextLine();
        System.out.print("Enter Pokemon's hp: ");
        hp = Integer.parseInt(scanner.nextLine());


        //creates an instance of new pokemon based on user input
        pokemon = new Pokemon(name,hp);
        System.out.printf("Enter Moves for %s.\n", name);
        //adds pokemon to Pokedex array list



        while(true){
            System.out.print("\tEnter a Move name or q if finished: ");
            moveName = scanner.nextLine();
            if(moveName.equals("q")){
                break;
            }
                System.out.print("Enter move's power: ");
                movePower = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter move's speed: ");
                moveSpeed = Integer.parseInt(scanner.nextLine());

                move = new Move(moveName, movePower, moveSpeed);
                pokemon.addMove(move);
        }
        pokedex.addPokemon(pokemon);
        System.out.printf("%s added to the Pokedex\n\n", name);
    }

    public void deletePokemon(){
        String name;
        Pokemon pokemon;
        System.out.print("Enter the name of the Pokemon you would like to delete: ");
        name = scanner.nextLine();

        pokemon = pokedex.getPokemon(name);

        if(pokemon == null){
            System.out.println("Pokemon not found");
        }
        else{
            pokedex.removePokemon(pokemon);
            System.out.printf("%s removed from Pokedex\n", name);
        }
    }

    public void displayPokemon(){
        String name;
        Pokemon pokemon;
        System.out.print("Enter the name of the Pokemon that you would like their information displayed: ");
        name = scanner.nextLine();
        pokemon = pokedex.getPokemon(name);
        if(pokemon == null){
            System.out.println("Pokemon not found.");
        }
        else{
            System.out.println(pokemon.toString());
        }
    }

    public void displayAllPokemon(){
        ArrayList<Pokemon> pokemonArrayList = pokedex.getPokemonArrayList();
        for(int i = 0; i <pokemonArrayList.size(); i++){
            System.out.printf("%d. %s\n\n", i + 1, pokemonArrayList.get(i));
        }
    }

}
