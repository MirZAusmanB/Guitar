import java.util.ArrayList;
import java.util.Iterator;

public class Guitar2 {

    private ArrayList<Guitar> guitars = new ArrayList<>();

    public boolean checkId(String id){
        for (Guitar guitar : guitars) {
            if (guitar.getId().equals(id)) {
                return false; // Return false if ID already exists
            }
        }
        return true;
    }

    public void addGuitar(Guitar guitar) {
        if(checkId(guitar.getId())) {
            guitars.add(guitar);
        } else {
            System.out.println("This ID already exists! Try again.");
        }
    }

    public void searchType(String type){
        boolean found = false;
        for(Guitar guitar : guitars){
            if(guitar.getType().equalsIgnoreCase(type)){
                System.out.println(guitar.getId() + " " + guitar.getMake() + " " + guitar.getModel() + " - $" + guitar.getPrice());
                found = true;
            }
        }
        if(!found)
            System.out.println("No matches found for type: " + type);
    }


    public void buyGuitar(String id) {
        Iterator<Guitar> iterator = guitars.iterator();
        while (iterator.hasNext()) {
            Guitar guitar = iterator.next();
            if (guitar.getId().equals(id)) {
                System.out.println("Guitar with id " + id + " bought successfully for " + guitar.getPrice());
                iterator.remove();
                return;
            }
        }
        System.out.println("No guitar with id " + id + " found.");
    }

    public void showGuitars() {
        System.out.println("List of guitars:");
        for (Guitar guitar : guitars) {
            System.out.println(guitar.getId() + " " + guitar.getType() + " " + guitar.getMake() + " " + guitar.getModel() + " - $" + guitar.getPrice());
        }
    }
}
