import java.util.ArrayList;

public class Pokedex {
    // Instance Variable
    private ArrayList<Pokemon> pokemonArrayList = new ArrayList<>();

    // Constructor
    //default constructor : public Pokedex(){} -- DO NOT NEED TO PLACE THIS

    // Methods

    // Using the Built-in .add() method from arrayList to
    // add the pokemon into the arrayList
    public void addPokemon(Pokemon pokemon){
        pokemonArrayList.add(pokemon);
    }
    // Using the Built-in .remove() method from arrayList to
    // remove the pokemon out of the arrayList
    public void removePokemon(Pokemon pokemon){
        pokemonArrayList.remove(pokemon);
    }

    // Returning the ArrayList of pokemons
    public ArrayList<Pokemon> getPokemonArrayList(){
        return pokemonArrayList;
    }
    // Searches the pokemonArrayList for the Pokemon object
    // which matches the name and returns it.
    // if no match pokemon is found it returns null.
    // This method is for getting the specific pokemon details from the Pokedex.
    public Pokemon getPokemon(String pokemonName){
        Pokemon foundPokemon = null;
        for(Pokemon pokemon : pokemonArrayList){
            if(pokemon.getName().equals(pokemonName)){
                foundPokemon = pokemon;
                break;
            }
        }
        return foundPokemon;
    }
}
