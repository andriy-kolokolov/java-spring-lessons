package org.spring;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String songName;
    private int volume;

    private MusicPlayer() {};

    public static MusicPlayer getMusicPlayer() {
        return new MusicPlayer();
    }

    public void init() {
        System.out.println(this.getClass().getSimpleName() + ": initialization");
    }

    public void destroy() {
        System.out.println(this.getClass().getSimpleName() + ": destruction");
    }

    public void playMusic() {
        for (Music music :
                this.musicList) {
            System.out.println(music.getSong() + " playing...");
        }
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
