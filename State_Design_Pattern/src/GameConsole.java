/**
 * @author Matt Duggan
 * 
 * The setup of different states. This acts as a simplified if/else statement, but the 
 * states are all interconnected through this console. 
 */
public class GameConsole {
	private State HomeState;
	private State NintendoState;
	private State XBoxState;
	private State state;
	
	/**
	 * The constructor for the game consoles. This sets up the different states and 
	 * starts the console in the home state. 
	 */
	public GameConsole() {
		System.out.println("Starting up the Game Console\n");
		NintendoState = new NintendoState(this);
		XBoxState = new XBoxState(this);
		HomeState = new HomeState(this);
		state = HomeState;
		
	}
	
	/**
	 * This sets the state to the Home state which is defined in each state. 
	 */
	public void pressHomeButton() {
		state.pressHomeButton();
	} 
	
	/**
	 * This sets the state to the Nintendo state which is defined in each state. 
	 */
	public void pressNintendoButton() {
		state.pressNintendoButton();
	}
	
	/**
	 * This sets the state to the XBox state which is defined in each state. 
	 */
	public void pressXBoxButton() {
		state.pressXBoxButton();
	}
	
	/**
	 * This starts the console that the state is currently set too. If in the home state
	 * it will ask for you to choose one. 
	 */
	public void pressGameButton() {
		state.pressGameButton();
	}
	
	/**
	 * This sets the state to either Nintendo, XBox, or Home. 
	 * @param state The console the user wishes to activate. 
	 */
	public void setState(State state) {
		this.state = state;
	}
	
	/**
	 * Getter for the Home state.
	 * @return The current HomeState
	 */
	public State getHomeState() {
		return HomeState;
	}
	
	/**
	 * Getter for the Nintendo State
	 * @return The current Nintendo State. 
	 */
	public State getNintendoState() {
		return NintendoState;
	}
	
	/**
	 * Getter for the Xbox state.
	 * @return The current Xbox state.
	 */
	public State getXBoxState() {
		return XBoxState;
	}
	
	
	



}
