package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model.Song;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private HBox recentlyPlayedContainer;

    @FXML
    private HBox favoriteContainer;

    List<Song> recentlyPlayed;
    List<Song> favorites;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        recentlyPlayed = new ArrayList<>(getRecentlyPlayed());
        favorites = new ArrayList<>(getFavorites());

        try {
            for (Song song : recentlyPlayed) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("song.fxml"));

                VBox vBox = fxmlLoader.load();
                SongController songController = fxmlLoader.getController();
                songController.setData(song);

                recentlyPlayedContainer.getChildren().add(vBox);
            }

            for (Song song : favorites) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("song.fxml"));

                VBox vBox = fxmlLoader.load();
                SongController songController = fxmlLoader.getController();
                songController.setData(song);

                favoriteContainer.getChildren().add(vBox);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<Song> getRecentlyPlayed() {
        List<Song> ls = new ArrayList<>();

        Song song = new Song();
        song.setName("In The Name Of Love");
        song.setArtist("Martin Garrix, Bebe Rexha");
        song.setCover("/img/In_the_Name_of_Love.jpeg");
        ls.add(song);

        song = new Song();
        song.setName("Emri Olur");
        song.setArtist("Mustafa Ceceli");
        song.setCover("/img/emri_olur.jpg");
        ls.add(song);

        song = new Song();
        song.setName("You are my sunshine");
        song.setArtist("Jasmin Thompson");
        song.setCover("/img/jasmin_thompson.jpg");
        ls.add(song);

        song = new Song();
        song.setName("On My Way");
        song.setArtist("Alan Walker");
        song.setCover("/img/on_my_way.jpg");
        ls.add(song);

        song = new Song();
        song.setName("Let Me Love You");
        song.setArtist("Justin Biber");
        song.setCover("/img/let_me_love_you.jpg");
        ls.add(song);

        song = new Song();
        song.setName("It Ain't Me");
        song.setArtist("Selena Gomez, Kygo");
        song.setCover("/img/It-Ain-t-Me.jpg");
        ls.add(song);

        song = new Song();
        song.setName("One Dance");
        song.setArtist("Drake, WizKid, Kyla");
        song.setCover("/img/one_dance.jpg");
        ls.add(song);

        song = new Song();
        song.setName("Faded");
        song.setArtist("Alan Walker");
        song.setCover("/img/faded.jpg");
        ls.add(song);

        return ls;
    }

    public List<Song> getFavorites(){
        List<Song> ls = new ArrayList<>();

        Song song = new Song();
        song.setName("Mühür");
        song.setArtist("Mustafa Ceceli, Irmak");
        song.setCover("/img/mühür.jpg");
        ls.add(song);

        song = new Song();
        song.setName("Faded");
        song.setArtist("Allan Walker");
        song.setCover("/img/faded.jpg");
        ls.add(song);

        song = new Song();
        song.setName("Señorita");
        song.setArtist("Camila Cabello, Shawn Mendes");
        song.setCover("/img/seniorita.jpg");
        ls.add(song);

        song = new Song();
        song.setName("Can't Help Falling in love");
        song.setArtist("Alvis Presley");
        song.setCover("/img/cant_help_falling_in_love.jpg");
        ls.add(song);

        song = new Song();
        song.setName("Friend");
        song.setArtist("Justin Biber");
        song.setCover("/img/friendjpg.jpg");
        ls.add(song);

        song = new Song();
        song.setName("No Time To Die");
        song.setArtist("Billie Eilish");
        song.setCover("/img/no_time_to_die.jpg");
        ls.add(song);

        song = new Song();
        song.setName("Emri Olur");
        song.setArtist("Mustafa Ceceli");
        song.setCover("/img/emri_olur.jpg");
        ls.add(song);

        song = new Song();
        song.setName("Wolves");
        song.setArtist("Selena Gomez, Marshmello");
        song.setCover("/img/wolves.jpg");
        ls.add(song);

        return ls;
    }
}
