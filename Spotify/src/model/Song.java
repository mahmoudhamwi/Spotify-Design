package model;

/**
 * Created by Mahmoud Hamwi on 02-Feb-21.
 */
public class Song {
    private String cover;
    private String name;
    private String artist;

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
