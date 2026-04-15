package PatronesEjercicio3;

import java.util.ArrayList;
import java.util.List;
//CLIENT
public class MediaPlayer {
    private List<Media>  media;

    public MediaPlayer(){
        this.media= new ArrayList<>();
    }
    public void addMedia(Media media) {
        this.media.add(media);
    }
    public void play() {
        this.media.stream()
        .forEach(media -> media.play());
    }
}
