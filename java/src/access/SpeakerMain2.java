package amiddle.access;

public class SpeakerMain2 {

    public static void main(String[] args) {
        Speaker2 speaker2 = new Speaker2(90);
        speaker2.showVolume();
        speaker2.volumeUp();
        speaker2.showVolume();
        speaker2.volumeUp();
        speaker2.showVolume();

        System.out.println("volume 필드 직접 접근 수정");
//        speaker2.volume = 200; -> 실패
        speaker2.showVolume();
    }
}
