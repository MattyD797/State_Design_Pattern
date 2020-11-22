/**
 * 
 * @author Matt Duggan
 * 
 * This is the XBox state where games played on the Call of Duty, Fallout, and Halo are played. 
 */
public class XBoxState implements State{
	private GameConsole gameConsole;
	private String[] games = {"Call of Duty", "Halo", "Fallout", "Assasins Creed", "FIFA"};
	
	/**
	 * This sets the game console to the current GameConsole object.
	 * @param gameConsole
	 */
	public XBoxState(GameConsole gameConsole) {
		this.gameConsole = gameConsole;
	}
	
	/**
	 * Displays and sets the state to the home state. 
	 */
	public void pressHomeButton() {
		System.out.println("Display Home Screen...");
		gameConsole.setState(gameConsole.getHomeState());
	}
	
	/**
	 * Displays and sets the current state to Nintendo. 
	 */
	public void pressNintendoButton() {
		System.out.println("Starting Nintendo...");
		gameConsole.setState(gameConsole.getNintendoState());
	}
	
	/**
	Displays that is already the Xbox is the current state. 
	*/
	public void pressXBoxButton() {
		System.out.println("You are already viewing XBox");
	}
	
	/**
	 * Displays all the games in the console. 
	 */
	public void pressGameButton() {
		for(String game : games) {
			System.out.println(game);
		}
		System.out.println();
	}

}
