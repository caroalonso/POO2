package PatronesEjercicio3;

//ADAPTER
public class AdapterVideoStream extends Media {

    private VideoStream videoStream = new VideoStream();

    public void play(){
        videoStream.reproduce();
    }
}
