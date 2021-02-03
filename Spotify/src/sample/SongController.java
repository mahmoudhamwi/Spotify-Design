package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Song;

/**
 * Created by Mahmoud Hamwi on 02-Feb-21.
 */
public class SongController {
    @FXML
    private ImageView img;

    @FXML
    private Label songName;

    @FXML
    private Label artist;

    public void setData(Song song){
        Image image = new Image(getClass().getResourceAsStream(song.getCover()));
        img.setImage(image);
        songName.setText(song.getName());
        artist.setText(song.getArtist());
    }
}
