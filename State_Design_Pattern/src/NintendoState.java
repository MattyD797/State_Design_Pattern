/**
 * 
 * @author Matt Duggan
 * 
 * This is the Nintendo state where games played on the gameboy, switch and DS are played. 
 */
public class NintendoState implements State{
	private GameConsole gameConsole;
	private String[] games = {"Mario Kart", "Mario Galaxy", "Smash", "Pokemon: Pearl", "Pokemon: Diamond"};
	
	/**
	 * Constructor for the Nintendo state which sets the gameConsole. 
	 * @param gameConsole The current state. 
	 */
	public NintendoState(GameConsole gameConsole) {
		this.gameConsole = gameConsole;
	}
	
	/**
	 * Returns the user to the Home State. 
	 */
	public void pressHomeButton() {
		System.out.println("Display Home Screen...");
		gameConsole.setState(gameConsole.getHomeState());
	}
	
	/**
	 * Displays that the user is already in the Nintendo state. 
	 */
	public void pressNintendoButton() {
		System.out.println("You are already viewing Nintendo");
	}
	
	/**
	 * Displays and sets the state to the XBox state. 
	 */
	public void pressXBoxButton() {
		System.out.println("Starting XBox...");
		gameConsole.setState(gameConsole.getXBoxState());
	}
	
	/**
	 * Prints out the games in the private array that holds the five games of Nintendo. 
	 */
	public void pressGameButton() {
		System.out.println("You have the following games:");
		for(String game : games) {
			System.out.println(game);
		}
		System.out.println();
	}

}
