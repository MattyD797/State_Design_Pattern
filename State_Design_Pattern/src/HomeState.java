/**
 * 
 * @author Matt Duggan
 *
 *This is the home state of the consoles. This is the intermediate when no console
 *is chosen or when the console is started.
 */
public class HomeState implements State{
	
	private GameConsole gameConsole; 
	
	/**
	 * Constructor for setting the current gameConsole. 
	 * @param gameConsole The state manager. 
	 */
	public HomeState(GameConsole gameConsole) {
		this.gameConsole = gameConsole;
	}
	
	/**
	 * Displays to the user if he selects to go into the home state when he is already in it. 
	 */
	public void pressHomeButton() {
		System.out.println("You are already on the home screen.");
	}
	
	/**
	 * Displays and sets the current state to the Nintendo console. 
	 */
	public void pressNintendoButton() {
		System.out.println("Starting Nintendo...");
		gameConsole.setState(gameConsole.getNintendoState());
	}
	
	/**
	 * Displays and sets the current state to the XBox console. 
	 */
	public void pressXBoxButton() {
		System.out.println("Starting XBox...");
		gameConsole.setState(gameConsole.getXBoxState());
	}
	
	/**
	 * Shows the error that you must pick a game console in order to see the games. 
	 */
	public void pressGameButton() {
		System.out.println("You have to pick a gaming system to play.\n");
	}

}
