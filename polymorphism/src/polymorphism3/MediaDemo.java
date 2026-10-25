package polymorphism3;

public class MediaDemo {

	public static void main(String[] args) {
		MediaController mediaController = new MediaController();
        
		MediaContent audioTrack = new AudioTrack();
		AudioTrack a = (AudioTrack)audioTrack;
		a.adjustVolume();
		mediaController.startPlayback(audioTrack);
		VideoClip videoClip = new VideoClip();
		mediaController.startPlayback(videoClip);
	}

}
