package vox;

import com.sun.speech.freetts.VoiceManager;

public class DefaultVoice implements Voice {

	private static final String DEFAULT_VOICE = "kevin16";

	private final com.sun.speech.freetts.Voice backing;

	public DefaultVoice(String voiceName) {
		this.backing = VoiceManager.getInstance().getVoice(voiceName);
		this.backing.allocate();
	}

	public DefaultVoice() {
		this(DEFAULT_VOICE);
	}

	protected final com.sun.speech.freetts.Voice getBacking() {
		return backing;
	}

	@Override
	public void speak(String text) {
		getBacking().speak(text);
	}

	@Override
	public void setPitch(int pitch) {
		if (pitch < 0) {
			throw new IllegalArgumentException("The minimum voice pitch is 0!");
		}

		getBacking().setPitchShift(pitch / 100F);
	}

	@Override
	public void setVolume(int volume) {
		if (volume < 0) {
			throw new IllegalArgumentException("The minimum voice volume is 0!");
		} else if (volume > 100) {
			throw new IllegalArgumentException("The maximum voice volume is 100!");
		}

		getBacking().setVolume(volume / 100F);
	}

	@Override
	public void setSpeed(int wpm) {
		if (wpm < 1) {
			throw new IllegalArgumentException("The minimum voice speed is 1!");
		} else if (wpm > 999) {
			throw new IllegalArgumentException("The maximum voice speed is 999!");
		}

		getBacking().setRate(wpm);
	}

}