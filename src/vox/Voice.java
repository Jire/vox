package vox;

/**
 * A voice is used to play text as synthesized audio.
 * 
 * @author Thomas G. P. Nappo
 */
public interface Voice {

	/**
	 * Plays the specified text as synthesized audio.
	 * @param text The text to speak.
	 */
	public void speak(String text);

	/**
	 * Sets the pitch of the voice.
	 * @param pitch The new voice pitch.
	 * @throws IllegalArgumentException If the specified voice
	 * pitch is less than <tt>0</tt>.
	 */
	public void setPitch(int pitch);

	/**
	 * Sets the volume of the voice.
	 * @param volume The new volume.
	 * @throws IllegalArgumentException If the specified voice
	 * volume is less than <tt>0</tt> or greater than <tt>100</tt>.
	 */
	public void setVolume(int volume);

	/**
	 * Sets the talk speed of the voice.
	 * @param wpm The new talk speed in words per minute.
	 * @throws IllegalArgumentException If the specified voice
	 * speed is less than <tt>0</tt> or greater than <tt>999</tt>.
	 */
	public void setSpeed(int wpm);

}