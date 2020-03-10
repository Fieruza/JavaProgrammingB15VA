package day52_interface;

public interface VideoCallable extends VoiceCallable, ScreenSharable {

    public abstract void videoCall();
}
