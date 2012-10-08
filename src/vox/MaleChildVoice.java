package vox;

/**
 * A male child voice with a pitch of <tt>160</tt>
 * and a speed of <tt>160 words per minute</tt>.
 * 
 * @author Thomas G. P. Nappo
 */
public final class MaleChildVoice extends DefaultVoice {

	/**
	 * Constructs a new male child voice.
	 */
	public MaleChildVoice() {
		super();

		setPitch(160);
		setSpeed(160);
	}

}