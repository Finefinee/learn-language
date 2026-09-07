package amiddle.access;

public class SpeakerMain1 {

    public static void main(String[] args) {
        Speaker1 speaker1 = new Speaker1(90);
        speaker1.showVolume();
        speaker1.volumeUp();
        speaker1.showVolume();
        speaker1.volumeUp();
        speaker1.showVolume();

        System.out.println("volume 필드 직접 접근 수정");
        speaker1.volume = 200;
        speaker1.showVolume();
    }
}
