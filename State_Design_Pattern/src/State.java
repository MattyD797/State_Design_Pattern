/**
 * 
 * @author Matt Duggan
 *
 *The methods required to be a state in the Game Console. This allows the states to be used as inteded 
 *and switch between the three states. 
 */
public interface State {
	/**
	 * Sets state to the home state. 
	 */
	public void pressHomeButton();
	/**
	 * Sets the state to the Nintendo state. 
	 */
	public void pressNintendoButton();
	/**
	 * Sets the state to the XBox state.
	 */
	public void pressXBoxButton();
	/**
	 * Shows the game of the state. 
	 */
	public void pressGameButton();
}
