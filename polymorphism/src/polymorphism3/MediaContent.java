package polymorphism3;

public class MediaContent {
	public void play() {
		System.out.println("Playing media");
	}
}
class AudioTrack extends MediaContent{
	@Override
	public void play() {
		System.out.println("Playing audio");
	}
	public void adjustVolume() {
		System.out.println("Audio volume adjusted");
	}
}
class VideoClip extends MediaContent{
	@Override
	public void play() {
		System.out.println("Playing video");
	}
}