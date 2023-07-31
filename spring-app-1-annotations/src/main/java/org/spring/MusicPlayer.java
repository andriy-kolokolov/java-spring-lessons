package org.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String songName;
    private int volume;
    private Music music1;
    private Music music2;
    private Music music3;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2,
                       @Qualifier("rapMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public void init() {
        System.out.println(this.getClass().getSimpleName() + ": initialization");
    }

    public void destroy() {
        System.out.println(this.getClass().getSimpleName() + ": destruction");
    }

    public void playMusic() {
        System.out.println("Playing " + music1.getSong() + "\nPlaying " + music2.getSong() + "\nPlaying " + music3.getSong());
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
