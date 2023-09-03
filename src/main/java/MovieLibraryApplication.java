import hendlers.MenuHendler;
import hendlers.UserInputHandler;

public class MovieLibraryApplication {
    public static void main(String[] args) {

        MenuHendler.print();
        switch (UserInputHandler.getMenuOptionFromUser()){
            case DISPLAYINFORMATIONABOUTRANDOMMOVIE :
                //to do
                break;
            case DISPLAYACTORMOVIES:
                // to do
                break;
            case QUIT:
                System.out.println("Bye!");
                System.exit(1);
        }
    }
}